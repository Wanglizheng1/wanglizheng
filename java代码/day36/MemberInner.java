package day36;

public class MemberInner {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.hi();
        Outer.Inner inner1 = outer.getInner();
        inner1.hi();



    }
}
class Outer{
    private String name = "jack";
    public class Inner{
        public void hi(){
            System.out.println(name);
        }
    }
    public Inner getInner(){
        return new Inner();
    }

}