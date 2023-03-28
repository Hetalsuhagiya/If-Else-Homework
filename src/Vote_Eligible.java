import java.util.Scanner;
//program to find if person is eligible to vote if 18 years of age or over
public class Vote_Eligible {
    Scanner scanner = new Scanner(System.in);//creating object for Scanner class for user input
    int age;//variable declaration
    //non-static method
    public void eligibleToVote(){
        System.out.println("Please enter your age:");//acknowledge user what to enter
        int age = scanner.nextInt();//initializing int value using scanner object
        //check if eligible to vote using if-else statement
                if(age>=18){
                    System.out.println("You are eligible to vote!");
                }
                else{
                    System.out.println("Sorry! you are not eligible to vote!");
                }
    }
    //main method
    public static void main(String[] args) {
        Vote_Eligible vote_eligible = new Vote_Eligible();//creating object to call non-static method in static method
        vote_eligible.eligibleToVote();//calling method using object
    }

}
