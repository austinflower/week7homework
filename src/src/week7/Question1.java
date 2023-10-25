package week7;

public class Question1 {
    /*1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and run the programme.*/

    String firstname = "Preksha"; //instance variable 1
    String lastname = "Patel"; //instance variable 2

    //one instance method
    public void m1() {
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(firstname + " " + lastname);
    }

    //main method
public static  void main (String [] args){
        Question1 example = new Question1();
        example.m1();
}







}
