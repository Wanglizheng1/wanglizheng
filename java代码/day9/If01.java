package day9;
import java.util.Scanner;
//if的快速入门
public class If01 {
    public static void main(String[] args) {
        //编写一个程序,可以输入人的年龄,如果该同志的年龄大于 18 岁,则输出 "你年龄大于 18,要对自己的行为负责,送入监狱"
        //思路分析
        // 1. 接收输入的年龄, 应该定义一个 Scanner 对象
        // 2. 把年龄保存到一个变量 int age
        // 3. 使用 if 判断，输出对应信息
        // 应该定义一个 Scanner 对象
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();
        if(age > 18){
            System.out.println("你年龄大于 18,要对自己的行为负责,送入监狱");
        }
        System.out.println("程序继续执行");

    }
}
