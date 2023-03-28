import java.util.Scanner;
//program to create student Marksheet
public class StudentMarksheet01 {
    // creating scanner for user input
    Scanner scanner = new Scanner(System.in);

    // creating non-static variables
    String studentName;
    int roll_no;
    int physics,chemistry,biology;
    float totalMarks;
    float percentage;

    // non-static method
    public void score(){
        System.out.println("Please enter student name:"); // acknowledge user to enter student name
        String studentName = scanner.next();             // student name initialization
        System.out.println("Please enter roll number:"); // acknowledge user to enter roll number
        int roll_no = scanner.nextInt();                // roll number initialization
        System.out.println("Please enter Physics, Chemistry, Biology marks:"); // acknowledge user to enter marks for each subjects
        //subjects initialization to store the values of each subjects
        int physics = scanner.nextInt();
        int chemistry = scanner.nextInt();
        int biology = scanner.nextInt();
       //Calculate total marks and percentage
        totalMarks =(physics+chemistry+biology);
        percentage = (totalMarks/3);

        // to produce the final output
        System.out.println("The Total marks =" + totalMarks + "/500.0");
        System.out.println("The Percentage =" + percentage + "%");
        // if-else conditional statements to find grade as per percentage
        if(percentage>=80){
            System.out.println("You have Passed " + "and" + " Your grade is A+");
        }
        else if (percentage>=60){
            System.out.println("You have Passed " + "and" + " Your grade is A");
        }
        else if(percentage>=50 ){
            System.out.println("You have Passed " + "and" + " Your garde is B");
        }
        else if(percentage>=35 ){
            System.out.println("You have Passed " + "and" + " Your grade is C");
        }
        else{
            System.out.println("Sorry! You have Failed");
        }
    }

    // main method
    public static void main(String[] args) {
        StudentMarksheet01 studentMarksheet01 = new StudentMarksheet01();//creating object for non-static method in static area
        studentMarksheet01.score();                                      // calling method with object
    }

}





