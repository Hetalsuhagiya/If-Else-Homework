import java.util.Scanner;
//program to find if given character is number or alphabet or symbol
public class Number_Alphabet_Symbol {
    Scanner scanner =new Scanner(System.in);//Creating an object for Scanner class for user input
    char value; //declare a variable as character

    //non-static method
    public void findValue(){
        System.out.println("Enter Number from (0-9) or Alphabet or Symbol:");//acknowledge user what to enter
        char value = scanner.next().charAt(0);                               //Initialize the character

        //check whether number,alphabet or symbol using if-else statement
        if (value>='0' && value<='9'){
            System.out.println(value + " is a Number.");
        }
        else if((value>='A' && value<='Z') || (value>='a' && value<='z')){
            System.out.println(value +  " is an Alphabet.");
        }
        else{
            System.out.println(value + " is a Symbol.");
        }
    }
    //main methid
    public static void main(String[] args) {
        Number_Alphabet_Symbol number_alphabet_symbol = new Number_Alphabet_Symbol();//creating object to call non-static method in static method
        number_alphabet_symbol.findValue(); //calling method using object
    }
}
