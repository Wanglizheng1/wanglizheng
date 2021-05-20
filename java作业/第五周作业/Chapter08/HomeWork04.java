package 第五周作业.Chapter08;

public class HomeWork04 {
    public static void main(String[] args) {
        Manager manager = new Manager("liu", 100, 20, 1.2);
        manager.setBonus(3000);
        manager.printSal();

        Worker wor = new Worker("关于", 200, 10, 1.0);
        wor.printSal();
    }

}
