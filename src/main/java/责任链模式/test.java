package 责任链模式;

import java.util.HashSet;
import java.util.Set;

/**
 * @Classname test
 * @Description TODO
 * @Date 2020/5/21 15:46
 * @Author ALexNi
 */
public class test {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();;
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        FilterChain chain = new FilterChain();
        chain.processData(strings);
        System.out.println(strings.toString());
    }
}
