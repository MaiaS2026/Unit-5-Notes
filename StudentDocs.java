/** 
 * StudentDocs.java
 * @author Maia Salgado
 * @since 6Jan2025
 * @version 1.0
 * This class defines a student object and includes formal documentation comments
 */

public class StudentDocs {
   
    private String firstName; 
    private String lastName;
    private int gradYear;
    private String email;

    /** 
     * Constructor that sets default values for each of the instance variables definied above
     */
    public StudentDocs () {
        firstName = "First";
        lastName = "Last";
        gradYear = 2037;
        email = firstName + "." + lastName + gradYear + "@gbwl.org";
    }

    /**
     * Constructor that assigns provided values to the objects instance variables, and creates and email address based on those values
     * @param initfirstName a String representing the Student's first name
     * @param initlastName a String representing the Student's last name
     * @param initGradYear an int representing the Student's graduation year
     */
    public StudentDocs (String initfirstName, String initlastName, int initGradYear) {
        firstName = initfirstName;
        lastName = initlastName;
        gradYear = initGradYear;
        email = firstName + "." + lastName + gradYear + "@gbwl.org";
    }


    public String toString() {
        return("Student[" + firstName + "," + lastName + "," + gradYear + "," + email + "]");
    }


    public String getfirstName() {
        return firstName;
    }
    public String getlastName() {
        return lastName;
    }
    public int getgradYear() {
        return gradYear;
    }
    public String getEmail() {
        return email;
    }

  
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }

   
    public void complain () {
       
        System.out.println("I am so exhausted");
    }
   
    public void doHomework (int numAssignments) {
     
        for (int i = numAssignments; i > 0; i--) {
            System.out.println("Working working working...");
        }
        System.out.println("Done with homework!");
    }

}