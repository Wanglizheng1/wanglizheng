package day6;
//课堂练习
public class ArithmeticOperatorExercise02 {
    public static void main(String[] args) {
        //1.需求:
        // 假如还有 59 天放假，问：合 xx 个星期零 xx 天
        // 2.思路分析
        // (1) 使用 int 变量 days 保存 天数
        // (2) 一个星期是 7 天 星期数 weeks： days / 7 零 xx 天 leftDays： days % 7
        // (3) 输出
        // 3.走代码
         int days = 59;
         int weeks = days / 7;//直接就取整了
         int leftDays = days % 7;
         System.out.println(days + "天 合" + weeks + "星期零"
                 + leftDays + "天");

         double huashi = 234.7;
        double sheshi = 5.0 / 9 * (huashi - 100);//5/7java会直接保留整数位0造成错误，改为5.0给足够的精度
         System.out.println("华氏温度" + huashi
          + "对应的摄氏温度为" + sheshi );

    }
}
