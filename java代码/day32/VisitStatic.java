package day32;

public class VisitStatic {
    public static void main(String[] args) {
        System.out.println(A.name);
//        System.out.println(A.name1);
        A a = new A();
        System.out.println(a.name1);
    }
}

class A{
    public static String name = "wang";
    public String name1 = "wangLZIEHNG";
}