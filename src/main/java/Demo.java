/**
 * projectName：keepLearning
 * name：Demo
 * description：todo
 * date：2020/5/30 12:12 下午
 * auther：AlexNi
 */
abstract class Person {
    public abstract void eat();
}

public class Demo {
    public static void main(String[] args) {
        Person p = new Person() {
            public void eat() {
                System.out.println("eat something");
            }
        };
        p.eat();

    }
}