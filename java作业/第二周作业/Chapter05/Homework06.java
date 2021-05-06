package 第二周作业.Chapter05;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=1; i<=100;i++){
            if(i % 5 != 0){
                count++;
                System.out.print(i+"\t");
                if(count % 5 == 0){
                    System.out.println();
                }
            }
        }
    }
}
