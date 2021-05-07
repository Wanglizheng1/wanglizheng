package day15;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        //创建 二维数组，一个有 3 个一维数组，但是每个一维数组还没有开数据空间
        int[][] arr = new int[3][];
        for(int i = 0; i < arr.length; i++) {//遍历 arr 每个一维数组
            //给每个一维数组开空间 new
            // 如果没有给一维数组 new ,那么 arr[i]就是 null
             arr[i] = new int[i + 1];
            //遍历一维数组，并给一维数组的每个元素赋值
             for(int j = 0; j < arr[i].length; j++) {
                 arr[i][j] = i + 1;// 赋值
             }
        }
        //遍历arr输出
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
