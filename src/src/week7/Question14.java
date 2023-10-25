package week7;

import java.util.Scanner;

public class Question14 {
    /*Write a Java program to print the sum (addition), multiply, subtract, divide and
    remainder of two numbers.
    Test Data:
    Input first number: 125
    Input second number: 24
    Expected Output:
            125 + 24 = 149
            125 - 24 = 101
            125 x 24 = 3000
            125 / 24 = 5
            125 mod 24 = 5*/
    public static void math(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int first = scanner.nextInt();
        System.out.println("Input second number: ");
        int second = scanner.nextInt();
        int add = first + second;
        int sub = first - second;
        int multi = first * second;
        double div = first / second;
        double remainder = first % second;
        System.out.println(first + " + " + second + " = " + add);
        System.out.println(first + " - " + second + " = " + sub);
        System.out.println(first + " * " + second + " = " + multi);
        System.out.println(first + " / " + second + " = " + div);
        System.out.println(first + " mod " + second + " = " + remainder);
        }

public static void main(String [] args){
        math();
    }
}
