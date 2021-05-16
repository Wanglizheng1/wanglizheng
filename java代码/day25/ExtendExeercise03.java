package day25;

public class ExtendExeercise03 {
    public static void main(String[] args) {
        PC pc = new PC("intel", 16, 500, "IBM");
        pc.info();

    }
}
class Computer{
    public String cpu;
    private int memory;
    private int disk;

    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }
    public String getDetail(){
        return " cpu= " + cpu + " memory= " + memory + " disk= " + disk;
    }

    public String getCpu() {
        return cpu;
    }

    public int getMemory() {
        return memory;
    }

    public int getDisk() {
        return disk;
    }
}
class PC extends Computer{
    private String brand;
    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void info(){
        System.out.println("pc信息如下：");
        System.out.println(getDetail() + " brand=" + brand);
    }
}