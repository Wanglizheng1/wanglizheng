package day15;
import java.util.Scanner;
public class ArrayAdd02 {
    public static void main(String[] args) {
        Scanner myScnner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        do {
            int[] arryNew = new int[arr.length - 1];
            for (int i = 0; i < arryNew.length; i++) {
                arryNew[i] = arr[i];
            }
            arr = arryNew;
            System.out.println("====缩减后效果====");
            for (int i = 0; i < arr.length; i++) {
                System.out.print( arryNew[i] + "\t");
            }
            System.out.println("是否继续缩减,y/n");
            char key = myScnner.next().charAt(0);
            if (key == 'n' || arr.length <= 1) {
                break;
            }
        }while (true) ;
    }
}
