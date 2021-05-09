package day18;

public class MethodParameter02 {
    public static void main(String[] args) {
        B b = new B();
        int[] arr = {1,2,3};
        b.test(arr);
        System.out.println("main中的 arr数组");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}

class B {
    public void test(int[] arr){
       arr[0] = 100;
       System.out.println("test中的 arr数组");
       for(int i = 0; i < arr.length; i++){
           System.out.print(arr[i] + "\t");
       }
       System.out.println();
    }
}