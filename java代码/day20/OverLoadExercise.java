package day20;

public class OverLoadExercise {
    public static void main(String[] args) {
        Methods me =  new Methods();
        System.out.println(me.max(10,24));
        System.out.println(me.max(10,21.4));
        System.out.println(me.max(10,24,1));
    }
}

class Methods{
    public int max(int n1, int n2){
        return n1 > n2 ? n1 : n2;
    }
    public double max(double n1, double n2){
        return n1 > n2 ? n1 : n2;
    }
    public double max(double n1, double n2, double n3){
        double max1 = n1 > n2 ? n1 : n2;
        return max1 > n3 ? max1 : n3;
    }
}