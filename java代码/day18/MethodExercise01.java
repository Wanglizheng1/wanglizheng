package day18;

public class MethodExercise01 {
    public static void main(String[] args) {
       A1 a = new A1();
       if(a.isOdd(1)){
           System.out.println("奇数");
       }else{
           System.out.println("偶数");
       }
       a.print(4,4, '#');
    }
}


class A1{
    //思路
    // 1. 方法的返回类型 boolean
    // 2. 方法的名字 isOdd
    // 3. 方法的形参 (int num)
    // 4. 方法体 , 判断
    public boolean isOdd(int num){
//       return num % 2 != 0 ? true: false;
        return num % 2 != 0;
    }
    public void print(int row, int col, char c){
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}