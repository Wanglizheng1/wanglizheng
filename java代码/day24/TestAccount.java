package day24;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jacksmith");
        account.setPwd("12345");
        account.setBalance(2);
        account.showInfo();

    }
}
