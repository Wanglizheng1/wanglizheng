
package day10;
import java.util.Scanner;

//if，else的多分支快速入门
public class If03 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入马保国的芝麻信用分：");
        int score = myScanner.nextInt();
        if(0 <= score & score <=100){
            if(score == 100){
                System.out.println("信用极好");
            }else if(80 < score & score <=99){
                System.out.println("信用优秀");
            }else if (60 <= score & score <=80){
                System.out.println("信用一般");
            }else {
                System.out.println("信用不及格");
            }
        }else{
            System.out.println("请输入0-100之间的数");
        }
        System.out.println("程序继续执行");
    }
}
