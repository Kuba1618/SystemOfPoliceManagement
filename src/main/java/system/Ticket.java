package system;

import java.util.Date;

public class Ticket {
    private Integer valueOfTicket;
    private String kindOfTicket;
    private Date dateOfTicket;


    public Ticket(Integer value, String kindOfTicket, Date date){
        this.dateOfTicket = date;
        this.valueOfTicket = value;
        this.kindOfTicket = kindOfTicket;
    }

    public Date getDateOfTicket() {
        return dateOfTicket;
    }

    public void setDateOfTicket(Date dateOfTicket) {
        this.dateOfTicket = dateOfTicket;
    }

    public Integer getValueOfTicket() {
        return valueOfTicket;
    }

    public void setValueOfTicket(Integer valueOfTicket) {
        this.valueOfTicket = valueOfTicket;
    }

    public String getKindOfTicket() {
        return kindOfTicket;
    }

    public void setKindOfTicket(String kindOfTicket) {
        this.kindOfTicket = kindOfTicket;
    }
}
