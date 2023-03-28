import java.util.Scanner;
//program to print 1 to 7 day names of the week
public class Week_Days {
    Scanner scanner = new Scanner(System.in);//creating instance of Scanner object for user input
    //variable declaration
    String days;
    int number;
    //non-static method
    public void find(){
        System.out.println("Enter any number from 1 to 7:");//acknowledge user what to enter
        int number = scanner.nextInt();//initializing int values using scanner object
        String days = scanner.nextLine();//initializing String values using scanner object
        //printing days of the week using if-else statement
        if(number==1){
            System.out.println("The day of week is: " + "Monday");
        }
        else if(number==2){
            System.out.println("The day of week is: " + "Tuesday");
        }
        else if(number==3){
            System.out.println("The day of week is: " + "Wednesday");
        }
        else if(number==4){
            System.out.println("The day of week is: " + "Thursday");
        }
        else if(number==5){
            System.out.println("The day of week is: " + "Friday");
        }
        else if(number==6){
            System.out.println("The day of week is: " + "Saturday");
        }
        else if(number==7){
            System.out.println("The day of week is: " + "Sunday");
        }
        else{
            System.out.println("Sorry! This is invalid number");
        }
    }
        //main method
        public static void main(String[] args) {
        Week_Days week_days = new Week_Days();//creating object to call non-static method in static method
        week_days.find();//calling method using object
    }
}
