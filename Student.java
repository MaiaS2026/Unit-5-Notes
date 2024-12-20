/* Example CLASS that defines an OBJECT
 Class names like Student are always capitalized!
 Object-Oriented Classes are like BLUEPRINTS
 (in another Java class, you create instances from this blueprint)
 */
public class Student {
    // 1. INSTANCE VARIABLES (attributes/data/fields)
    // think fo what this object "needs to know"
    // must be PRIVATE ("encapsulation")
    private String firstName; // "a Student has a name"
    private String lastName;
    private int gradYear;
    private String email;

    // 2. CONSTRUCTORS (manuals for setting up an object)

    // DEFAULT constructor (user did not provide data)
    // "no-argument" constructor
    // Job: initialize instance variables to default values
    public Student() {
        firstName = "First";
        lastName = "Last";
        gradYear = 2037;
        email = firstName + "." + lastName + gradYear + "@gbwl.org";
    }

    // Constructor with PARAMETERS (user provided key data)
    // Job: initialize instance variables to PROVIDED values
    // ORDER OF PARAMETERS IS IMPORTANT!!! (the data types)
    // "initfirstName", etc. are like PLACEHOLDERS for real values
    public Student (String initfirstName, String initlastName, int initGradYear) {
        firstName = initfirstName;
        lastName = initlastName;
        gradYear = initGradYear;
        email = firstName + "." + lastName + gradYear + "@gbwl.org";
    }

    // 3. METHODS (behaviors associated w/the object type)

    // toString method provides a "String Representation"
    // of an obejct instance with all its data!
    public String toString() {
        return("Student[" + firstName + "," + lastName + "," + gradYear + "," + email + "]");
    }

    // ACCESSOR METHODS "Getters" return copies of the private data
    // write one for each of your instance variables 
    // for the name variable
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

    // MUTATOR METODS ("Setters") accept a new value 
    // and change the instance variable to it 
    // Setters are VOID, meaning NO RETURN (output)
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

    // OTHER METHODS (behaviors/actions associated with the object)

    // Example: VOID method, no parameters
    public void complain () {
        // method BODY is the step(s) for this process
        System.out.println("I am so exhausted");
    }
    // Example: VOID method, needs a parameter
    public void doHomework (int numAssignments) {
        // Print a message for each assignment completed
        for (int i = numAssignments; i > 0; i--) {
            System.out.println("Working working working...");
        }
        System.out.println("Done with homework!");
    }

}