package BT4;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] listBook = new Book[2];
        input(listBook);
        output(listBook);
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a book name to find:");
        String nameToFind=scanner.nextLine();
        findBookByName(nameToFind,listBook);
        System.out.println(total(listBook));

    }

    public static void input(Book[] listBook) {
        for (int i = 0; i < 2; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập thông tin: ");
            String name = scanner.nextLine();
            String category = scanner.nextLine();
            String author = scanner.nextLine();
            double price = scanner.nextDouble();
            int amount = scanner.nextInt();
            Book book = new Book(name, price, amount, category, author);
            listBook[i] = book;


        }

    }

    public static void output(Book[] listBook) {
        for (int i = 0; i < 2; i++) {
            System.out.println(listBook[i]);
        }
    }
    public static double total(Book[] listBook) {
        int total = 0;
        for (int i = 0; i < listBook.length; i++) {
            total += listBook[i].getPrice() * listBook[i].getAmount();
        }
        return total;
    }
    public static void findBookByName(String name , Book[] listBook){
        for (int i = 0; i < listBook.length; i++) {
            if(name.equals(listBook[i].getName())){
                System.out.println(listBook[i]);
            }
        }
    }

}
