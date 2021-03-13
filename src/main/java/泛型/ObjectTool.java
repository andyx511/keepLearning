package 泛型;

import java.util.List;

/**
 * projectName：keepLearning
 * name：ObjectTool
 * description：todo 泛型类
 * date：2021/3/13 10:23 下午
 * auther：AlexNi
 */
public class ObjectTool<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public <T> void show(T t) {
        System.out.println(t);
    }
    public void test(List list){
        for(int i=0;i<list.size();i++){

            System.out.println(list.get(i));

        }
    }
}
