package 第二周作业.Chapter05;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int num1 = myScanner.nextInt();
        if((num1 % 4 == 0 && num1 % 100 != 0) || num1 % 400 ==0){
            System.out.println("this year is run nian");
        }
    }
}
