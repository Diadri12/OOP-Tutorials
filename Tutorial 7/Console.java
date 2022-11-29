package BookSystem;

import java.util.Scanner;

public class Console extends Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String Name = sc.next();
        System.out.println("Enter Price: ");
        int price = sc.nextInt();
        System.out.println("Enter Year Published: ");
        int year = sc.nextInt();
        System.out.println("Enter Author Name: ");
        String Author = sc.next();
    }
}
