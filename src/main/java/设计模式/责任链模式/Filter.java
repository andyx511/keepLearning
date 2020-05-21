package 设计模式.责任链模式;

import java.util.Set;

/**
 * @Classname Filter
 * @Description TODO
 * @Date 2020/5/21 15:43
 * @Author ALexNi
 */
public interface Filter {
    void doFilter(Set<String> strings);
}
