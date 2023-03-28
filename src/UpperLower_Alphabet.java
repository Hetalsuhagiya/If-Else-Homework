import java.util.Scanner;
//program to print uppercase alphabet in lowercase
public class UpperLower_Alphabet {
    //creating object for Scanner class for user input
    Scanner scanner = new Scanner(System.in);
    //non-static method
    public void printLowercase(){
        System.out.println("Please enter any alphabet in uppercase:");
        char ch = scanner.next().charAt(0);//initializing char value with scnner object
        String str = Character.toString(ch);//converting char into string data type
        System.out.println(str.toLowerCase());//output alphabet in lowercase
    }

    //main method
    public static void main(String[] args) {

        UpperLower_Alphabet upperlower_alphabet = new UpperLower_Alphabet();//creating object to call non-static method in static area
        upperlower_alphabet.printLowercase(); //calling method using object
    }

    }


