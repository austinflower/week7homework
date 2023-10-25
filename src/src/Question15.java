import java.util.Scanner;

public class Question15 {
    /*Write a Java program to convert a given string into lowercase.
Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output: the quick brown fox jumps over the lazy dog.*/

    public static void tolower(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in all uppercase:");
        String input = scanner.nextLine();
        String output = input.toLowerCase();
        System.out.println("String in lowercase: " + output);


    }
    public static void main(String [] args){
        tolower();
    }


}
