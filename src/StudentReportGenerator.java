public class StudentReportGenerator {
    public static final int DEFAULT_YEAR = 2025;
    private String reportTitle;

    public StudentReportGenerator(String reportTitle){
        this.reportTitle = reportTitle;
    }

    public String generateReport(){
        return reportTitle + " " + DEFAULT_YEAR;
    }

    public static void main(String args[]){
        System.out.println("Testing 'ReportName'\nExpecting 'ReportName 2025'");
        StudentReportGenerator studentReportGenerator = new StudentReportGenerator("ReportName");
        String report = studentReportGenerator.generateReport();
        if (report.equals("ReportName 2025")){
            System.out.println("Test successful");
        } else {
            System.out.println("Test failure");
        }
    }
}
