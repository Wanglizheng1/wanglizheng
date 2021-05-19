package Check_518;

public class Bachelor extends Student{
    public Bachelor(String name, int age, char gender, String tel, String place, String hobby, String xueli, String xueyuan) {
        super(name, age, gender, tel, place, hobby, xueli, xueyuan);
    }
    public String work1(){
       return getXueli() + super.work1() + "毕设";
    }
}
