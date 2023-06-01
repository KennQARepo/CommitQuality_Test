package chapter2;
import java.util.Scanner;
public class LoanQualCalc{
    public static int annualSum(int x){
        int weeklyPayRate = x * (7 * 5);
        int yearlyPayRate = weeklyPayRate * 52;
        return yearlyPayRate;
    }
    public static void main(String[] args){
        //Scanner scan = new Scanner(System.in);
        System.out.println("Do you qualify for this loan program? \nLet us find out.");
        System.out.println("Enter your hourly pay rate OR your annual gross income: ");
        Scanner scan = new Scanner(System.in);
        int payRate = scan.nextInt();
        annualSum(payRate);
        /*
        int weeklyPayRate = payRate * 35;
        int yearlyPayRate = weeklyPayRate * 52;
        */
        scan.close();


        //if(payRate > 30000 || yearlyPayRate > 30000){
        if(payRate > 30000 || annualSum(payRate) > 30000){
            System.out.println("Congratulation! You are qualified!");
        }else{
            System.out.println("I'm sorry to inform you but you have been denied the request for a loan. \nPlease try again when eligible.");
        }



    }
        }
