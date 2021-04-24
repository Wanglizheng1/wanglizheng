package day5;
public class ForceConvertDetail {
    public static void main(String[] args) {
       //强制类型转换细节
        // 强转符号只针对于最近的操作数有效往往会使用小括号提升优先级
//        int x =(int)10*3.5+6*1.5; double=》int。 wrong
        int y=(int)(10*3.5+6*1.5); //(int)44.0 => 44
        System.out.println(y);

    }
}
