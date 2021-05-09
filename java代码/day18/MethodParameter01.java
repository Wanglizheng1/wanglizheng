package day18;

public class MethodParameter01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        A3 c = new A3();
        c.swap(a, b);
        System.out.println("main方法中 a=" + a + "b=" + b);
    }
}
class A3 {
    public void swap(int a,int b){
        System.out.println("\na 和 b 交换前的值\na=" + a + "\tb=" + b);//a=10 b=20 //完成了 a 和 b 的交换
         int tmp = a;
         a = b;
         b = tmp;
         System.out.println("\na 和 b 交换后的值\na=" + a + "\tb=" + b);//a=20 b=10
    }
}