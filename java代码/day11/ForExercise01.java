
package day11;

//for练习
public class ForExercise01 {
    public static void main(String[] args) {
        //思路分析
        // 打印 1~100 之间所有是 9 的倍数的整数，统计个数及总和
        // 化繁为简
        // (1) 完成 输出 1-100 的值
        // (2) 在输出的过程中，进行过滤，只输出 9 的倍数 i % 9 ==0
        // (3) 统计个数 定义一个变量 int count = 0; 当 条件满足时 count++;
        // (4) 总和 , 定义一个变量 int sum = 0; 当条件满足时累积 sum += i;
        // 先死后活：先考虑固定的值，在转换成可以灵活变化的值
        // (1) 为了适应更好的需求，把范围的开始的值和结束的值，做成变量
        // (2) 还可以更进一步 9 倍数也做成变量 int t = 9;
        int count = 0;//统计9的倍数的个数
        int sum = 0;
        int start = 1;
        int end = 100;
        int t = 5;
        for(int i = start; i <= end; i++){
            if(i % t == 0){
                System.out.println("i=" + i);
                count++;
                sum += i;//累积
            }
        }
        System.out.println("count=" + count);
        System.out.println("sum=" + sum);
    }
}
