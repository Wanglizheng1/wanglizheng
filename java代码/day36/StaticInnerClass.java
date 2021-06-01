package day36;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();

        //static方法getInner直接访问内部变量
        Outer10.Inner10 inner101 = Outer10.getInner10();


    }
}
class Outer10{
    private int n1 = 10;
    private static String name = "zhangsan";

    static class Inner10{
        public void say(){
            System.out.println(name);
        }


    }
    public static Inner10 getInner10(){
        return new Inner10();
    }
}