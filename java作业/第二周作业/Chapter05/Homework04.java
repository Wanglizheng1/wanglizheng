package 第二周作业.Chapter05;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个三位整数：");
        int num = myScanner.nextInt();
        int num0 = num / 100;
        int num1 = (num / 10) % 10;
        int num2 = num % 10;
        if(num == (int)(Math.pow(num0, 3) + Math.pow(num1, 3) + Math.pow(num2, 3))){
            System.out.println("这是一个水仙花数");
        }else{
            System.out.println("这不是一个水仙花数");
        }
    }
}
