package day38.Exception01;

import java.util.Scanner;

/**
 * @author Wang
 * @version 0.0
 */
public class try_catch {
    public static void main(String[] args) {
        int num = 0;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个整数:");
            String sss = scanner.next();
            try {
                num = Integer.parseInt(sss);
                break;
            } catch (NumberFormatException e) {
                System.out.println("不是整数");
            }
        }
        System.out.println("你输入的数是" + num);
    }
}
