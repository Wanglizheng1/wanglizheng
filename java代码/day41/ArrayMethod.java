package day41;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Wang
 * @version 0.0
 */
public class ArrayMethod {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,1,4};
        System.out.println(Arrays.toString(integers));
//        Arrays.sort(integers);//数组引用类型，会改变之前的数组
//        System.out.println(Arrays.toString(integers));
        ArrayMethod.c23(integers, new Comparator(){
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(integers));
    }
    public static void c23(Integer[] arr, Comparator C){
        C.compare(arr[1], arr[2]);
    }
}
