package 第五周作业.Chapter08;

import java.util.Arrays;

public class Homework01 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        Person temp = null;
        persons[0] = new Person("jack", "大数据工程师", 18);
        persons[1] = new Person("tom", "PHP工程师", 28);
        persons[2] = new Person("marry", "JavaEE工程师", 35);
        System.out.println(Arrays.toString(persons));
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - i - 1; j++) {
                    if(persons[j].getAge() < persons[j + 1].getAge()){
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(persons));
    }

}
class Person{
    private String name;
    private String job;
    private int age;

    public Person(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }
}