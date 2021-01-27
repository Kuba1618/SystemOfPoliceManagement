package system;

import java.util.Date;

public class Protocol {
    private String title;
    private String description;
    private Date dateOfCompleteProtocol;
    private String status;

    public Protocol(String title, String description, Date date, String status){
        this.title = title;
        this.description = description;
        this.dateOfCompleteProtocol = date;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Date getDateOfCompleteProtocol() {
        return dateOfCompleteProtocol;
    }

    public void setDateOfCompleteProtocol(Date dateOfCompleteProtocol) {
        this.dateOfCompleteProtocol = dateOfCompleteProtocol;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
