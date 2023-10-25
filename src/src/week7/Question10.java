package week7;

import java.util.Scanner;

public class Question10 {

    /*Write a Java program that takes a number as input and prints its multiplication
table up to 10.
Test Data: Input a number: 8.
Expected Output:
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
8 x 10 = 80*/

    public static void multi(){
        Scanner table = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = table.nextInt();
        for (int i =1; i <= 10; i++){
            int result = num1 * i;
            System.out.println(num1 + " X " + i + " = " + result);
        }   }
    public static void main(String [] args){
        multi();
    }





}
