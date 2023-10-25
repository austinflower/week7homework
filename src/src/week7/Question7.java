package week7;

import java.util.Scanner;

public class Question7 {
    /*
    Write a program to insert any temperature value in degree Fahrenheit and convert
to degree Celsius ((F − 32) × 5/9 = 0°C).
*/
    public static  void FahrenheitToCelisu (){
        Scanner fahvalue = new Scanner(System.in);
        System.out.println("insert any temperature value in degree Fahrenheit: ");
        int fahdegree = fahvalue.nextInt();
        //float fivenine = 5.f/9;
        float newtemp = ((fahdegree - 32) * (5.f/9));
        System.out.println(fahdegree+ " Degree Fahrenheit is equal to " + newtemp +" in Celsius.");

    }
    public  static void main(String [] args){
        FahrenheitToCelisu();

    }




}
