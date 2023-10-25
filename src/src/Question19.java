public class Question19 {
    /*19. Write a Java Program using below steps.
19.1 Declare one of your group member names as instance variable.
19.2 Declare one of your group member names as static variable.
19.3 Declare one instance method name with group name (e.g. selenium())and call both global
variables.
19.4 Declare static method name agile() and call both variable
19.5 Call both user defined methods into main method.
Note: Declare 1 local variables in all user defined method and main method and print in to statement*/

    String name = "Chetan Patel-Instant variable global";
    static String name2 = "Preksha Patel - Static variable global";

    public void selenium(){
        String sele = "local variable in instance method - local";
        System.out.println(name);
        System.out.println(name2);

    }
    public static void agile(){
        String agi = "Local variable in static method - local";
        Question19 ex = new Question19();
        System.out.println(ex.name);
        System.out.println(name2);

    }
    public static void main (String [] args){
       String  ma = "Local static variable in main method";
       Question19 m2 = new Question19();
       m2.selenium();
       agile();

    }
}
