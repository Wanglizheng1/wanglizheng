package day10;
import java.util.Scanner;

//SWITCH练习
public class SwitchExercise {
    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("输入字符（a-e）");
//        char c1 = myScanner.next().charAt(0);
//        switch (c1) {
//            case 'a':
//                System.out.println("A");
//                break;
//            case 'b':
//                System.out.println("B");
//                break;
//            case 'c':
//                System.out.println("C");
//                break;
//            case 'd':
//                System.out.println("D");
//                break;
//            case 'e':
//                System.out.println("E");
//                break;
//            default:
//                System.out.println("other");
//        }

//        //第二题
//        Scanner myScanner1 = new Scanner(System.in);
//        System.out.println("输入成绩");
//        double n1 = myScanner1.nextDouble();
//        if(n1 >= 0 && n1 <= 100) {
//            switch ((int) (n1 / 60)) {
//                case 1:
//                    System.out.println("合格");
//                    break;
//                case 0:
//                    System.out.println("不合格");
//                    break;
//                default:
//                    System.out.println("请输入正确成绩");
//            }
//        }else{
//            System.out.println("请输入1-100之间的成绩");
//        }

        //第三题
        //根据用于指定月份，
        // 打印该月份所属的季节。
        // 3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12, 1, 2 冬季
        // [课堂练习, 提示 使用穿透 ] //
        // 思路分析
        // 1. 创建 Scanner 对象， 接收用户输入
        // 2. 使用 int month 接收
        // 3. 使用 switch 来匹配 ,使用穿透来完成，比较简洁
        Scanner myScanner2 = new Scanner(System.in);
        System.out.println("输入月份");
        int month = myScanner2.nextInt();
        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("这是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("这是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("这是秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("这是冻季");
                break;
            default:
                System.out.println("月份不对啊");
        }

    }
}
