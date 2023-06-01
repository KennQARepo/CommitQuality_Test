import java.util.Scanner;

//LinkedinLearning Employee's Gross Salary Calculator Assignment

public class GrossIncome_Assignment{
    
    public static double annualPay (double hourlyPay){
        int hoursPerDay = 7;
        int daysPerWeek = 5;
        int weeksPerYear = 52;
        hourlyPay*=hoursPerDay;
        hourlyPay*=daysPerWeek;
        hourlyPay*=weeksPerYear;
        return hourlyPay;
    }
    
    public static void main(String[] args) {
        System.out.print("Enter Employee's hourly pay rate to calculate their Gross Annual Income.\n$");
        //System.out.print("$");
        Scanner scan = new Scanner(System.in);
        double hourlyWage = scan.nextDouble();
        double yearlyPay = annualPay(hourlyWage);
        String yearSalary = String.format("%.02f",yearlyPay);
        System.out.println("Employee's Gross Annual Income is: $" + yearSalary);
        scan.close();
    }
}
