import org.apache.commons.lang3.time.DateUtils;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * projectName：keepLearning
 * name：test
 * description：todo
 * date：2020/10/20 10:35 下午
 * auther：AlexNi
 */
public class test {
    public static void main(String[] args) {
        Date date = new Date();
        date = DateUtils.addMinutes(date, -5);
        System.out.println(date.toString());

    }

}
