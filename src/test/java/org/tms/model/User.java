package org.tms.model;

public class User {
    private String emailaddress = "svetlana_17.07@mail.ru";
    private String password = "gracheva";
    private String passwordfalse= "123456";
    private String emailcreate = "svetlana_17.07@mail.ru";


    public User() {
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordfalse() {
        return passwordfalse;
    }

    public void setPasswordfalse(String passwordfalse) {
        this.passwordfalse = passwordfalse;
    }

    public String getEmailcreate() {
        return emailcreate;
    }

    public void setEmailcreate(String emailcreate) {
        this.emailcreate = emailcreate;
    }
}
