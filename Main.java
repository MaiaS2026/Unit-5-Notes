public class Main {

   public static void main(String []args) {
      System.out.println("Constructing Student objects...");

      // Call DEFAULT CONSTRUCTOR
      // "Student senior" is the type declaration for a variable
      // "= new Student()" is calling the constructor
      Student kinder = new Student();

      // Call CONSTRUCTOR with PARAMETERS
      Student junior = new Student("Maia", "Salgado", 2026);

   }
}
