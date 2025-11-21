public class ReportController {
    private ReportModel model;
    private ReportView view;

    public ReportController(ReportModel model, ReportView view) {
        this.model = model;
        this.view = view;
    }
}