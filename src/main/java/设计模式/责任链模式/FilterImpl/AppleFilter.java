package 设计模式.责任链模式.FilterImpl;

import 设计模式.责任链模式.Filter;

import java.util.Set;

/**
 * @Classname AppleFilter
 * @Description TODO
 * @Date 2020/5/21 15:45
 * @Author ALexNi
 */
public class AppleFilter implements Filter {

    @Override
    public void doFilter(Set<String> strings) {
        if (strings.contains("apple")){
            strings.remove("apple");
        }
    }
}
