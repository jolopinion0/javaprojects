package MP1;
import java.util.Scanner;
public class main {
    
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter your name: ");
        String name = scan.next();
        System.out.print("Enter your company's hourly rate: ");
        double HR = scan.nextDouble();
        System.out.print("Enter your hours worked: ");
        double HW = scan.nextDouble();
        
        Contractor alice = new Contractor(HR, HW, name);
        alice.processPayment();
    }
}
