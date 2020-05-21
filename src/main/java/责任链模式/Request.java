package 责任链模式;

import java.util.Set;

/**
 * @Classname Request
 * @Description TODO
 * @Date 2020/5/21 15:42
 * @Author ALexNi
 */
public class Request {
    private Set<String> data;

    public Set<String> getData() {
        return data;
    }

    public void setData(Set<String> data) {
        this.data = data;
    }
}
