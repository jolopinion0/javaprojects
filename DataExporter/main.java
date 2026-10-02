package DataExporter;
import java.util.Scanner;
public class main {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.print("Enter name of PDF: ");
        String name = scan.next();
        
        PDF pdf = new PDF(name);
        CSV csv = new CSV(name);
        pdf.exportfile();
        csv.exportfile();
    }
}
