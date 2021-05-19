package Check_518;

public class University {
    public static void main(String[] args) {
        Bachelor bachelor = new Bachelor("Tom", 18, '男', "15033761195", "河北", "篮球", "本科生", "运输学院");
        bachelor.work();
        System.out.println(bachelor.work1());
    }
}
