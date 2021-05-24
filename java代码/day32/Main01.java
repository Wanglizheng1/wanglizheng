package day32;

public class Main01 {
    private static String name = "王立峥";
    private static void hi(){
        System.out.println("Main01的 hi方法");
    }
    private void cry(){
        System.out.println("Main01的 cry方法");
    }
    private int n1 = 1000;


    public static void main(String[] args) {
        System.out.println(name);
        hi();

//        System.out.println(n1);//静态方法main不能访问非静态成员
//        cry();

        //先实例化对象，在调用即可
        Main01 main01 = new Main01();
        System.out.println(main01.n1);
        main01.cry();
        //SUCCESS

    }
}
