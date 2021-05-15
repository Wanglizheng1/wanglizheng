package day24;

import day19.HanTower;

public class TestExtend {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "银角";
        pupil.age = 18;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();
        System.out.println("==========");
        Graduate graduate = new Graduate();
        graduate.name = "金角";
        graduate.age =  23;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();

    }

}
