package week7;

public class Question17 {
    /*Write a Java Program using below steps.
17.1 Declare your city as instance variables.
17.2 Declare your country as static variables.
17.3 Declare one instance method and call static variable in print statement
17.4 Declare static method and call instance variable in print Statement.
17.5 Call both user defined methods into main method.*/

    String city = "Prosper";
   static String country = "USA";
   public void imethod(){
       System.out.println("This instance method is calling a static variable: " + country);
   }
   public static void smethod(){
       Question17 ex = new Question17();
       System.out.println("This static method is calling a instant variable: " + ex.city);
   }
   public static void main (String [] args){
       Question17 m1 = new Question17();
       m1.imethod();
       smethod();
   }
}
