package day7;
//三元运算符基本使用
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        //1.a>b为false
        //2.返回b--，先返回b的值，然后在b—1
        //3.返回的结果是99
        int result = a > b ? a++ : b--;
        System.out.println("result=" +result);//99
        System.out.println("a=" + a);//10
        System.out.println("b=" + b);//98
    }
}
