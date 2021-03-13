package 泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * projectName：keepLearning
 * name：test
 * description：todo
 * date：2021/3/9 10:12 下午
 * auther：AlexNi
 */
public class test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        // 泛型类
        ObjectTool<String> tool = new ObjectTool<>();
        tool.setObj("ndb");
        String s = tool.getObj();
        System.out.println(s);

        ObjectTool<Integer> tt = new ObjectTool<>();
        tt.setObj(123);
        int a = tt.getObj();
        System.out.println(a);

        // 泛型方法
        ObjectTool<String> yy = new ObjectTool<>();
        yy.show(123);
        yy.show(12.213);
        yy.show("sadsa");

        // 泛型接口
        Inter<String> i = new InterImpl();
        i.show("asd");

        Inter<String> ii = new InterImplA<>();
        ii.show("123");

        List<Object> list = new ArrayList<>();
        list.add("123");
        list.add(1231);
        test(list);

    }
    public static void test(List<Object> list){
        for(int i=0;i<list.size();i++){

            System.out.println(list.get(i));

        }
    }

}
