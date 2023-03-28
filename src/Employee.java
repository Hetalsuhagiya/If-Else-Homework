import java.util.Scanner;
//program to find HRA,DA,TA,PF and Gross salary of an Employee
public class Employee {
    Scanner scanner = new Scanner(System.in); //create an instance of the scanner class

    //non-static variables
    String emp_name;
    float basic_salary,HRA,DA,TA,PF;
    float gross_salary;

    //non-static method
    public void calculate(){
        System.out.println("Please enter the name of the Employee");//acknowledge user input value
        String emp_name = scanner.nextLine();//Initialize the String by scanner object
        System.out.println("Please enter the ID of the Employee");
        int emp_id = scanner.nextInt();
        System.out.println("Please enter the Basic Salary of the Employee");
        float basic_salary = scanner.nextFloat();

        // calculate HRA,DA,TA,PF & Gross salary from basic salary
        HRA =  ((basic_salary * 10) / 100);
        DA =  ((basic_salary * 8) / 100);
        TA =  ((basic_salary * 9) / 100);
        PF =  ((basic_salary * 20) / 100);
        gross_salary = basic_salary + HRA + DA + TA +PF;
        //print basic salary,HRA,DA,TA,PF & gross salary
        System.out.println("The Basic salary is: " + basic_salary);
        System.out.println("The HRA is: " + HRA);
        System.out.println("The DA is: " + DA);
        System.out.println("The TA is: " + TA);
        System.out.println("The PF is: " + PF);
        System.out.println("The Gross salary is: " + gross_salary);
    }
    //main method
    public static void main(String[] args) {
        Employee employee = new Employee();  //creating class object to call non-static method
        employee.calculate();                  //calling method with object
    }
}
