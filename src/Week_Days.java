import java.util.Scanner;

public class Week_Days {
    Scanner scanner = new Scanner(System.in);
    String days;
    int number;
    public void find(){
        System.out.println("Enter any number from 1 to 7:");
        int number = scanner.nextInt();
        String days = scanner.nextLine();
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

    public static void main(String[] args) {
        Week_Days week_days = new Week_Days();
        week_days.find();
    }
}
