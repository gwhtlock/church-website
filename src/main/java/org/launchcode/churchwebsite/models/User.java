package org.launchcode.churchwebsite.models;









import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;


    private String firstName;


    private String lastName;


    private String userName;


    private String password;

    public User(String fName, String lName, String uName, String pword){
        this.firstName = fName;
        this.lastName = lName;
        this.userName = uName;
        this.password = pword;
    }

    public User(){}

    public int getId() {
        return id;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
