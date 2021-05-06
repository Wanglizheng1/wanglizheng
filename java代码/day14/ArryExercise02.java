package day14;

public class ArryExercise02 {
    public static void main(String[] args) {
        //请求出一个数组 int[]的最大值 {4,-1,9, 10,23}，并得到对应的下标
        int[] ary = {4,-1,9, 10,23};
        int max = ary[0];
        int maxindex = 0;
        for(int i = 1;i < ary.length; i++){
            if(max < ary[i]){
                max = ary[i];
                maxindex = i;
            }
        }
        System.out.println("最大值=" + max + "最大值下标=" + maxindex );
    }
}
