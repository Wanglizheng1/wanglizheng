package day5;

//char本质是整数，默认输出时，是unicode码对应的字符
public class CharDetail {
    public static void main(String[] args) {
       char c1 = 'a';
       char c2 = '王';
       char c3 = 29579;
       System.out.println((int)c1);//输出c1对应的数字
       System.out.println((int)c2);//输出c2对应的数字
       System.out.println(c3);//输出c3对应的字符
        //char可以运算，相当于整数，因为有对应的unicode码
        System.out.println('a' + 10);//输出97 + 10 = 207
        char c5 = 'a' + 10;
        System.out.println(c5);//输出107对应的字符》ASCII
    }
}
