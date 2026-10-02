package challenge;

public class SprintSession implements Assessable {
    int hoursWorked;
    int taskComplexity;
    double baselineStress;
    
    public SprintSession(int hoursWorked, int taskComplexity, double baselineStress){
        this.hoursWorked = hoursWorked;
        this.taskComplexity = taskComplexity;
        this.baselineStress = baselineStress;
    }
    
    @Override
    public double calculateBurnoutRisk(){
        double baserisk = (hoursWorked * taskComplexity) / 10.0;
        
        double overtime;
        if (hoursWorked > 8){
            overtime = (hoursWorked - 8) * 0.5;
        } else {
            overtime = 0.0;
        }    
        
        return (baserisk + overtime) * baselineStress;
    }

    
}
