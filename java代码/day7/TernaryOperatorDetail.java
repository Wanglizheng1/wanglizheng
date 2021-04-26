package day7;
//三元运算符细节
public class TernaryOperatorDetail {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
//        int c = a > b ? a : b + 1.1; //错误，表达式 1 和表达式 2 要为可以赋给接收变量的类型
        double d = a > b ? a : b + 3;//可以，(可以自动转换/或者强制转换)int=》double
    }
}
