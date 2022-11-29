package Interfaces;

import java.util.Scanner;

public class Letter implements Printable{
    String textField;

    public Letter(){
        this.textField = textField;
    }

    @Override
    public void print() {
        Scanner Sc2 = new Scanner(System.in);
        String text = Sc2.next();
        System.out.println(text);
    }
}
