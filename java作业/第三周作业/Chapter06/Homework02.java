package 第三周作业.Chapter06;

public class Homework02 {
    public static void main(String[] args) {
        String foo = "blue";
        boolean[] bar = new boolean[2];//默认false
        if(bar[0]){
            foo = "green";
        }
        System.out.println(foo);
    }
}
