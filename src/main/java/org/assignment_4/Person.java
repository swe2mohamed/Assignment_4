package org.assignment_4;

public class Person {
    // Field
    private final int id; // id: is an int representing each Person object.
    private String firstName;
    private String lastName;
    private String email;
    private AppUser credentials;

    // Constructor
    public Person(int id, String firstName, String lastName, String email){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Methods

    private int getId() {
        return id;
    }

    private String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null){
            throw new IllegalArgumentException("Error: The firstName cannot be null.");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null){
            throw new IllegalArgumentException("Error: The lastName cannot be null.");
        }
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null){
            throw new IllegalArgumentException("Error: The email cannot be null.");
        }
        this.email = email;
    }

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person other = (Person) obj;
        // return firstName.equals(other.firstName) && lastName.equals(other.lastName) && email.equals(other.email);
        return java.util.Objects.equals(firstName,other.firstName) &&
                java.util.Objects.equals(lastName,other.lastName) &&
                java.util.Objects.equals(email,other.email);
    }

    @Override
    public int hashCode() {
        // todo
        return super.hashCode();
    }

    @Override
    public String toString(){
        return "Id: " + getId() + " , FirstName: " + getFirstName() + " , LastName: " + getLastName() + " , Email: " + getEmail();
    }
}
