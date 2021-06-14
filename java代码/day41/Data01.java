package day41;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Wang
 * @version 0.0
 */
public class Data01 {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println(data);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String format = sdf.format(data);
        System.out.println(format);



    }
}
