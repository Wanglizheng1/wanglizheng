package day42;


import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Wang
 * @version 0.0
 */
public class Generic01 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("wang", 12));
        students.add(new Student("li", 14));
        students.add(new Student("zheng", 18));
        for (Student student: students) {
            System.out.println(student.getAge()+"-"+student.getName());
        }
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student next =  iterator.next();
            System.out.println(next);
            
        }


    }
}




class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}