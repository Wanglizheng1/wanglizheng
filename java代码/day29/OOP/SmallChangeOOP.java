package day29.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeOOP {
    boolean loop = true;
    double money = 0;
    double balance = 0;
    String why = " ";

    Scanner scanner = new Scanner(System.in);
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm");

    String change = " ";
    String detail = "-------------零钱通明细-------------";

    public void meauShow() {
        do {
            System.out.println("=============零钱通菜单(OOP)=============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");

            System.out.println("请选择(1-4): ");
            change = scanner.next();
            switch (change) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("输入命令有误");
                    break;
            }
        } while (loop);
        System.out.println("退出了零钱通~");
    }

    public void detail() {
        System.out.println(detail);
    }

    public void income() {
        System.out.println("收益入账金额:");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("收益金额需要大于0");
            return;
        }
        balance += money;
        date = new Date();
        detail += "\n收益入账\t+" + money + "\t" + sdf.format(date)
                + "\t" + balance;
    }

    public void pay() {
        System.out.println("消费金额:");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("您的消费金额 应该在 0-" + balance);
            return;
        }
        System.out.println("消费说明:");
        why = scanner.next();
        balance -= money;
        date = new Date();
        detail += "\n" + why + "\t-" + money + "\t" + sdf.format(date)
                + "\t" + balance;
    }

    public void exit() {
        String exit = "";
        while (true) {
            System.out.println("确认要退出吗？ y/n");
            exit = scanner.next();
            if ("y".equals(exit) || "n".equals(exit)) {
                break;
            }
        }
        if (exit.equals("y")) {
            loop = false;
        }
    }
}
