package day15;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23, 54,64,34,23,22,443,53,5,2,3,4};
        int temp = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("\n==第" + (i + 1) + "轮==");
            for(int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
        }

     }
}
