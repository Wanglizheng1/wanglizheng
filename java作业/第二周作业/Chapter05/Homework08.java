package 第二周作业.Chapter05;

public class Homework08 {
    public static void main(String[] args) {
        double toal = 0;
        for(int i=1; i<=100;i++){
            double num = (1.0 / i) * Math.pow(-1, i+1);
            toal +=num;
        }
        System.out.println("和=" +toal);
    }
}
