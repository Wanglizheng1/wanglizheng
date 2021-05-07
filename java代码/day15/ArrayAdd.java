package day15;

public class ArrayAdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arryNew = new int[arr.length + 1];
        for(int i =0; i < arr.length; i++){
            arryNew[i] = arr[i];
        }
        arryNew[arryNew.length - 1] = 4;
        arr = arryNew;
        for(int i =0; i < arr.length; i++){
            System.out.print("扩容后效果=" + arryNew[i]);
        }
    }
}
