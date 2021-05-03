package day11;
//while循环案例
public class While01 {
    public static void main(String[] args) {
        //输出10句hello，world!
        int i = 0;
        while(i < 10){
            System.out.println("hello，world!" + i);
            i++;
        }
        System.out.println("退出while循环，继续。。" + i);
    }
}
