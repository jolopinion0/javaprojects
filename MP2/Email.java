package MP2;
public class Email implements Alerts {
    String recipient;
    String message;
    
    public Email(String recipient, String message){
        this.recipient = recipient;
        this.message = message;
    }
    
    @Override
    public void send(){
        System.out.printf("Email sent to %s free of charge: %s\n", recipient, message);
    }
}
