package 第二周作业.Chapter05;

public class Homework09 {
    public static void main(String[] args) {
        int count = 0;
        int num = 0;
        for(int i=1; i<=100;i++){
            count += i;
            num += count;
        }
        System.out.println("结果=" + num );
    }
}
