package Check_518;

public class Person {
    private String name;
    private int age;
    private char gender;
    private String tel;
    private String place;
    private String hobby;

    public Person(String name, int age, char gender, String tel, String place, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.tel = tel;
        this.place = place;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
