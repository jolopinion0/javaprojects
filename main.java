package challenge;
public class main {
    public static void main(String[] args){
        
        SprintSession sprintsession = new SprintSession(10, 8, 1.2);
        
        double burnoutrisk = sprintsession.calculateBurnoutRisk();
        
        System.out.printf("Burnout Risk Score: %.1f%n", burnoutrisk);
    }
}
