package day5;
public class ForceConvert {
    public static void main(String[] args) {
       //演示强制类型转换
//        int n1 = 1.9; //no
        int n2 = (int)1.9; //no
        System.out.println("n2=" + n2);// 1.9=>1,造成精度损失

        int n3 = 1000;
        byte n4 = (byte)n3;
        System.out.println("n4=" + n4);//-24 ,canst 数据溢出
    }
}
