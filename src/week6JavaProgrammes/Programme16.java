package week6JavaProgrammes;

import java.util.Scanner;

//**16. Write a Java program to add two binary numbers.
//
//Input Data:
//Input first binary number: 10
//Input second binary number: 11
//Expected Output:
//
//Sum of two binary numbers: 101 */
public class Programme16 {
    public static void main(String[] args) {
        Scanner Programme16= new Scanner(System.in);
        System.out.print("Enter First Binary number: ");// input data
        int num1 = Programme16.nextInt(2);
        System.out.print("Enter second Binary number: ");// input data
        int num2 = Programme16.nextInt(2);

        System.out.println("Sum of two Binary numbers: " + Integer.toBinaryString(num1 + num2));

        Programme16.close();
    }
}
