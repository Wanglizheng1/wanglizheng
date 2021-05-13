package day21;

public class ConstrucyorExercise {
    public static void main(String[] args) {
        Person2 p1 = new Person2("D");
        System.out.println(p1.name);


    }
}

class Person2{

    String name;
    int age;
    public Person2(){
        name = "d";
    }
    public Person2(String pName){
        name = pName;
    }

}
