import java.util.Scanner;
//program to interchange value of two numbers
public class InterchangeValue {
    // Create instance of the Scanner class
    Scanner scanner = new Scanner(System.in);
    int a,b; // variables 'a' and 'b' are to interchange

    //non-static method
    public void interchange(){
        System.out.println("Enter the value of a"); //acknowledge the user to enter the values of a
        int a = scanner.nextInt();                  //storing value of a in variable using scanner object
        System.out.println("Enter the value of b"); //acknowledge the user to enter the values of b
        int b = scanner.nextInt();                  //storing value of a in variable using scanner object
        System.out.println("Numbers before interchanging: " + "a = " +a + " and " + "b = " + b);

        // use a temporary variable to interchange the numbers
        int temp =  a; //use temporary variable to assign the value of a
         a =  b;      //assign the value of b to a
         b = temp;    //assign the value of temporary variable(original value of a) to b
        System.out.println("Numbers after interchanging: " + "a = " +a + " and " + "b = " + b);
    }

       //main method
       public static void main(String[] args) {
           InterchangeValue interchangeValue = new InterchangeValue(); //creating class object to call non-static method to static area
           interchangeValue.interchange();                             //calling method with object
       }
}
