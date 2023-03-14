package week6JavaProgrammes;
//**Write a program for a calculator with addition, subtraction, multiplication
//and division methods all with parameters and use string concatenation
// methods.(Note: Two static and Two instance methods.)*/

import java.util.Scanner;

public class Programme5 {
    public static void main(String[] args) {
        int answer = addition();//calling static in to main method
        System.out.println(answer);
        subtraction(55,45);//instance value
        Programme5 obj = new Programme5();
        obj.multiplication(15, 40);
        obj.division(45,20);

    }
    public static int addition(){//static with no parameter/
        int a =20;
        int b= 30;
        int ans=a+b;
        return ans;}
    public static void subtraction(int c,int d){   //static method with parameter/
        int ans = c-d;
        //return ans;}
        System.out.println("subtarction of c-d is:"+ ans);
    }
    public void multiplication (int e,int f){     //instance method
        int ans= e*f;
        System.out.println("multiplication of e*f is:"+ ans);}

        public void division(int g,int h){       //instance method
            int ans = g/h;
            System.out.println("Division of g/h is " + ans);

    }
}




