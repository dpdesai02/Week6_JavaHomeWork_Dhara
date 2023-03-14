package week6JavaProgrammes;
//**Write a Java programme using the following steps.
// 3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
//3.4 Call both instance and static variables into both instance and static methods inside the
//print statement.
//3.5 Declare the Main method.
//3.6 Call both instance and static methods into the Main method and run the programme.*/

import java.util.Scanner;

public class Programme3 {
    public static void main(String[] args) {

        int x= 30;
        System.out.println(x);
        System.out.println();
        Programme3 obj1 = new Programme3();
        //calling instance in to main method
        obj1.multiplication();
        division();
        // calling static in to main method


    }
    int a =25; //instance variable
    // declaring instance method and print statement
    public void multiplication(){
        System.out.println(a);


    }

     static int b=27;//static variable
    // declaring static method and print statement
     public static void  division(){
         System.out.println(b);

     }
}




