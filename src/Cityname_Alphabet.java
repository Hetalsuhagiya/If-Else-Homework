import java.util.Scanner;
//program to print the cityname from alphabet A to F
public class Cityname_Alphabet {
    //Create an object of the Scanner class
    Scanner scanner = new Scanner(System.in);
    String city_name; //String declaration

    //non-static method
    public void input() {
        System.out.println("Please enter a letter of the alphabet in uppercase:");//acknowledge use what to enter
        String city_name = scanner.nextLine();//Initialize the String with scanner object
        //print city names using if-else statement
        if (city_name.startsWith("A")) {
            System.out.println("The name of the city is: " + "Amsterdam");
        } else if (city_name.startsWith("B")) {
            System.out.println("The name of the city is: " + "Berlin");
        } else if (city_name.startsWith("C")) {
            System.out.println("The name of the city is: " + "Cairo");
        } else if (city_name.startsWith("D")){
            System.out.println("The name of the city is: " + "Dublin");
        } else if (city_name.startsWith("E")) {
            System.out.println("The name of the city is: " + "Edinburgh");
        } else if (city_name.startsWith("F")){
            System.out.println("The name of the city is: " + "Frankfurt");
        } else
            System.out.println("Sorry, This is an invalid entry!");
    }



    //main method
    public static void main(String[] args) {
        Cityname_Alphabet cityname_Alphabet = new Cityname_Alphabet();//creating object to call non-static method in static method
        cityname_Alphabet.input();//calling method by object
    }
}