package day26.objectpoly_;

public class PolyObject {
    public static void main(String[] args) {
        //对象多态的使用
        Animal animal = new Dog();
        animal.cry();//运行时，这时即到该行时，anmail运行类型是dog，所以
        //cry是dog的cry

        animal = new Cat();//运行类型是Cat了
        animal.cry();

    }
}
