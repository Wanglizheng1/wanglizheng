package day18;

public class MethodDetail {
    public static void main(String[] args) {
        A2 a = new A2();
        int[] res = a.getSumAndSub(1, 4);
        System.out.println("和=" + res[0]);
        System.out.println("差=" + res[1]);
    }
}


class A2{
    public int[] getSumAndSub (int n1, int n2) {
        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }

    public int f1(){
        int n = 10;
        double i = 10.0;
        return n;
    }

    public void f2(){
        return;
    }
}