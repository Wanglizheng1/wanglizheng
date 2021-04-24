package day5;
//自动转换细节
public class AutoConvertDetail {
    public static void main(String[] args) {
        //当 java 程 序 在 进 行 赋值 或 者 运 算 时 ，
        // 精 度 小 的 类 型 自 动 转 换 为 精 度 大 的 数 类 型
        int num = 10;//ok char->int
        double d1 = num + 1.4;
        float d2 = num + 1.4f;
//        float d3 = num + 1.4; 错误，结果是double
        System.out.println(d1);
        System.out.println(d2);
        byte b1 = 20;
//        char ci = b1;byte,short,char不能转换

        //byte,short,char他们三者可以计算，在计算时首先转换为int类型。
        byte b2 = 1;
        short b3 = 1;
//        short b4 = b2 + b3; b2  + b3=>int,int不能向低精度转换
        int b4 = b2 + b3;//对

        boolean pass = true;
//        int num111 = pass;boolean不参加转换

        //自动提升原则：表达式结果的类型自动提升为操作数中最大的类型

    }
}