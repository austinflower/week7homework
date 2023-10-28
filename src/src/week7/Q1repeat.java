package week7;

public class Q1repeat {
    /*1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and run the programme.*/
    String name = "Preksha"; //global variable/instance
    String name2 = "Patel"; //global, instance variable
    public void m1 (){  //instance method
        System.out.println(name);
        System.out.println(name2);

    }

    public static void main(String []args){
        Q1repeat ex = new Q1repeat();
        ex.m1();
    }
}
