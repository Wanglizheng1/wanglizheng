package day6;
//演示逻辑运算符
public class LogicOperator01 {
    public static void main(String[] args) {
        //&&短路与 和 &逻辑与 案例演示
         int age = 50;
         if(age > 20 && age < 90) {
         System.out.println("ok100");
         }
        //&逻辑与使用
         if(age > 20 & age < 90) {
         System.out.println("ok200");
         }
        // 区别
        // 对于&&短路与而言，如果第一个条件为 false ,后面的条件不再判断
        // 对于&逻辑与而言，如果第一个条件为 false ,后面的条件仍然会判断
        int a = 4;
        int b = 9;
        if(a < 1 && ++b < 50) {
             System.out.println("ok300");
         }
         System.out.println("a=" + a + " b=" + b);// 4 10
    }
}
