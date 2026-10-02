package DataExporter;
public class PDF implements Exporter {
    String name;
    
    public PDF(String name){
        this.name = name;
    }
    
    @Override
    public void exportfile(){
        System.out.printf("Formatting and exporting %s.pdf", name);
    }
}
