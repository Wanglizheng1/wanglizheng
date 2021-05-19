package Check_518;

public class Student extends Person{
    private String xueli;
    private String xueyuan;

    public Student(String name, int age, char gender, String tel, String place, String hobby, String xueli, String xueyuan) {
        super(name, age, gender, tel, place, hobby);
        this.xueli = xueli;
        this.xueyuan = xueyuan;
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli;
    }

    public String getXueyuan() {
        return xueyuan;
    }

    public void setXueyuan(String xueyuan) {
        this.xueyuan = xueyuan;
    }

    public void work(){
        System.out.println(getName() + "上课");
    }
    public String work1(){
        return getName() + "发的论文";
    }
}
