package week6JavaProgrammes;

import java.util.Scanner;

//**17. Write a Java program to convert a decimal number to binary number.
//
//Input Data:
//Input a Decimal Number : 5
//Expected Output
//
//Binary number is: 101 */
public class Programme17 {
    public static void main(String[] args) {

        Scanner Programme17 = new Scanner(System.in);
        System.out.print("Input decimal number: ");
        int decimal = Programme17 .nextInt();

        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary number is " + binary);

        Programme17.close();

    }
}
