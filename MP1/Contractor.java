package MP1;
public class Contractor extends Worker {
    double hourlyRate;
    double hoursWorked;
    
    public Contractor(double hourlyRate, double hoursWorked, String name){
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double caculateWeeklyPay(){
        return hourlyRate * hoursWorked;
    }
    
    @Override
    public void processPayment(){
        System.out.printf("Issuing payment to %s for $%.1f%n", name, this.caculateWeeklyPay());
    }
}
