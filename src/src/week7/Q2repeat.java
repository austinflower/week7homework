package week7;

public class Q2repeat {
    /*2. Write a Java programme using the following steps.
2.1 Declare two static variables.
2.2 Declare one static method.
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and run the programme.*/
    static int zipcode = 12345; // static variable
    static String city = "Prosper";
    public static void address(){
        System.out.println(zipcode);
        System.out.println(city);

    }
    public static void main(String []args){
        address();
    }


}
