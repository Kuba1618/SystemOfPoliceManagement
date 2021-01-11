package User;

import java.util.Date;

public class PunishmentPerson extends Citizen {
    String guilt;
    int valueOfTicket;

    public PunishmentPerson(String name, String surname, String address, Date dateOfBirth, Long numberOfPhone, String mail) {
        super(name, surname, address, dateOfBirth, numberOfPhone, mail);
    }
}
