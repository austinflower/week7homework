package week7;

import java.util.Scanner;

public class Question12 {
    /*12. Write a Java program that takes three numbers as input to calculate and print the
average of the numbers.*/
    public void avg(){
        Scanner three = new Scanner(System.in);
        System.out.println("enter first number");
        int first = three.nextInt();
        System.out.println("enter second number");
        int second = three.nextInt();
        System.out.println("enter third number");
        int third = three.nextInt();
        double answer = ((first + second + third)/3);
        System.out.println("The average of: "+ first + ", " + second + ", "+ third +" is "+ answer);

    }

    public static void main(String [] args){
        Question12 ex = new Question12();
        ex.avg();

    }


}
