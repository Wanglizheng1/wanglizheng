package day34;

public class Abstract01 {
//    Anima anima =  new Animal();

}

abstract class Animal{//抽象类被继承由子类去实现
    int num = 0;
    public abstract void eat();
    public void e(){
        long start = System.currentTimeMillis();

        for (int i = 1; i <+ 10000; i++) {
            num += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}