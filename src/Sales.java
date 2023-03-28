import java.util.Scanner;
//program to find the sales commission as per sales amount
public class Sales {
    //create an object of the Scanner class
    Scanner scanner = new Scanner(System.in);
    //variable declaration
   int sale_id;
  String seller_name;
  double sale_amount,basic_salary;
  double commission;

    //non-static method
    public void findCommission(){
        System.out.println("Please enter the Sales ID:");// acknowledge user what to enter
        int sale_id = scanner.nextInt();                //storing variable using scanner object
        System.out.println("Please enter the Seller's Name:");
        String seller_name = scanner.next();
        System.out.println("Please enter the Sales Amount:");
        double sale_amount = scanner.nextDouble();
        System.out.println("Please enter the Basic Salary of the Seller:");
        double basic_salary = scanner.nextDouble();

        // calculate percentage commission as per the sales amount & output using if else statement
        if(sale_amount >=50000){
            double commission = (sale_amount * 0.35);
            System.out.println("Sales commission is 35%" + " and" + " commission amount= " + commission );

        }
        else if(sale_amount >=30000){
            double commission = sale_amount * 0.2;
            System.out.println("Sales commission is 20%" + " and" + " commission amount= " + commission );

        }
        else if(sale_amount >=20000){
            double commission = sale_amount * 0.1;
            System.out.println("Sales commission is 10%" + " and" + " commission amount= " + commission );

        }
        else if(sale_amount >=10000){
            double commission = sale_amount * 0.05;
            System.out.println("Sales commission is 5%" + " and" + " commission amount= " + commission );

        }
        else if(sale_amount <10000){
            double commission = sale_amount * 0.02;
            System.out.println("Sales commission is 2%" + " and" + " commission amount= " + commission );
        }
    }

        // main method
        public static void main(String[] args) {
        Sales sales = new Sales();//creating object for non-static method
        sales.findCommission();//calling method using object created
        }

}