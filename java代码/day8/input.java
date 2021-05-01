package day8;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        //演示接受用户输入
        //步骤
        // Scanner 类 表示 简单文本扫描器，在 java.util 包
        // 1. 引入/导入 Scanner 类所在的包
        // 2. 创建 Scanner 对象 , new 创建一个对象,体会
        // myScanner 就是 Scanner 类的对象
        Scanner myScanner = new Scanner(System.in);//键盘输入
        System.out.println("请输入名字");
        //当程序执行到 next 方法时，会等待用户输入
        String name = myScanner.next(); //接收用户输入字符串
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();
        System.out.println("请输入薪水");
        double sal = myScanner.nextDouble();
        System.out.println("name=" + name + "年龄="
                + age + "薪水" + sal);

    }
}
