package 第六周作业.Chapter11;

import com.sun.org.apache.bcel.internal.generic.ArithmeticInstruction;

/**
 * @author Wang
 * @version 0.0
 */
public class Homework01 {
    public static void main(String[] args) {
        try {
            if(args.length != 2){
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = cal(n1, n2);
            System.out.println("计算的结果是" + res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());;
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确，需要输出整数");;
        }catch (ArithmeticException e){
            System.out.println("/0");
        }
    }

    public static double cal(int n1, int n2) {
        return n1 / n2;
    }
}
