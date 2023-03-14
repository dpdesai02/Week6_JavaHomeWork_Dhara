package week6JavaProgrammes;
//**Write a program to enter any radius value of the circle and find out the
//area.(Formula of Area A=PI*r*r).*/

import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        Scanner Programme6 = new Scanner(System.in);//Scanner object
        System.out.print("Enter radius value: ");//radius value
            double r = Programme6.nextDouble();
            double a = (3.14159265*r*r);//(PI*r*r)
            System.out.println("Area of circle is: " + a );

            Programme6.close();//scanner close

        }
    }

