package MP2;
public class SMS implements Alerts {
    String recipient;
    String message;
    
    public SMS(String recipient, String message){
        this.recipient = recipient;
        this.message = message;
    }
 
    @Override
    public void send(){
        int length = message.length();
        double smscost = 0.02 * length;
        if (length > 100) {
            System.out.println("SMS messages are limited to 160 characters");
        }
        System.out.printf("SMS sent to %s : %s\n", recipient, message);
        System.out.printf("Cost: $%.2f\n", smscost);
    }
}
