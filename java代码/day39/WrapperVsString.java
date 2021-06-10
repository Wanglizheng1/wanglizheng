package day39;

/**
 * @author Wang
 * @version 0.0
 */
public class WrapperVsString {
    public static void main(String[] args) {
        Integer i = 100;
        String str1 = i + "";
        String str2 = i.toString();
        String str3 = String.valueOf(i);

        String str4 = "123";
        Integer i1 = Integer.parseInt(str4);
        Integer i2 = new Integer(str4);


    }
}
