
package day11;

//for快速入门
public class ForDetail {
    public static void main(String[] args) {
//        for(int i = 1; i <=10; i++ ){
//            System.out.println("程序继续执行" + i);
//        }
        //初始化和变量迭代可以放在别的地方
        int i = 1;//循环外边使用i，写在外边
        for(; i <=10; ){
            System.out.println("程序继续执行" + i);
            i++;
        }
//        for(; ;){//表示无限循环，死循环+break
//            System.out.println("程序继续执行" );
//        }

    }
}
