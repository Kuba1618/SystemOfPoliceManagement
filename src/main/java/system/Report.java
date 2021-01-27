package system;

import java.util.Date;

public class Report {
    int numberOfReport;
    String title;
    Date dateOfReport;
    String description;

    public Report(int numberOfReport,String title ,Date dateOfReport,String description)
    {
        this.numberOfReport = numberOfReport;
        this.title = title;
        this.dateOfReport = dateOfReport;
        this.description = description;
    }
    public void addReport(){}
    public void archiveReport(){}
    public void deleteReport(){}
}
