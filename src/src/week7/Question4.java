package week7;

public class Question4 {
    /*4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.*/

    String firstname = "Preksha";
    String lastname = "Patel";
    static String name = "Durga";
    static String last = "Pooja";
    public void m3(){
       System.out.println(firstname);
       System.out.println(lastname);
       System.out.println(name + " "+ last);
    }
    public static void m2(){
        Question4 y = new Question4();
        System.out.println(y.firstname);
        System.out.println(y.lastname);
        System.out.println(name + " " +last);
    }
    public static void main (String [] args){
        Question4 x = new Question4();
        x.m3();
        m2();
        
    }

}
