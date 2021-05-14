package 第三周作业.Chapter07;

public class Honework13 {
    public static void main(String[] args) {
        Cricle1 c1 = new Cricle1(3);
        PassObject pa = new PassObject();
        pa.printAreas(c1, 5);
        
    }
}

class Cricle1 {
    double r;

    public Cricle1(double r) {
        this.r = r;
    }


    public double findArea() {
        double s1 = Math.PI * r * r;
        return s1;
    }

    public void setR(double r) {
        this.r = r;
    }
}

class PassObject {
    public void printAreas(Cricle1 c, int time) {
        System.out.println("radius\tarea");
        for (int i = 1; i <= time; i++) {
            c.setR(i);
            System.out.println((double) i + "\t" + c.findArea());
        }
    }
}