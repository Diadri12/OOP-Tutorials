package Interfaces;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Student implements Printable {
    String name;
    String Grade[] = new String[5];

    public Student(){
        this.name = name;
        this.Grade = Grade;
    }

    @Override
    public void print() {
        System.out.println("Enter name of Student");
        Scanner Sc = new Scanner(System.in);
        String name = Sc.next();
        System.out.println("Enter grades of student");
        for(int x = 1; x <= Grade.length;x++){
            String Grade = Sc.next();
        }
        System.out.println(name);
        System.out.println(Arrays.toString(Grade));
    }
}
