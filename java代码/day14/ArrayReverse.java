package day14;

public class ArrayReverse {
    public static void main(String[] args) {
        //数组翻转
         int[] arr = {11, 22, 33, 44, 55, 66};
         int[] arr1 = new int[arr.length];
         for(int j = 0; j < arr.length; j++){
             arr1[j] = arr[arr.length - 1- j];
         }
         arr = arr1;
         for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
         }
    }
}
