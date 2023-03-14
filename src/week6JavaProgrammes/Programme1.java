package week6JavaProgrammes;

import java.util.Scanner;

/*Write a Java programme using the following steps
 *1.1 Declare two instance variables.
 *1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 *1.4 Declare the Main method.
 *1.5 Call the above instance method into the Main method and Run the programme
 */

public class Programme1{

    int a= 10;//instance variable
    int b=20;//instance variable

        //Declare one instance method.
    public void subtraction(){
        // Call both instance variables into the instance method inside the print statement
        System.out.println(b-a);
    }
        //Declare the Main method.
    public static void main(String[] args) {
        Programme1 obj1 = new Programme1();
        obj1.subtraction();
    }


}
