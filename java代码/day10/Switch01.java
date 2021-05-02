package day10;
import java.util.Scanner;
//SWITCH快速入门
public class Switch01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("输入字符（a-g）");
        char c1 = myScanner.next().charAt(0);
        switch (c1){
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            case 'f':
                System.out.println("星期六");
//                break;
            case 'g':
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入字符不对");
            System.out.println("退出");
        }

    }
}
