package 第三周作业.Chapter06;

public class Homework07 {
    public static void main(String[] args) {
       //冒泡排序
        int[] arr = {30, 210, 12,-31,10};
        int temp = 0;
        for(int i = 0; i < arr.length-1; i++){//外层循环找第一次最大的数
            for(int j = 0; j < arr.length - 1 - i; j++){//每轮比较次数
                if(arr[j] > arr[j+1]){//从小到大排序
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("输出排序后的结果");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
