package 第三周作业.Chapter07;

public class Honework06 {
    public static void main(String[] args) {
       Cale c1 = new Cale(5, 4);
       double lenth = c1.sum();
       double s = c1.div();
    }
}

class Cale{
    double num1;
    double num2;
    public Cale(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double sum(){
        return num1 + num2;
    }
    public double minus(){
        return num1 - num2;
    }
    public double mul(){
        return num1 * num2;
    }
    public Double div() {
        if (num2 == 0) {
            System.out.println("num2 不能为0");
            return null;
        } else {
            return num1 / num2;
        }
    }
}