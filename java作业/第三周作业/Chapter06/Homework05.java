package 第三周作业.Chapter06;

public class Homework05 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 10) + 1;
        }
        System.out.println("倒序打印arr元素情况");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        int max = arr[0];
        int maxIndex = -1;
        double sum = arr[0];
        for(int i = 1; i < arr.length; i++){
            sum += arr[i];
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
                break;
            }
        }
        System.out.println("\n" + "max=" + max + "maxindex=" + maxIndex);
        System.out.println("平均值=" + sum / arr.length);

        int findNum = 8;
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == findNum){
                System.out.println("找到数" + findNum + "下标=" + i);
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("没有找到" +findNum);
        }

    }
}
