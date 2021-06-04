package 第六周作业.Chapter09;

/**
 * @author Wang
 * @version 0.0
 */
public class HomeWork06 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        Boat boat = new Boat();
        new Person("唐僧", horse).work();
        new Person("唐僧", boat).work();
    }
}
interface Vehicles{
    void work();
}

class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("以马为交通工具");
    }
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("坐船过河");
    }
}
class Person{
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void work(){
        if (vehicles != null){
            Vehicles vehicles = new Horse();
        }
        System.out.print(name);
        vehicles.work();
    }
}
