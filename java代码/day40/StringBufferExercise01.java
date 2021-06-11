package day40;

/**
 * @author Wang
 * @version 0.0
 */
public class StringBufferExercise01 {
    public static void main(String[] args) {
        String price = "111123564.59";
        StringBuffer sb = new StringBuffer(price);
        for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3) {
            sb.insert(i, ",");
        }
        System.out.println(sb);
    }
}
