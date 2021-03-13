package 泛型;

/**
 * projectName：keepLearning
 * name：InterImpl
 *
 * @description：todo
 * @date：2021/3/13 11:17 下午
 * @author：AlexNi
 */
public class InterImpl implements Inter<String> {
    @Override
    public void show(String  t) {
        System.out.println(t);
    }
}
