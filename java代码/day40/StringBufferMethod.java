package day40;

/**
 * @author Wang
 * @version 0.0
 */
public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        s.append("哈哈").append(11).append(10.5);
        System.out.println(s);
    }


}
