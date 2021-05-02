package day10;
import java.util.Scanner;

//SWITCH细节讨论
public class SwitchDetail {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'a';
        switch (c1){
            case 'a':
                System.out.println("ok1");
                break;
//            case c2: 必须是常量或者常量表达式
            case 'b':
                System.out.println("ok2");
                break;
            default:
                System.out.println("ok3");
            System.out.println("退出");
        }
    }
}
