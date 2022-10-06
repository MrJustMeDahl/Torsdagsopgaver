package Task3;

public class Costumer {

    private String firstName;
    private String lastName;
    private String userName;
    private int ID;

    public Costumer(String firstName, String lastName, String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getUserName(){
        return userName;
    }

    public String toString(){
        return "The costumer's name is: " + firstName + lastName + " and has the username " + userName;
    }

}
