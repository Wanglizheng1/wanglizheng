package day38.Exception01;

/**
 * @author Wang
 * @version 0.0
 */
public class Exception {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        try {//ctrl+alt+t 快捷键
            int res = n1 / n2;
            System.out.println("哈哈");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (java.lang.Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finnal代码块被执行");
        }
        System.out.println("程序继续执行");
    }

}
