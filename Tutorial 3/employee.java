import java.util.Scanner;

public class employee {
    String name;
    double salary;

    public void employeeDetails(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        this.name = Sc.next();
        System.out.println("Enter salary: ");
        this.salary = Sc.nextDouble();
    }

    public static void main(String[] args){

    }
}
