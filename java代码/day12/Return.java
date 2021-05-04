package day12;

public class Return {
    public static void main(String[] args) {
        for(int i = 1; i<5; i++){
            if(i==3){
                System.out.println("韩顺平教育" +i);
//                break;
//                continue;
                return;//return用在方法时，表示跳出方法；在main中时，表示结束程序
            }
            System.out.println("Hello，world！" +i);
        }
        System.out.println("go on...");
    }
}
