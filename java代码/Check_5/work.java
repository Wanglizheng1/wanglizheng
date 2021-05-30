package Check_5;

public class work {
    public static void main(String[] args) {
        int n = 134556;
        int cout1;
        int cout = (n + "").length();
        for (int i = 0; i < cout; i++) {
            cout1 = n % 10;
            System.out.println(cout1);
            n = n / 10;
        }
    }
}