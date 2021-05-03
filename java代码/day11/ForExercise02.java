
package day11;

//for练习
public class ForExercise02 {
    public static void main(String[] args) {
        //思路分析
        // 先死后活：先考虑固定的值，在转换成可以灵活变化的值
        int start = 1;
        int n = 9;
        for(int i = start; i <= n; i++){
            int j = 5 - i;
            System.out.println(i + "+" + j + "=5" );
        }
    }
}
