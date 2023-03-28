import java.util.Scanner;

public class UpperLower_Alphabet {


    // String alphabet = scanner.next();


    //main method
    public static void main(String[] args) {

    // UpperLower_Alphabet upperlower_alphabet = new UpperLower_Alphabet();
        //upperlower_alphabet.printLowercase();
        Scanner scanner = new Scanner(System.in);



            System.out.println("Please enter any alphabet in uppercase");
        char ch = scanner.next().charAt(0);
        String str = Character.toString(ch);
            System.out.println(str.toLowerCase());

        }

    }


