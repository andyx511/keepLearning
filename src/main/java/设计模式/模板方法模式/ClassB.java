package 设计模式.模板方法模式;

/**
 * @Classname ClassB
 * @Description TODO
 * @Date 2020/5/22 10:55
 * @Author ALexNi
 */
public class ClassB extends AbstractClass {
    @Override
    public void primitiveOperate1() {
        System.out.println("具体类B方法1的实现");
    }

    @Override
    public void primitiveOperate2() {
        System.out.println("具体类B方法2的实现");
    }
}
