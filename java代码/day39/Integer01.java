package day39;

/**
 * @author Wang
 * @version 0.0
 */
public class Integer01 {
    public static void main(String[] args) {
        int n1 =100;
        Integer integer = new Integer(n1);

        Integer integer1 = Integer.valueOf(n1);
        int i = integer.intValue();

        //jdk5以后自动装箱、拆箱
        int n2 = 200;
        Integer integer2 = n2;//底层使用的仍旧是 Integer.valueOf(n1)
        int n3 = integer2;//底层使用的仍旧是 intValue()方法



    }
}
