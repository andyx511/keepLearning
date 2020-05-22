package 设计模式.模板方法模式.更加具体的例子;

/**
 * @Classname TestPaperA
 * @Description TODO
 * @Date 2020/5/22 11:05
 * @Author ALexNi
 */
public class TestPaperA extends TestPaper {

    @Override
    public String answer1() {
        return "d";
    }

    @Override
    public String answer2() {
        return "c";
    }

    @Override
    public String answer3() {
        return "c";
    }
}