package week7;

public class Question2 {
    /*Write a Java programme using the following steps.
2.1 Declare two static variables.
2.2 Declare one static method.
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and run the programme.*/

    static String firstname = "Preksha";
    static String lastname = "Patel";

    public static void m2() {
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(firstname +" "+ lastname);

    }

      public static void main( String [] args){
        m2();

      }








}
