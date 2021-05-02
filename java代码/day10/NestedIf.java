
package day10;
import java.util.Scanner;

//if，else的多分支快速入门
public class NestedIf {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入初赛成绩：");
        double score = myScanner.nextDouble();

        if(8.0 < score ){
            System.out.println("请输入性别：");
            char gender = myScanner.next().charAt(0);
            if(gender == '男'  ){
                System.out.println("进入男子组");
            }else if(gender == '女'){
                System.out.println("进入女子组");
            }else{
                System.out.println("输入性别有误");
            }
        }else{
            System.out.println("淘汰");
        }
    }
}
