package 第二周作业.Chapter05;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num1 = myScanner.nextInt();
        if(num1 > 0){
            System.out.println("整数大于0");
        }else if (num1 < 0){
            System.out.println("整数小于0");
        }else{
            System.out.println("整数等于0");
        }
    }
}
