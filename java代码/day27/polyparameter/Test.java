package day27.polyparameter;

public class Test {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manger milan = new Manger("milan", 5000, 20000);
        Test test = new Test();
        test.showEmpAnnual(tom);
        test.showEmpAnnual(milan);

        test.testWork(tom);
        test.testWork(milan);
    }



    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
    public void testWork(Employee e){
        if(e instanceof Worker){
            ((Worker) e).work();//有向下转换操作
        }else if(e instanceof Manger){
            ((Manger) e).manger();
        }else{
            System.out.println("不处理");
        }
    }

}
