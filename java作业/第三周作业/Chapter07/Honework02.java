package 第三周作业.Chapter07;

import java.util.Scanner;

public class Honework02 {
    public static void main(String[] args) {
        String[] arr = {"d", "s", "t"};
        Scanner myscaner = new Scanner(System.in);
        System.out.println("亲输入字符串");
        String s1 = myscaner.next();
        A02 ao2 = new A02();
        System.out.println(ao2.find(arr, s1));
    }
}

class A02 {
    public int find(String[] arr, String s1) {
        for (int i = 0; i < arr.length; i++) {
            if (s1.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }
}