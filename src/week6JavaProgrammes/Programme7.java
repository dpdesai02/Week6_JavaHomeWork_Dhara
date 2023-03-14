package week6JavaProgrammes;

import java.util.Scanner;

//**Write a program to insert any temperature value in degree Fahrenheit and
// convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/
public class Programme7 {
    public static void main(String[] args) {

        Scanner Programme7 = new Scanner(System.in);//Scanner value
        System.out.println("Enter the temperature in Fahrenheit:");

        float F = Programme7.nextFloat();
        float C = (F-32) * 5/9;

        System.out.println(F +" degree Fahrenheit is equal to " + C + " degree in Celsius.");

        Programme7.close();//scanner close
}
}

