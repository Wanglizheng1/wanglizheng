package 第三周作业.Chapter06;

public class Homework04 {
    public static void main(String[] args) {
       int[] arr = {10, 12, 45, 90};
       int[] newArr = new int[arr.length + 1];
       int addNum = 23;
       int index = arr.length;
       for(int i = 0; i < arr.length; i++){
           if(arr[i] >= addNum){
               index = i;
               break;
           }
       }
       for(int i = 0, j = 0; i < newArr.length; i++){
           if(i == index){
               newArr[i] = addNum;
           }else {
               newArr[i] = arr[j];
               j++;
           }
       }
       arr = newArr;
        for(int i = 0; i < arr.length; i++){
            System.out.print(newArr[i] + "\t");
        }

    }
}
