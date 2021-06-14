package day41;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Wang
 * @version 0.0
 */
public class LocalData {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.plusDays(777));


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年M月dd日  HH小时mm分钟ss秒");
        System.out.println(dtf.format(ldt));

    }
}
