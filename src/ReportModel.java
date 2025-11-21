public class ReportModel {
    private String data;

    public String getData() {
        return this.data;
    }

    public void fetchDataFromDatabase() {
        System.out.println("Fetching data...");
        this.data = "raw data";
    }

    public void parseXMLData() {
        System.out.println("Parsing data as XML...");
        // logic to parse this.data
    }
}