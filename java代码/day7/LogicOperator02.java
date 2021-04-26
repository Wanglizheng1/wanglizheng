package day7;
//演示||的使用
public class LogicOperator02 {
    public static void main(String[] args) {
        //||短路或 和 |逻辑或 案例演示
         int age = 50;
         if(age > 20 || age < 30) {
         System.out.println("ok100");
         }
        //&逻辑与使用
         if(age > 20 | age < 30) {
         System.out.println("ok200");
         }
        // 区别
        // 对于||短路或而言，如果第一个条件为 true ,后面的条件不再判断
        // 对于|逻辑或而言，如果第一个条件为 true ,后面的条件仍然会判断,效率低
        int a = 4;
        int b = 9;
        if(a > 1 | ++b > 4) {
             System.out.println("ok300");
         }
         System.out.println("a=" + a + " b=" + b);// 4 10
    }
}
