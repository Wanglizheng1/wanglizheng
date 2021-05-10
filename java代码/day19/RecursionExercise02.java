package day19;

public class RecursionExercise02 {
    public static void main(String[] args) {
        M2 m1 = new M2();
        int n = 1;
        int res = m1.peach(n);
        if(res != -1){
            System.out.println("第" + n + "天有" + res + "桃子");
        }
    }
}

class M2{
    public int peach(int day){
        if(day == 10){
            return 1;
        }else if (day >= 1 && day <= 9){
            return ((peach(day + 1) +1) * 2);
        }else {
            System.out.println("day应该在1-10");
            return -1;
        }
    }
}