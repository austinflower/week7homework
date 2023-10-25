public class Stringq2 {
    /*2. Write a java program which remove extra space from both side “ I love
java ”
Expected output: “I love java”*/
    String name = "     I love java   ";
    String small = name.trim();
    public static void main(String []args){
        Stringq2 ex =new Stringq2();
        System.out.println(ex.name);
        System.out.println("Expected output: "+ ex.small );

    }

}
