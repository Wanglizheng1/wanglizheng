package 第三周作业.Chapter07;

public class Honework01 {
    public static void main(String[] args) {
        double[] arr = {1.1,2.4,2.3};
        A01 ao1 = new A01();
        System.out.println(ao1.max(arr));
    }
}

class A01{
    public double max(double[] arr){
        double max = arr[0];
        for(int i = 1; i < arr.length-1; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
