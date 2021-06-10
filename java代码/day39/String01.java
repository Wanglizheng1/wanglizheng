package day39;

/**
 * @author Wang
 * @version 0.0
 */
public class String01 {
    public static void main(String[] args) {
        String S1 = "wlz";
        String S2 = new String("wlz");
        String S3 = "wlz";
        System.out.println(S1 == S2);
        System.out.println(S1 == S3);
    }
}
