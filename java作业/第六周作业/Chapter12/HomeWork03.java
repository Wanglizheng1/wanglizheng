package 第六周作业.Chapter12;

/**
 * @author Wang
 * @version 0.0
 */
public class HomeWork03 {
    public static void main(String[] args) {
        String name = "Wang Li Zheng";
        new HomeWork03().printName(name);

    }
    public void printName(String str){
        if(str == null){
            System.out.println("字符串不能为空");
            return;
        }

        String[] s = str.split(" ");
        if(s.length != 3){
            System.out.println("输入的字符串格式不对");
            return;
        }

        String format = String.format("%s,%s .%c", s[2], s[0], s[1].toUpperCase().charAt(0));
        System.out.println(format);

    }

}
