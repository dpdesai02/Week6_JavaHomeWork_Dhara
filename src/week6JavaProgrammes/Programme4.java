package week6JavaProgrammes;
//**Write a Java programme using the following steps.
//4.1 Declare two instance and two static variables.
//4.2 Declare one instance method.
//4.3 Declare one static method.
//4.4 Call all four instance and static variables into both instance and static methods inside the
//print statement.
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme.*/

public class Programme4 {

        public static void main(String[] args) {
            int x=60;
            System.out.println(x);
            System.out.println();
            Programme4 addedlist = new Programme4();
            addedlist.subtration();//calling instance method into the Main method and run the programme
            addition();//calling static methods into the Main method and run the programme.*/


        }
        //declaring instance variable,instance method and print statement)/
        public void subtration(){
            int a = 5;
            int b = 30;
            int ans = b - a;

            System.out.println("Subtraction of two numbers: " + ans);
        }
        // declaring static variable,static method and print statement)/
        public static void addition(){
            int a=10;
            int b = 40;
            System.out.println("Addition of two numbers is: " + (b-a));

        }

    }

