public class Stringq3 {
    /*3. Write a java program which replace a “I love java” to “we love java”
Expected output: We love java*/

    String name = "I love java";
    String newnew = name.replace("I", "We");

    public static void main(String []args){
        Stringq3 ex = new Stringq3();
        System.out.println(ex.name);
        System.out.println("Expected output:" + ex.newnew);
    }
}
