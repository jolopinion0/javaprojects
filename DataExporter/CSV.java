package DataExporter;
public class CSV implements Exporter {
    String name;
    
    public CSV(String name){
        this.name = name;
    }
    
    @Override
    public void exportfile(){
        System.out.printf("\nExporting raw comma-separated CSV data of %s.csv", name);
    }
}
