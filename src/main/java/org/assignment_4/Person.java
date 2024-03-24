package org.assignment_4;

public class Person {
    // Field
    private int id; // id: is an int representing each Person object.
    private String firstName; // firstName: represents each person’s first name. Not allowed to be null
    private String lastName; // lastName: represents each person’s last name. Not allowed to be null
    private String email; // email: represents each person’s email. Not allowed to be null

    // Constructor

    // Methods

    private int getId() {
        return id;
    }

    private String getFirstName() {
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

    public String getSummary(){
        // todo:
         return null;
    }
}
