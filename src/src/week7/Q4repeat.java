package week7;

public class Q4repeat {
    /*4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.*/
    String name = "Shreeya";
    String name2 = "Shiv";
    static int x = 9;
   static int y = 13;
    public void m1(){
        System.out.println(name);
        System.out.println(name2);
        System.out.println(x);
        System.out.println(y);
    }
    public static void m2(){
        Q4repeat ex = new Q4repeat();
        System.out.println(ex.name);
        System.out.println(ex.name2);
        System.out.println(x);
        System.out.println(y);

    }
    public static void main(String []args){
        Q4repeat m3 = new Q4repeat();
        m3.m1();
        m2();
    }




}
