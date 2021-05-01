package 第二周作业.Chapter04;

public class Homework {
    public static void main(String[] args) {
        System.out.println(-10.4%3);//-1.4的近似值
        int i = 66;
        System.out.println(++i + i);//先自增在运算
        double d = 3d;
        System.out.println(d);

        String str = "18.5";//str转double
        double d1 = Double.parseDouble(str);
        System.out.println(d1);
        char c1 = '王';
        String S1 = c1 + "";
        System.out.println(S1);

    }
}
