package 第六周作业.Chapter09;

/**
 * @author Wang
 * @version 0.0
 */
public class Homework03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog= new Dog();
        cat.shaut();
        dog.shaut();
    }
}


abstract class Animal{
    public abstract void shaut();

}

class Cat extends Animal{
    @Override
    public void shaut() {
        System.out.println("小猫往往交");
    }
}
class Dog extends Animal{
    @Override
    public void shaut() {
        System.out.println("小狗往往交");
    }
}