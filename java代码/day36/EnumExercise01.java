package day36;

import java.util.Scanner;

/**
 * @author Wang
 * @version 0.0
 */
public class EnumExercise01 {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        System.out.println("===输入序列===");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        for (Week week : weeks) {
            if (week.getNum() == i) {
                System.out.println(week);
            }
        }
    }
}

enum Week {
    MONDAY("星期一", 1),
    TUESDAY("星期二", 2),
    WEDNESDAY("星期三", 3),
    THURSDAY("星期四", 4),
    FRIDAY("星期五", 5),
    SATURDAY("星期六", 6),
    SUNDAY("星期日", 7);
    private String name;
    private int num;

    Week(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }
}