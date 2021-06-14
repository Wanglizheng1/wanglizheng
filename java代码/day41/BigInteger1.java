package day41;
import java.math.BigDecimal;
import java.math.BigInteger;
/**
 * @author Wang
 * @version 0.0
 */
public class BigInteger1 {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("23788888899999999999999999999");
        BigInteger bigInteger2 = new BigInteger("23788888899999999999999999999");
        BigInteger add = bigInteger.add(bigInteger2);
        System.out.println(add);//
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        System.out.println(subtract);//减
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        System.out.println(multiply);//乘
        BigInteger divide = bigInteger.divide(bigInteger2);
        System.out.println(divide);//除

        BigDecimal bigDecimal = new BigDecimal("1.556456456546");
        BigDecimal bigDecima2 = new BigDecimal("1.555");
        System.out.println(bigDecimal.divide(bigDecima2, BigDecimal.ROUND_CEILING));
    }
}
