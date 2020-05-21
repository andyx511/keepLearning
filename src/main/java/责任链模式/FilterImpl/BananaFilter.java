package 责任链模式.FilterImpl;

import 责任链模式.Filter;

import java.util.Set;

/**
 * @Classname BananaFilter
 * @Description TODO
 * @Date 2020/5/21 15:51
 * @Author ALexNi
 */
public class BananaFilter implements Filter {

    @Override
    public void doFilter(Set<String> strings) {
        if (strings.contains("banana")){
            strings.remove("banana");
        }
    }

}
