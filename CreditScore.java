 import java.util.Scanner;
/**
 * 
 * 1) Access to default info./data
 * 2) User input for Credit Score
 * 3) User input for Annual Pay/Salary
 * 4) Processing if Criteria met by User's info./data - T/F
 * 5) Print if they were Approved or DENIED
 * 6) EXECUTE methods in main method to run program
 * 
 * Chapter_5_TAU_Method_Exercise
 */
 

public class CreditScore{
    static double yearlySalary = 25000;
    static int creditRank = 750;
    static Scanner scan = new Scanner(System.in);
    
    public static double annualSalary() { 
        System.out.println("Enter Annual Earnings: ");
        double annualGross = scan.nextDouble();
        return annualGross;
    }
    public static int creditKarma() { 
        System.out.println("Enter Credit Standing: ");
        int ficoCredit = scan.nextInt();
        return ficoCredit;
    }
    public static boolean reviewProcess(double x, int y) { 
        System.out.println("System Processing...");
        if(x >= yearlySalary && y >= creditRank){
            return true;
        }else{
            return false;
        }
    }
    public static void eligiblity(boolean pending) {
        if(pending == true){
            System.out.println("Approved.");
        }else{
            System.out.println("DENIED!!!!");
        }
    }
    public static void main(String[] args) {
        System.out.println("Are you eligible for a loan? Let's check:");
        
        //SOLUTION ONE
        /*
        double salary = annualSalary();
        int credit = creditKarma();
        boolean determine = reviewProcess(salary, credit);
        */
        //SOLUTION ONE
        
        /*
        OR try using the methods as data type in the parameters of the returning boolean method (reviewProcess())
        */
        
        //SOLUTION TWO
        boolean determine = reviewProcess(annualSalary(), creditKarma());
        //SOLUTION TWO
        
        eligiblity(determine);
        scan.close();
        }
}
