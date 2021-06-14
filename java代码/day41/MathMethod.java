package day41;

/**
 * @author Wang
 * @version 0.0
 */
public class MathMethod {
    public static void main(String[] args) {
        System.out.println(Math.abs(-9));
        System.out.println(Math.pow(2, 4));
        System.out.println(Math.ceil(-3.1));//向上取整
        System.out.println(Math.floor(-3.1));//向下取整
        System.out.println(Math.round(-5.01));//四舍五入
        System.out.println(Math.sqrt(9.0));
        Math.random();//0<=x<1之间的随机小数
        for (int i = 0; i < 10; i++) {
            System.out.println((int)(2 + Math.random() * 6));
        }

        System.out.println(Math.max(1, 4));
        System.out.println(Math.min(1, 4));
    }
}
