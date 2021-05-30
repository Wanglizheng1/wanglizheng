package day35;

import org.jcp.xml.dsig.internal.dom.DOMUtils;

import javax.crypto.spec.PSource;

public class InnerClass01 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }

}


interface Bell{
    void ring();
}
class CellPhone{
    public void alarmclock(Bell bell){
        bell.ring();
    }
}