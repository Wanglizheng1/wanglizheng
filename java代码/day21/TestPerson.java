package day21;

public class TestPerson {
    public static void main(String[] args) {
        PERSON p1 = new PERSON("wan", 28);
        PERSON p2 = new PERSON("warn", 28);
        System.out.println("p1和p2比较的结果=" + p1.compareTo(p2));
    }
}

class PERSON{
    String name;
    int age;
    public PERSON(String name, int age){
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(PERSON p){
        return this.name == p.name && this.age == p.age;
    }
}
