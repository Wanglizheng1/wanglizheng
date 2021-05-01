package day9;
//位运算
public class BitOperator {
    public static void main(String[] args){
       //先按照规则取补码运算，在将补码转换成原码
        //负数原码先变反码在变成补码，补码变原码也是先变反码在变原码
        System.out.println(2 & 3);
        System.out.println(~ -2);
        System.out.println(~ 2);
    }
}
