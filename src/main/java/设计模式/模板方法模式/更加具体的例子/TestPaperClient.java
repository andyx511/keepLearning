package 设计模式.模板方法模式.更加具体的例子;

/**
 * @Classname TestPaperClient
 * @Description TODO
 * @Date 2020/5/22 11:06
 * @Author ALexNi
 */
public class TestPaperClient {

    public static void main(String[] args) {

        System.out.println("学生甲抄的试卷：");
        TestPaperA studentA = new TestPaperA();
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();

        System.out.println();

        System.out.println("学生乙抄的试卷：");
        TestPaperB studentB = new TestPaperB();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();
    }
}
