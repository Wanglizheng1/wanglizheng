package day11;
//do while 使用
public class DoWhile {
    public static void main(String[] args) {
        int i = 1;//循环变量初始化
        do{
            //循环执行语句
            System.out.println("王立峥" + i);
            //循环变量迭代
            i++;
        }while (i <= 10);
        System.out.println("退出do..while，继续执行.." + i);
    }
}
