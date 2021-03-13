package cmd;

import AOP.Actor;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * @Classname la
 * @Description TODO
 * @Date 2020/4/24 15:32
 * @Author ALexNi
 */
public class la {
    public static void main(String[] args) throws IOException {
        Set<User> set;
        set = new HashSet<>();
        User a = new User("a");
        set.add(a);
        User b = new User("b");
        set.add(b);
        System.out.println(set);
        a = null;
        System.out.println(set);
    }
}
