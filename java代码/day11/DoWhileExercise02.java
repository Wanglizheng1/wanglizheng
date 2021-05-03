package day11;
import java.util.Scanner;

//do while 练习
public class DoWhileExercise02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        char answer = ' ';
        do{
            System.out.println("韩老师使出了松果弹斗五连鞭");
            System.out.println("还不还钱？y/n");
            answer = myScanner.next().charAt(0);
        }while (answer != 'y');//判断条件很重要
        System.out.println("李三还钱了");
    }
}
