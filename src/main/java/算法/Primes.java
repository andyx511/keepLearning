package 算法;

/**
 * projectName：keepLearning
 * name：Primes
 * description：todo
 * date：2020/8/8 5:43 下午
 * auther：AlexNi
 */


import java.util.ArrayList;
import java.util.List;

public class Primes {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(getPrimes(1000000));
        long end = System.currentTimeMillis();
        System.out.println("最基础的暴力求质数" + (end - start) + "毫秒");

        start = System.currentTimeMillis();
        System.out.println(getPrimes1(1000000));
        end = System.currentTimeMillis();
        System.out.println("带一些优化的暴力求质数" + (end - start) + "毫秒");

        start = System.currentTimeMillis();
        System.out.println(getPrimes2(1000000));
        end = System.currentTimeMillis();
        System.out.println("通过前面求得的质数对后面的质数进行判断" + (end - start) + "毫秒");

        start = System.currentTimeMillis();
        System.out.println(getPrimes3(1000000));
        end = System.currentTimeMillis();
        System.out.println("厄拉多塞筛法" + (end - start) + "毫秒");

        start = System.currentTimeMillis();
        System.out.println(getPrimes4(1000000));
        end = System.currentTimeMillis();
        System.out.println("Bitmap对筛法的空间优化（主要是空间优化，当然也有效率优化）" + (end - start) + "毫秒");


    }

    //最基础的暴力求质数
    public static int getPrimes(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            boolean bool = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                list.add(i);
            }
        }
//            System.out.println(list);
        return list.size();
    }

    //带一些优化的暴力求质数
    public static int getPrimes1(int n) {
        if (n < 3) {
            return 0;
        }
        //从3开始验算，所以初始值为1（2为质数）。
        List<Integer> list = new ArrayList<>();
        list.add(2);
        for (int i = 3; i < n; i++) {
            //当某个数为 2 的 n 次方时（n为自然数），其 & (n - 1) 所得值将等价于取余运算所得值
            //*如果 x = 2^n ，则 x & (n - 1) == x % n
            //if(i % 2 == 0)
            if ((i & 1) == 0) {
                continue;
            }
            boolean bool = true;
            //用 j * j <= i 代替 j <= i 会更好。
            //因为我们已经排除了所有偶数，所以每次循环加二将规避偶数会减少循环次数
            for (int j = 3; j * j <= i; j += 2) {
                if (i % j == 0) {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                list.add(i);
            }
        }
//        System.out.println(list);
        return list.size();
    }

    //通过前面求得的质数对后面的质数进行判断
    public static int getPrimes2(int n) {
        //存放质数得list
        List<Integer> list = new ArrayList<>();
        //求质数从2开始
        for (int m = 2; m < n; m++) {
            //声明一个bool变量，看看是不是在list里面有能被整除得
            boolean isPrime = true;
            //常见得求质数开平方
            int sqrt = (int) Math.sqrt(m);
            //循环list，list里面都是求过得质数
            for (Integer i : list) {
                //如果以前得质数能被n整除，说明n不是质数，false，list不能添加n
                //直接终止循环
                if (m % i == 0) {
                    isPrime = false;
                    break;
                }
                //如果i大于当前这个数得开平方数，证明后面的已经不可能整除了
                if (i > sqrt) {
                    break;
                }
            }
            //如果当前循环内，没有被整除，即为质数，可以加入list，进行下一个循环
            if (isPrime) {
                list.add(m);
            }
        }
//        System.out.println(list);
        return list.size();
    }


    //厄拉多塞筛法
    public static int getPrimes3(int n) {
        List<Integer> list = new ArrayList<>();
        boolean[] bools = new boolean[n];
        for (int i = 2; i < n; i++) {
            // 布尔类型的默认值为 假。所以在此处用了逻辑非（！）操作符。
            if (!bools[i]) {
                list.add(i);
                for (int j = i + i; j < n; j += i) {
                    //只要是i的倍数，就证明不是质数，因为他有其他因子
                    //排除不是质数的数
                    bools[j] = true;
                }
            }
        }
//        System.out.println(list);
        return list.size();
    }


    /*
        Bitmap对筛法的空间优化（主要是空间优化，当然也有效率优化）

        这个的意思就是signs是记录的第几层，每一层分为8个
        也就是int为32字节，每个字节是8个bit
        (i & 31)==(i % 32)
        (1 << (i & 31))这一步是为了满足位数
        signs[i / 32]是为了看第几层
        ((signs[i / 32] & (1 << (i & 31))) == 0证明当前这一层的这一位并没有被记录
        说明当前是个质数

        循环：
        循环中的j就是i的倍数，既然是倍数，就说明他不是质数
        signs[j / 32] |= 1 << (j & 31);
        在看这里，找到j的那一层，然后看j那一层那几位bit，如果有某一位有1存在，那这一位就是1
        二进制下：
        101  |   10    ==      111
    */
    public static int getPrimes4(int n) {
        List<Integer> list = new ArrayList<>();
        //一个 int 变量占用 32 字节
        //如果是在C#中，提供了点阵列（BitArray）数组，那个的可读性会好很多
        int[] signs = new int[n / 32 + 1];
        for (int i = 2; i < n; i++) {
            //将元素和需确定得数字经行按位或运算，如果值改变，说明不存在该数字（未登记该数字），则其为质数。
            //(当某个数为 2 的 n 次方时（n为自然数），其 & (n - 1) 所得值将等价于取余运算所得值)
            //*如果 x = 2^n ，则 x & (n - 1) == x % n
            //下面判断可以写成
            //if ((signs[i / size] & (1 << (i % 32))) == 0)
            if ((signs[i / 32] & (1 << (i & 31))) == 0) {
                list.add(i);
                for (int j = i + i; j < n; j += i) {
                    //登记该数字
                    signs[j / 32] |= 1 << (j & 31);
                }
            }
        }
//        System.out.println(list);
        return list.size();
    }
}

