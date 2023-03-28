import java.util.Scanner;
//program to check if number is positive,Negative or Zero
public class NumberIntegers {
    //create an instance of the Scanner class to take input from user
    Scanner scanner = new Scanner(System.in);
    int number; //number declaration


    //non-static method
    public void find() {
        System.out.println("Please enter the number");//acknowledge user what to enter
        int number = scanner.nextInt();//storing int in variable using scanner object
        //check if number is positive,negative or zero with if- else statement
        if (number >0) {
            System.out.println("Number " + number  + " is positive number");
        } else if (number < 0) {
            System.out.println("Number " + number + " is negative number");
        } else {
            System.out.println("Number " + number + " is a Zero");
        }
    }
    //main-method
    public static void main(String[] args) {
        NumberIntegers numberIntegers = new NumberIntegers();//creating class object to call non-static method in static area
        numberIntegers.find();//calling find method by object
    }
}
