package 第三周作业.Chapter07;

public class Honework05 {
    public static void main(String[] args) {
       Cricle c1 = new Cricle(5);
       double lenth = c1.lenth();
       double s = c1.s();
    }
}

class Cricle{
    double r;
    public Cricle(double r){
    this.r = r;
    }
    public double lenth(){
        double num = 2 * Math.PI * r;
        return num;
    }
    public double s(){
        double s1 = Math.PI * r * r;
        return s1;
    }

}