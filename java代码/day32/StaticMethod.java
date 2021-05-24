package day32;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("tom");
        tom.payFee(100);
        Stu jack = new Stu("jack");
        jack.payFee(200);
        Stu.shouFee();

    }
}
class Stu{
    private String name;
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }
    public static void payFee(double fee){
        Stu.fee += fee;
    }
    public static void shouFee(){
        System.out.println("总学费为" + Stu.fee);
    }
}
