package user;
public class User {
    protected String firstName;
    protected String lastName;
    protected String secondName;
    
    public User(String firstName, String lastName, String secondName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    public String setFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }
    
    @Override
    public String toString() {
        return "User [firstName=" + firstName
                + ", lastName=" + lastName
                + ", secondName=" + secondName + "]";
    }
}