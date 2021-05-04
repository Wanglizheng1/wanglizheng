package day12;

public class BreakExercise {
    public static void main(String[] args) {
        int sum = 0;
        int n = 0;//n用来记录当前数i
        for(int i = 0; i <= 100; i++ ){
            sum += i;
            if(sum > 20){
                System.out.println("和>20时，i=" + i);
                n = i;
                break;
            }
        }
        System.out.println("当前数=" + n); //注意i的作用域
    }
}
