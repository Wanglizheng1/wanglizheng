package 第三周作业.Chapter07;

public class Honework04 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,5};
//        System.out.println(arr.hashCode());
        A03 n03 = new A03();
        int[] newArr = n03.copyArr(arr);
        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + "\t" );
        }

    }
}

class A03{
    public int[] copyArr(int[] arr){
        int[] narr = new int[arr.length ];
        for(int i = 0; i < arr.length; i++){
            narr[i] = arr[i];
        }
        return narr;
    }
}