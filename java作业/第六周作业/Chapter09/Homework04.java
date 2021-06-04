package 第六周作业.Chapter09;

/**
 * @author Wang
 * @version 0.0
 */
public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Icalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 4, 5);
    }
}
interface Icalculate{
    public double work(double n1, double n2);
}

class Cellphone{
    public void testWork(Icalculate icalculate, double n1, double n2){
        double result = icalculate.work(n1, n2);
        System.out.println("结果是" + result);
    }
}