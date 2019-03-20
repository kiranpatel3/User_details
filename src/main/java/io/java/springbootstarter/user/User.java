package io.java.springbootstarter.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private int id;
    private String firstname;
    private String lastname;
    private String emailid;
    private String gender;

    public User(){

    }

    public User(int id, String firstname, String lastname, String emailid, String gender) {
        super();
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailid = emailid;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
