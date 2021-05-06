package 第二周作业.Chapter05;

public class Homework01 {
    public static void main(String[] args) {
        double cash = 100000;
        int num = 0;
        while (cash > 50000){
            cash = 0.95 * cash;
            num++;
            if(cash<=50000){
                break;
            }
        }
        while(cash <= 50000){
            cash-=1000;
            if(cash<=0){
                break;
            }
            num++;
        }
        System.out.println("可以经过" + num + "次路口");
    }
}
