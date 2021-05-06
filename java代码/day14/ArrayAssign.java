package day14;

public class ArrayAssign {
    public static void main(String[] args) {
        //数组赋值是地址，引用拷贝
        //是一个地址
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;//修改arr2会影响arr1
        arr2[0] = 10;
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
