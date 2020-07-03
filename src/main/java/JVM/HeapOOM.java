package JVM;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname HeapOOM
 * @Description TODO
 * @Date 2020/7/2 11:19
 * @Author ALexNi
 */
public class HeapOOM {
    static class OOMObject{}

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
