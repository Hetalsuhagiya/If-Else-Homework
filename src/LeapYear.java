import java.util.Scanner;
//Program to find if the year is Leap year is not
public class LeapYear {
        Scanner scanner = new Scanner(System.in);//creating object of the Scanner class for user input
        int year; //year declaration


        // creating non-static method
        public void find() {
            System.out.println("Enter the year to find out if Leap year"); // acknowledge user to enter year
            int year = scanner.nextInt(); // year initialization using scanner object

            if (((year% 4 ==0) && (year % 100!=0)) || (year % 400==0)){ // check for leap year
                System.out.println(year + " " + "is a Leap year");
            }
            else{
                System.out.println(year + " " + "is not a Leap year");
            }
        }
        // main method
        public static void main(String[] args) {
            LeapYear leapYear = new LeapYear(); //creating class object to call non-static method in static method
            leapYear.find(); //calling method using object created
        }
    }

