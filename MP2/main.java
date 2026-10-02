package MP2;
import java.util.Scanner;

public class main {
    static Scanner scan = new Scanner(System.in);
    
    public static String inputmsg(){
        System.out.print("Message: ");
        return scan.nextLine();
    }
    
    public static String inputrecipient(){
        System.out.print("Send to: ");
        return scan.nextLine();
    }
    
    public static String typeofmessage(){
        System.out.print("Email or SMS: ");
        return scan.nextLine();
    }
    
    public static void inputinfo(String type, Alerts[] info){
        if (type.equalsIgnoreCase("Email")) {
            info[0].send();
            
        } else if (type.equalsIgnoreCase("SMS")) {
            info[1].send();
            
        } else {
            System.out.println("Email or SMS only");
        }
    }
            
    public static void main(String[] args) {
        String type;
        
        do {
            type = typeofmessage();
            
            if (type.equalsIgnoreCase("Email") == false && type.equalsIgnoreCase("SMS") == false) {
                System.out.println("Email or SMS only");
            }
            
        } while (type.equalsIgnoreCase("Email") == false && type.equalsIgnoreCase("SMS") == false);
        
        String recipient = inputrecipient();
        String answer;
        
        do {
            String message = inputmsg();

            Alerts[] info = new Alerts[2];
            info[0] = new Email(recipient, message);
            info[1] = new SMS(recipient, message);

            inputinfo(type, info);

            System.out.printf("Do you want to send another message to %s: ", recipient);
            answer = scan.nextLine();

        } while (answer.equalsIgnoreCase("yes"));
    }
}