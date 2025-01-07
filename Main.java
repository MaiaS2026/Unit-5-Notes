public class Main {

   // This is the "TESTER CLASS" with a main method

   public static void main(String []args) {
      System.out.println("Constructing Student objects...");

      // Call DEFAULT CONSTRUCTOR
      // "Student senior" is the type declaration for a variable
      // "= new Student()" is calling the constructor
      Student kinder = new Student();

      // Call CONSTRUCTOR with PARAMETERS (String, String, int)
      Student junior = new Student("Maia", "Salgado", 2026);
      // Does argument order matter? YES!!!!
      //Student senior = new Student("Zoie", "Vitale", 2025);

      // Look at our consstructed student objects
      System.out.println(kinder); // will print the LOCATION of the object

      System.out.println(junior);

      // Construct two more Student objects & print them out
      Student junior2 = new Student ("Paige", "Nunez", 2026);
      System.out.println(junior2);
      Student senior2 = new Student ("Alex", "Greenholtz", 2025);
      System.out.println(senior2);

      // Test ACCESSOR/GETTER methods
      // methods that RETURN output need to be handled
      // 1. either by storing the output in a variable

      String juniorEmail = junior.getEmail();
      System.out.println(juniorEmail);
      // 2. or by using it directly
      System.out.println(kinder.getEmail());

      // Test MUTATOR/SETTER methods
      // void methods (no output)
      // but they need an argument (input)
      kinder.setFirstName("James");
      kinder.setLastName("Smith");
      kinder.setEmail("James.Walter2037@gwbl.org");
      System.out.println(kinder);

      // Use the Object class' equals () method
      // Checks the values of each instance variable
      // junior is the CALLING OBJECT, kinder is the argument
      boolean isEqual = junior.equals(kinder);

      // CALL our custom behavior methods
      // Example: no output, no input
      junior.complain();

      // Example: no output, needs input (includes FOR loop)
      junior.doHomework(8);

      // Testing the student class documentation
      // HOVER over the words to view the docs we wrote
      StudentDocs test = new StudentDocs("Talulah","Whelan", 2026);
      test.getEmail();
      test.setGradYear(2025);
      test.doHomework(10);


   }
}
