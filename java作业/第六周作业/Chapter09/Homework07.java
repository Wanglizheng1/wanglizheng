package 第六周作业.Chapter09;

/**
 * @author Wang
 * @version 0.0
 */
public class Homework07 {
    public static void main(String[] args) {
        Car car = new Car(60);
        car.getAir().flow();
        Car car1 = new Car(-1);
        car1.getAir().flow();
        Car car2 = new Car(20);
        car2.getAir().flow();

    }
}

class Car {
    private double tem;

    public Car(double tem) {
        this.tem = tem;
    }

    class Air {
        public void flow() {
            if (tem > 40) {
                System.out.println("空调吹冷气");
            } else if (tem < 0) {
                System.out.println("吹暖气");
            } else {
                System.out.println("温度正常，关闭空调");
            }
        }

    }

    public Air getAir() {
        return new Air();
    }
}