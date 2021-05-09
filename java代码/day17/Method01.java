package day17;

public class Method01 {
    public static void main(String[] args) {
        //方法使用
        // 1. 方法写好后，如果不去调用(使用)，不会输出
        // 2. 先创建对象 ,然后调用方法即可
        Person p1 = new Person();
        p1.speak();  //调用方法
        p1.cal01();
        p1.cal02(94);

        int returnRes = p1.getSum(20, 20);
        System.out.println("getSum返回值=" + returnRes);
    }
}

class Person{
    String name;
    int age;
    public void speak(){
        System.out.println("我说一个好人");
        //1. public 表示方法是公开
        // 2. void ： 表示方法没有返回值
        // 3. speak() : speak 是方法名， () 形参列表
        // 4. {} 方法体，可以写我们要执行的代码
        // 5. System.out.println("我是一个好人");
        // 表示我们的方法就是输出一句话
    }
    public void cal01(){
        int res = 0;
        for(int i = 1; i <= 100; i++){
            res += i;
        }
        System.out.println("cal01计算结果=" + res);
    }
    public void cal02(int n) {
        //1. (int n) 形参列表， 表示当前有一个形参 n, 可以接收用户输入
        int res = 0;
        for(int i = 1; i <= n; i++){
            res += i;
        }
        System.out.println("cal02计算结果=" + res);
    }
    public int getSum(int num1, int num2){
        int res = num1 + num2;
        return res;
    }

}