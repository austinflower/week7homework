import java.util.Scanner;

public class Question6 {
    /*
    6. Write a program to enter any radius value of the circle and find out the area. (Formula
of Area A=PI*r*r).
*/
public  void area(){

    Scanner myScanvalue = new Scanner(System.in);
    System.out.println("Enter the radius of the circle: ");
    int radiusvalue = myScanvalue.nextInt();
    double area = Math.PI * radiusvalue * radiusvalue;
    System.out.println("The area of the circle with radius " + radiusvalue + " is: " + area);

}

public static void main (String [] args){
    Question6 t = new Question6();
    t.area();


}






}
