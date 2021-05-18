package day26;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("tom");
        Dog1 dog1 = new Dog1("大黄");
        Bone bone = new Bone("大棒骨");
        tom.feed(dog1, bone);

        Cat cat = new Cat("汤姆");
        Fish fish = new Fish("小黄花");
        tom.feed(cat, fish);

        Pig pig = new Pig("小花猪");
        Rice rice = new Rice("米饭");
        tom.feed(pig, rice);

    }

}

class Pig extends Animal1 {
    public Pig(String name) {
        super(name);
    }
}
class Rice extends Food {
    public Rice(String name) {
        super(name);
    }
}

class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //完成主人给小狗喂食
//    public void feed(Dog1 dog1, Bone bone) {
//        System.out.println(" 主人" + name + " 给" + dog1.getName() + "吃" + bone.getName());
//    }
//    public void feed(Cat cat, Fish fish) {
//        System.out.println(" 主人" + name + " 给" + cat.getName() + "吃" + fish.getName());
//    }
    public void feed(Animal1 animal1, Food food) {//多态的使用
        System.out.println(" 主人" + name + " 给" + animal1.getName() + "吃" + food.getName());
    }
}

class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Fish extends Food {
    public Fish(String name) {
        super(name);
    }
}

class Bone extends Food {
    public Bone(String name) {
        super(name);
    }
}

class Animal1 {
    private String name;

    public Animal1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cat extends Animal1 {
    public Cat(String name) {
        super(name);
    }
}

class Dog1 extends Animal1 {
    public Dog1(String name) {
        super(name);
    }
}