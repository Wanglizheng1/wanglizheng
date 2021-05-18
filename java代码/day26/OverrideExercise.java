package day26;

public class OverrideExercise {
    public static void main(String[] args) {
        Person jack = new Person("JACK", 18);
        System.out.println(jack.say());
        Student smith = new Student("SMITH", 13, 22, 33);
        System.out.println(smith.say());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String say() {
        return "name=" + name + " age=" + age;
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
}

class Student extends Person {
    private int id;
    private double score;

    public Student(String name, int age, int id, double score) {
        super(name, age);//这里会调用父类构造器
        this.id = id;
        this.score = score;
    }

    public String say() {
//        这里体现 super 的一个好处，代码复用.
        return super.say() + " id=" + id + " score=" + score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}