package 设计模式.模板方法模式;

/**
 * @Classname ClassA
 * @Description TODO
 * @Date 2020/5/22 10:53
 * @Author ALexNi
 */
public class ClassA extends AbstractClass {
    @Override
    public void primitiveOperate1() {
        System.out.println("具体类A方法1的实现");
    }

    @Override
    public void primitiveOperate2() {
        System.out.println("具体类A方法2的实现");
    }
}
