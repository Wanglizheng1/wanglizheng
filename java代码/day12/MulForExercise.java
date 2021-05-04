package day12;

import java.util.Scanner;

public class MulForExercise {
    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        double totalscore = 0;
//        int pass = 0;
//        for (int i = 1; i < 4; i++) {//i表示班级
//            double sum = 0;
//            for (int j = 1; j < 6; j++) {//j表示学生
//                System.out.println("请输入第" + i + "个班的第"+ j +"个学生成绩：");
//                double score = myScanner.nextDouble();
//                System.out.println("成绩是" + score);
//                if(score>=60){
//                    pass++;
//                }
//                sum += score;
//            }
//            System.out.println("平均成绩是" + (sum/5));
//            totalscore += sum;
//        }
//        System.out.println("三个班平均分是" + (totalscore / 3));
//        System.out.println("三个班总及格人数" + pass);

        //打印99乘法表
        for(int i = 1; i<=10; i++){
            for(int j = 1; j<=10; j++){
                if(j<=i){
                    System.out.print(j + "*" + i + "=" + (i *j ));
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}

