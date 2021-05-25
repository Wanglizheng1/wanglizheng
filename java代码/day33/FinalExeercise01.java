package day33;

import com.sun.corba.se.impl.interceptors.PICurrent;

public class FinalExeercise01 {
    public static void main(String[] args) {
        Cal cal = new Cal(5.0);
        System.out.println("面积= " + cal.calArea());

    }
}
class Cal{
    private double radius;
    public final double PI = 3.14;
    public final double PI1;
    public final double PI2;
    {
        PI1 = 3.14;
    }

    public Cal(double radius) {
        this.radius = radius;
        PI2 = 3.14;
    }
    public double calArea(){
        return PI1 * Math.pow(radius,2);
    }
}