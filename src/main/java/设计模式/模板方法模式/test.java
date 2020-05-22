package 设计模式.模板方法模式;

/**
 * @Classname test
 * @Description TODO
 * @Date 2020/5/22 10:56
 * @Author ALexNi
 */
public class test {
    public static void main(String[] args) {
        AbstractClass c;
        c = new ClassA();
        c.templateMethod();
        c = new ClassB();
        c.templateMethod();
    }
}
