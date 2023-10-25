package week7;

public class Question5 {
    /*5. Write a program for a calculator with addition, subtraction, multiplication, and division
methods all with parameters and use string concatenation methods. (Note: Two static
and Two instance methods.) */

    static int first = 10;
    static int second = 20;
    static int third = 30;
    static int forth = 40;

    public void add(){
    int addresult = first + second;
    System.out.println("Addition of " + first + " + " + second +" = " + addresult);
    }
    public void sub(){
        int subresult = first - second;
        System.out.println("Subtraction of " + first + " - " + second +" = " + subresult);
    }
    public static void multiply(){
        int multiplyresult = third * forth;
        System.out.println("Multiply of " + third + " * " + forth +" = " + multiplyresult);
    }
    public  static void divide(){
        float divideresult = (forth/third);
        System.out.println("Divide of " + forth + " / " + third +" = " + divideresult);
    }

  public static void main(String [] args){
        Question5 t = new Question5();
        t.add();
        t.sub();
        multiply();
        divide();



  }






}
