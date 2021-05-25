package day33;

public class SingleTon01 {
    public static void main(String[] args) {
        GrilFriend instance = GrilFriend.getInstance();

        System.out.println(GrilFriend.getInstance());
    }
}
class GrilFriend{
    private String name;
    private static GrilFriend g1 = new GrilFriend("小红");
    //如何保障我们只能创建一个 GirlFriend 对象
    // 步骤[单例模式-饿汉式]
    // 1. 将构造器私有化
    // 2. 在类的内部直接创建私有静态对象(该对象是 static)
    // 3. 提供一个公共的 static 方法，返回 gf 对象
    private GrilFriend(String name) {
        this.name = name;
    }
    public static GrilFriend getInstance(){
        return g1;
    }

    @Override
    public String toString() {
        return "GrilFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}