package week6JavaProgrammes;

import java.util.Scanner;

//**Write a program to calculate the area of a triangle.*/
public class Programme8 {
    public static void main(String[] args) {
        Scanner Programme8 = new Scanner(System.in);

        System.out.println("Enter the hight of the triangle in cm:");

        Double hight = Programme8.nextDouble();

        System.out.println("Enter the base of the triangle in cm:");

        Double base = Programme8.nextDouble();

        Double area= (base*hight/2);
        System.out.println("Area of Triangle: " + area + "cm²");

        Programme8.close();

    }
}
