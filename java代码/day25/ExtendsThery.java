package day25;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ExtendsThery {
    public static void main(String[] args) {
        Son son = new Son();
        //(1) 首先看子类是否有该属性
        // (2) 如果子类有这个属性，并且可以访问，则返回信息
        // (3) 如果子类没有这个属性，就看父类有没有这个属性
        // (如果父类有该属性，并且可以访问，就返回信息..)
        // (4) 如果父类没有就按照(3)的规则，继续找上级父类，直到 Object...
        //就近原则
        System.out.println(son.name);
//        System.out.println(son.age);//private不能访问
        System.out.println(son.hobby);

    }

}

class GrandPa{
    String name = "大头爷爷";
    String hobby = "旅游";
}

class Father extends GrandPa{
    String name = "大头爸爸";
    private int age = 39;
}
class Son extends Father{
    String name = "大头儿子";
}