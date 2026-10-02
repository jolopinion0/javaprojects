package MP1;
public abstract class Worker implements Payable {
    String name;
    public Worker(String name){
        this.name = name;
    }
    
    abstract double caculateWeeklyPay();
}
