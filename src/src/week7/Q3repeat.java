package week7;

public class Q3repeat {
    /*3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.*/
    String country = "USA";
    static int number = 1;
    public void preksha(){

        System.out.println(country);
        System.out.println(number);
    }
    public static void phone(){
        Q3repeat n2 = new Q3repeat();
        System.out.println(n2.country);
        System.out.println(number);

    }
    public static void main(String []args){
        Q3repeat n1 = new Q3repeat();
        n1.preksha();
        phone();


    }

}




