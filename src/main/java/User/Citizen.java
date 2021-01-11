package User;

import java.util.Date;

public class Citizen {
    private String name;
    private String surname;
    private String address;
    private Date dateOfBirth;
    private Long numberOfPhone;
    private String mailAddress;

    public Citizen(String name, String surname, String address, Date dateOfBirth, Long numberOfPhone,
                   String mail) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPhone = numberOfPhone;
        this.mailAddress = mail;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
         this.dateOfBirth = dateOfBirth;
    }

    public Long getNumberOfPhone() {
        return numberOfPhone;
    }

    public void setNumberOfPhone(Long numberOfPhone) {
        this.numberOfPhone = numberOfPhone;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }
}




