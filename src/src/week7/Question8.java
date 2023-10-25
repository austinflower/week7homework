package week7;

import java.util.Scanner;

public class Question8 {
    /*Write a program to insert any temperature value in degree Celsius and convert to
degree Fahrenheit ((0°C × 9/5) + 32)
*/

    public void tempvalue(){
        Scanner celsius = new Scanner(System.in);
        System.out.println("insert any temperature value in degree Celsius");
        int cel = celsius.nextInt();

        float newtemp = ((cel * (9.f/5) + 32));
        System.out.println(cel + " Celsius = " + newtemp + " in  fehrenheit");
    }
    public static void main(String []args){
        Question8 ex = new Question8();
        ex.tempvalue();

    }




















}
