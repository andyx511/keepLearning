package 设计模式.模板方法模式;

/**
 * @Classname AbstractClass
 * @Description TODO
 * @Date 2020/5/22 10:50
 * @Author ALexNi
 */
public abstract class AbstractClass {
    public abstract void primitiveOperate1();
    public abstract void primitiveOperate2();

    public void templateMethod(){
        primitiveOperate1();
        primitiveOperate2();
        System.out.println("");
    }
}
