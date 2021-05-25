package day33;
/*

 */
public class SingleTon02 {
    public static void main(String[] args) {
        Cat cat1 = Cat.getInstance();
        System.out.println(cat1);
    }
}

class Cat{
    private String name;
    private static Cat c1;
    private Cat(String name) {
        this.name = name;
    }
    //步驟
    // 1.仍然構造器私有化
    // 2.定義一個 static 靜態屬性對象
    // 3.提供一個 public 的 static 方法，可以返回一個 Cat 對象
    // 4.懶漢式，只有當用戶使用 getInstance 時，才返回 cat 對象, 後面再次調用時，會返回上次創建的 cat 對象
    // 從而保證了單例
    public static Cat getInstance(){
        if(c1 == null){
            c1 = new Cat("嗯嗯");
        }
        return c1;
    }

    @Override
    public String toString() {
        return "GrilFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}