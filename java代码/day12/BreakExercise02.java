package day12;

import java.util.Scanner;

public class BreakExercise02 {
    public static void main(String[] args) {
        int chance = 3;
        String name = "";
        String pass = "";
        Scanner myScanner = new Scanner(System.in);
        for(int i = 1; i <= 3; i++ ){
            System.out.println("请输入姓名：");
            name = myScanner.next();
            System.out.println("请输入密码：");
            pass = myScanner.next();
            if("丁真".equals(name) && "666".equals(pass)){
                System.out.println("恭喜你，登陆成功==");
                break;
            }
            chance--;
            System.out.println("您还有" + chance + "机会");
        }
    }
}
