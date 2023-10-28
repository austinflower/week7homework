package week7;

public class Stringq6 {
    /*6. Write a java program which replace a “I@love@java” to “we love java”
Expected output: We love java*/

    public static void main(String []args){
        String name ="I@love@java";
        String newnew = name.replace("I@","We ");
        String new2 = newnew.replace("@"," ");
        System.out.println(new2);

    }



}
