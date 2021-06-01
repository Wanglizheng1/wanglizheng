package day36;

/**
 * @author Wang
 * @version 0.0
 */
public class EnumExercise01 {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        System.out.println("===所有星期的信息如下===");
        for (Week week: weeks){
            System.out.println(week.getName());
        }
    }
}
enum Week{
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");
    private String name;

    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}