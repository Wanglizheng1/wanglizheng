package 第六周作业.Chapter09;

/**
 * @author Wang
 * @version 0.0
 */
public class HomeWork08 {
    public static void main(String[] args) {
        Color color = Color.RED;
        color.show();
        switch (color){
            case RED:
                System.out.println("匹配红色");
                break;
            case BLUE:
                System.out.println("匹配蓝色");
                break;
            default:
                System.out.println("没有匹配到颜色");
                break;
        }

    }
}
enum Color implements IMyInterface{
    RED(255, 0, 0),BLUE(0,0,255);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值" + redValue + "," + greenValue + "," + blueValue);
    }
}
interface IMyInterface{
    void show();
}