package day12;
//break使用
public class Break01 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            if(i == 3){
                break;//直接跳出while循环
            }
            System.out.println("i=" + i);
        }
    }
}
