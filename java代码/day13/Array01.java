package day13;
//数组的引出
public class Array01 {
    public static void main(String[] args) {
        //定义数组
        //double[]表示double类型的数组，数组名为hens
        //{3, 5, 1, 3.4, 2, 50}表示数组的值/元素
        //依次表示数组的第几个元素
        double[] hens = {3, 5, 1, 3.4, 2, 50};
        double totalweight = 0;
        //遍历数组得到数组所有元素的和，for循环
        for(int i = 0; i < hens.length; i++){
//            System.out.println("第" + (i + 1) + "个元素的值" + hens[i]);
              totalweight += hens[i];
        }
        System.out.println("平均体重为" + (totalweight / hens.length));
    }
}
