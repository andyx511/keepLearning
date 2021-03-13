package 泛型;

/**
 * projectName：keepLearning
 * name：InterImplA
 *
 * @description：todo
 * @date：2021/3/13 11:20 下午
 * @author：AlexNi
 */
public class InterImplA<T> implements Inter<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
