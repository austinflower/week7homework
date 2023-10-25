package week7;

public class Question3 {
    /*3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.*/
    String firstname = "Preksha";
    static String lastname = "Patel";

    public void m1(){
       System.out.println(firstname);
       System.out.println(lastname);
    }
    public static void m2(){
     Question3 t = new Question3();
     System.out.println(t.firstname);
     System.out.println(lastname);

    }
    public static void main(String [] args){
        Question3 ex = new Question3();
        ex.m1();
        m2();

    }







}
