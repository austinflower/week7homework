public class Question18 {
    /*18. Write a Java Program using below steps.
18.1 Declare your council name as static variables.
18.2 Declare your house number as instance variables.
18.3 Declare one instance method name borough() and call Static variable
18.4 Declare static method name address() and call instance variable
18.5 Call both user defined methods into main method.*/

    static String council = "Dallas Cowboys";
    int housenum = 2040;

    public void borough(){
        System.out.println(council);
    }
    public static void address(){
        Question18 ex = new Question18();
        System.out.println(ex.housenum);
    }
    public static void main(String [] args){
        Question18 ex2 = new Question18();
        ex2.borough();
        address();

    }
}
