package check_7;

import java.util.Scanner;

/**
 * @author Wang
 * @version 0.0
 */
public class reverse {
    public static void reverse(int n) {
        int m;
        if (n == 0) return;

        m = n % 10;
        n = n / 10;
        System.out.print(m);
        reverse(n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        reverse(n);
    }
}
