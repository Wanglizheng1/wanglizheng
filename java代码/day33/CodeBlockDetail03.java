package day33;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();//(1)AAA 的普通代码块(2)AAA() 构造器被调用(3)BBB 的普通代码块(4)BBB() 构造器被调用 } }class AAA { //父类 Object { System.out.println("AAA 的普通代码块"); }public AAA() { //(1)super() //(2)调用本类的普通代码块 System.out.println("AAA() 构造器被调用...."); } 第 399页
    }
}
class AAA{
    {
        System.out.println("AAA的普通代码快");
    }
    public AAA(){
        System.out.println("AAA() 构造器被调用");
    }
}
class BBB extends AAA {
        {
            System.out.println("BBB 的普通代码块...");
        }
    public BBB() {
        //(1)super() //(2)调用本类的普通代码块
        super();
        System.out.println("BBB() 构造器被调用....");
    }
}

