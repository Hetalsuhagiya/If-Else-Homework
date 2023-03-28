import java.util.Scanner;
//program to find operations using symbols
public class Number_Operators {
    //creating object for Scanner class
    Scanner scanner = new Scanner(System.in);
    //non-static variables
    int a;
    int b;
    char op;
    int addition,subtraction,multiplication;
    double division;

    //non-static method
    public void operate() {
        System.out.println("Enter the two numbers:");//acknowledge user what to enter
        int a = scanner.nextInt();//initialize the int value using scanner object
        int b = scanner.nextInt();//initialize the int value using scanner object
        System.out.println("Choose and Enter the type of operation you want to perform from (+,_,*,/):");

        //calculate addition,subtraction,multiplication or division of two numbers
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        double division = a*1.0/ b;


        char op = scanner.next().charAt(0);// initialize char using scanner object
        // print operation using if else statement
        if (op == '+') {
            System.out.println("The addition of the two numbers are: " + addition);
            }else if (op == '-') {
                System.out.println("The subtraction of the two numbers are: " + subtraction);
            } else if (op == '*') {
                System.out.println("The multiplication of the two numbers are: " + multiplication);
            } else if (op == '/') {
                System.out.println("The division of the two numbers are: " + division);
            }
        }
            //main method
            public static void main (String[]args){
                Number_Operators number_operators = new Number_Operators();//creating object to call non-static method to static method
                number_operators.operate();// calling method using object

            }
        }
