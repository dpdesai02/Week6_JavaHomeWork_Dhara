package week6JavaProgrammes;

import java.util.Scanner;

//**13. Write a Java program that takes three numbers as input to calculate and
//print the average of the numbers.*/
public class Programme13 {

    public static void main(String[] args) {

        Scanner Programme13 = new Scanner(System.in);

        System.out.println("Enter First Number:");
        double FirstNumber = Programme13.nextDouble();

        System.out.println("Enter Second Number: ");
        double SecondNumber = Programme13.nextDouble();

        System.out.println("Enter third Number: ");
        double ThirdNumber = Programme13.nextDouble();

        double Average = (FirstNumber+SecondNumber+ThirdNumber)/3;

        System.out.println("Average is:" + Average);

        Programme13.close();

    }

}
