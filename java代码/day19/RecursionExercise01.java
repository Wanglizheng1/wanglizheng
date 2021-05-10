package day19;

public class RecursionExercise01 {
    public static void main(String[] args) {
        M m1 = new M();
        int n = 7;
        int res = m1.fibonacci(n);
        if(res != -1){
            System.out.println("当n=" + n + "对应的斐波那契数据=" + res);
        }
    }
}

class M{
    public int fibonacci(int n){
        if(n >= 1){
            if(n == 1 || n == 2){
                return 1;
            }else {
                return fibonacci(n -1) + fibonacci(n -2);
            }
        }else{
            System.out.println("请输入大于1的数字");
            return -1;
        }

    }
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                map[i][j] = 2;
                if (findWay(map, i + 1, j)) {
                    return true;
                } else if (findWay(map, i - 1, j)) {
                    return true;
                } else if (findWay(map, i, j - 1)) {
                    return true;
                } else if (findWay(map, i, j + 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}