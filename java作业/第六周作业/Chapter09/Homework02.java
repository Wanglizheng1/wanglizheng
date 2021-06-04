package 第六周作业.Chapter09;

/**
 * @author Wang
 * @version 0.0
 */
public class Homework02 {

}
class Frock{
    public Frock() {
        this.serialNumber = getNestNum();
    }

    private static int currentNum = 10000;
    private int serialNumber;
    public static int getNestNum(){
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}

class TestFrock{
    public static void main(String[] args) {
        System.out.println(Frock.getNestNum());
        System.out.println(Frock.getNestNum());
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        System.out.println(frock.getSerialNumber());
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
    }
}