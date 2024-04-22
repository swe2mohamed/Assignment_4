package org.assignment_4;

public class AppUser{
    // Field
    private String userName; // username (private) is a String that acts as the id of AppUser. Not allowed to be null or empty.//
    private String password; // password (private) is a String that contains a password. Not allowed to be null or empty.
    private AppRole role; // role (private) contains an enumerated type marking the AppUser object as being a ROLE_APP_USER or ROLE_APP_ADMIN. Not allowed to be null. //

    // Constructor:

    // Methods:

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName == null || userName.isEmpty()){
            throw new IllegalArgumentException("Error: The username cannot be empty or null.");
        }
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.isEmpty()){
            throw new IllegalArgumentException("Error: The password cannot be empty or null.");
        }
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if (role == null){
            throw new IllegalArgumentException("Error: The role cannot be null.");
        }
        this.role = role;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AppUser other = (AppUser) obj;
        return userName.equals(other.userName) && role == other.role;
    }

    @Override
    public int hashCode() {
        // todo
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + " , UserName: " + getUserName() + " , Role: " + getRole();
    }
}
