package day12;
//continue的使用
public class Continue01 {
    public static void main(String[] args) {
//        int i = 1;
//        while(i <= 4){
//            i++;
//            if(i == 2){
//                continue;
//            }
//            System.out.println("i = " + i);
//        }
        //continueDetail
        label1:
        for(int j = 0; j < 2; j++){
            label2:
            for(int i = 0; i < 10; i++){
                if(i == 2){ //看看分别输出什么值，并分析
//                     continue ;//等价 continue label2;
                     continue label1;
                 }
                 System.out.println("i = " + i);
            }
        }
    }
}
