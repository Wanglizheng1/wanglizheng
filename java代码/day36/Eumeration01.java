package day36;

/**
 * @author Wang
 * @version 0.0
 */
public class Eumeration01 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING.name());
        System.out.println(Season.SPRING.getDesc());
    }

}

enum Season{
    SUMMER("夏天", "炎热"),

    SPRING("春天", "温暖") ;

    private String name;
    private String desc;

    Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}