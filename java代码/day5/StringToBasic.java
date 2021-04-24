package day5;
public class StringToBasic {
    public static void main(String[] args) {
       //基本数据类型转string
        int n1  =100;
        float f1 = 1.1f;
        double d1 = 3.1;
        boolean b1 = true;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + " " + s2 + " " + s3 + " " +s4 );

        System.out.println("============");
        //String转对应的基本数据类型
        String s5 = "123";
        int num1 = Integer.parseInt(s5); // parse转换
        System.out.println(num1);
        double num2 = Double.parseDouble(s5);
        System.out.println(num2);
        Long num3 = Long.parseLong(s5);
        System.out.println(num3);
    }
}
