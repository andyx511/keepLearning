package JVM;

/**
 * @Classname JavaVMStackSOF
 * @Description TODO
 * @Date 2020/7/2 11:36
 * @Author ALexNi
 */
public class JavaVMStackSOF {
    private int stackLength = 1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try{
            oom.stackLeak();;
        }catch (Throwable throwable){
            System.out.println("stack length: " + oom.stackLength );
        }
    }
}
