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

    /** 
     * @return String representing the object instance variables
     */

    public String toString() {
        return("Student[" + firstName + "," + lastName + "," + gradYear + "," + email + "]");
    }

    /**
     * @return String representing first name of this student
     * @return String representing last name of this student
     * @return int representing grad year of this student
     * @return String representing email of this student
     */

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

    /**
     * @param newFirstName changes student's first name (string)
     */
  
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    /**
     * @param newLastName changes student's last name (string)
     */

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    /**
     * @param newGradYear changes student's grad year (int)
     */

    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }

    /**
     * @param newEmail changes student's email (string)
     */

    public void setEmail(String newEmail) {
        email = newEmail;
    }

   /**
    * Prints out a complaint method
    */
    public void complain () {
       
        System.out.println("I am so exhausted");
    }
   
    /**
     * Loops from numAssignments, decreasing until there are 0 assignments left and prints a message indicating the student is done with their homework
     * @param numAssignments - an int represennting the amount of homework assignments to be completed by the student 
     */
    public void doHomework (int numAssignments) {
     
        for (int i = numAssignments; i > 0; i--) {
            System.out.println("Working working working...");
        }
        System.out.println("Done with homework!");
    }

}