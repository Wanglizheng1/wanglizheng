package day15;

import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        Scanner myScnner = new Scanner(System.in);
        int[] arr = {1, 2, 3};
        do {
            int[] arryNew = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                arryNew[i] = arr[i];
            }
            System.out.println("请输入要添加的元素");
            int num = myScnner.nextInt();
            arryNew[arryNew.length - 1] = num;
            arr = arryNew;
            System.out.println("====扩容后效果====");
            for (int i = 0; i < arr.length; i++) {
                System.out.print( arryNew[i] + "\t");
            }
            System.out.println("是否继续添加,y/n");
            char key = myScnner.next().charAt(0);
            if (key == 'n') {
                break;
            }
        }while (true) ;
    }
}
