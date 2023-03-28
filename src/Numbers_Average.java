import java.util.Scanner;
//program to find the average of five numbers

public class Numbers_Average {
    //Create an object of the Scanner class
    Scanner scanner = new Scanner(System.in);

    //non-static method
    public void average() {
        System.out.println("Please enter the 5 numbers");//acknowledge user what to enter
        //storing int in variable using scanner object
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        //calculate the average of 5 numbers and return the same
        double average = ((num1 + num2 + num3 + num4 + num5)*1.0 / 5);
        System.out.println("The Average of the numbers is: " + average);
    }

    //main method
    public static void main(String[] args) {
        Numbers_Average numbers_average = new Numbers_Average();//creating class object to call non-static method to static area
        numbers_average.average();                              //calling average function by class object
    }

}



