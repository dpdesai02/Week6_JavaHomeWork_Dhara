package week6JavaProgrammes;

import java.util.Scanner;

//**10. Write a Java program that takes a number as input and prints its
//multiplication table up to 10.
//Test Data: Input a number: 8
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...8 x 10 = 80*/
public class Programme10 {
    public static void main(String[] args) {

        Scanner Programme10 = new Scanner(System.in);
        System.out.print("Input table number: ");
        int num1 = Programme10.nextInt();
        System.out.println(num1 + " * " + 1 + " = " + (num1 * 1));
        System.out.println(num1 + " * " + 2 + " = " + (num1 * 2));
        System.out.println(num1 + " * " + 3 + " = " + (num1 * 3));
        System.out.println(num1 + " * " + 4 + " = " + (num1 * 4));
        System.out.println(num1 + " * " + 5 + " = " + (num1 * 5));
        System.out.println(num1 + " * " + 6 + " = " + (num1 * 6));
        System.out.println(num1 + " * " + 7 + " = " + (num1 * 7));
        System.out.println(num1 + " * " + 8 + " = " + (num1 * 8));
        System.out.println(num1 + " * " + 9 + " = " + (num1 * 9));
        System.out.println(num1 + " * " + 10 + " = " + (num1 * 10));

        Programme10.close();


    }
}
