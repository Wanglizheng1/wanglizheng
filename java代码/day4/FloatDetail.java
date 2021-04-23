package day4;


public class FloatDetail {
    public static void main(String[] args) {
        //先声明在使用
        double n = 30.1;
//       float n = 30.1;  wrong
//       double b = 30,1f  wrong
        float b = 30.1f;
        System.out.println(n);
        System.out.println(b);
        double a = .12;  //等价于0。12
        System.out.println(5.12e2);
        System.out.println(5.12e-2);
        double num11 = 2.7;
        double num12 = 8.1 / 3; //不是2.7，2.69999997
        System.out.println(num11);
        System.out.println(num12); //接近2.7，不是2.7
        //重要使用点：对运算结果是小数的进行相等判断要小心

        //正确写法,两个数的差值绝对数，在某个精度范围内判断
        if (Math.abs(num11 - num12) < 0.00001) {
            System.out.println("差值非常小，认为相等");
        }
            System.out.println(Math.abs(num11 - num12));
    }
}

