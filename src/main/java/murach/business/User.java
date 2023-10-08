package murach.business;

import java.io.Serializable;
import java.time.LocalDate;

public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String birthDate;
    private String heardFrom;
    private String wantsUpdates;
    private String contactVia;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        birthDate="";
        heardFrom= "";
        wantsUpdates= "";
        contactVia= "";
    }
    
    public User(String firstName, String lastName, String email, String heardFrom, String wantsUpdates,String contactVia) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.heardFrom = heardFrom;
        this.wantsUpdates = wantsUpdates;
        this.contactVia=contactVia;
    }
    
    public User(String firstName, String lastName, String email, String birthDate, String heardFrom, String wantsUpdates,String contactVia) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;
        this.heardFrom = heardFrom;
        this.wantsUpdates = wantsUpdates;
        this.contactVia=contactVia;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    
    public String getHeardFrom() {
        return heardFrom;
    }

    public void setHeardFrom(String heardFrom) {
        this.heardFrom = heardFrom;
    }

    public String getWantsUpdates() {
        return wantsUpdates;
    }

    public void setWantsUpdates(String wantsUpdates) {
        this.wantsUpdates = wantsUpdates;
    }

    public String getContactVia() {
        return contactVia;
    }

    public void setContactVia(String contactVia) {
        this.contactVia = contactVia;
    }   
}