package day20;

public class VarParameter01 {
    public static void main(String[] args) {
        HspMethod h = new HspMethod();
        int[] arr = {2,3,4};
        System.out.println(h.sum(1,arr));//可以接收数组
        System.out.println(h.showScore("wang", 1,2,33,4));
    }
}

class HspMethod{
    public int sum(int n, int... nums){//可变参数在最后，且只能有一个
        //1. int... 表示接受的是可变参数，类型是 int ,即可以接收多个 int(0-多)
        // 2. 使用可变参数时，可以当做数组来使用 即 nums 可以当做数组
        // 3. 遍历 nums 求和即可
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            res += nums[i];
        }
        return res;
    }
    public String showScore(String name, double... scores){
        double totalScores = 0;
        for (int i = 0; i < scores.length; i++){
            totalScores += scores[i];
        }
        return name + "有" + scores.length + "门课，总分为=" + totalScores;
    }
}