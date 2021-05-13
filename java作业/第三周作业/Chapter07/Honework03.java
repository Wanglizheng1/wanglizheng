package 第三周作业.Chapter07;

import java.util.Scanner;

public class Honework03 {
    public static void main(String[] args) {
       Book book = new Book(148,"HHA");
        book.info();
       book.updatePrice();
       book.info();
    }
}

class Book {
    String name;
    double price;
    public Book(double price, String name){
        this.price = price;
        this.name = name;
    }
    public void updatePrice() {
        if(price > 150){
            price = 150;
        }else if(price > 100){
            price = 100;
        }
    }
    public void info(){
        System.out.println("书名=" + name + "价格为" + price);
    }


}