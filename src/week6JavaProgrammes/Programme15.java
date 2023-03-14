package week6JavaProgrammes;
//**15. Write a Java program to swap two variables.*/
public class Programme15 {
    public static void main(String[] args) {

            int a, b,degree;
            a = 10;
            b = 20;
            System.out.println("Before swapping : a, b = "+a+", "+ + b);
            degree = a;
            a = b;
            b = degree;
            System.out.println("After swapping : a, b = "+a+", "+ + b); // print function
    }
}
