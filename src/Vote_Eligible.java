import java.util.Scanner;
//program to find if person is eligible to vote if 18 years of age or over
public class Vote_Eligible {
    Scanner scanner = new Scanner(System.in);
    int age;
    //non-static method
    public void eligibleToVote(){
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
                if(age>=18){
                    System.out.println("You are eligible to vote!");
                }
                else{
                    System.out.println("Sorry! you are not eligible to vote!");
                }
    }
    //main method
    public static void main(String[] args) {
        Vote_Eligible vote_eligible = new Vote_Eligible();
        vote_eligible.eligibleToVote();
    }

}
