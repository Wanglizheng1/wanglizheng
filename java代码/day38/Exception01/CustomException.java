package day38.Exception01;

/**
 * @author Wang
 * @version 0.0
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 180;
        if(!(age>=12 && age <= 120)){

            throw new AgeException("年龄需要在18~120之间");
        }
        System.out.println("你的年龄范围正常");

    }
}

class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}