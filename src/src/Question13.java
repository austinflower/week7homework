import java.util.Scanner;

public class Question13 {
    /*Write a Java program to print the area and perimeter of a rectangle.
Test Data:Width = 5.5 Height = 8.5
Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/
    public static void rectangle() {
        Scanner area = new Scanner(System.in);
        System.out.println("enter width");
        float width = area.nextFloat();
        System.out.println("enter height");
        float height = area.nextFloat();
        float areaanswer = width * height;
        float perimeter = (2 * (width + height));
        System.out.println("Area is " + width + " * " + height + " = "+ String.format("%.2f", areaanswer));
        System.out.println("Perimeter is 2 * ("+ width + " + " + height + ") = " + String.format("%.2f", perimeter));

            }
    public static void main( String [] args){
        rectangle();
    }


}
