package chapter2;
import java.util.Scanner;
public class GrossPayCalc {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("We will be calculating the gross pay rate of an employee. \nEnter the amount of hours the employee has worked (on a daily basis):");

        int hrs = scan.nextInt();
        //Total hours worked

        System.out.println("Next enter the amount of the employee's hourly pay rate: ");
        double payRate = scan.nextInt();
        //Hourly pay rate
        //Scanner.close();
        scan.close();
        //To save memory - scanner method is closed

        double wkly = 5 * (hrs*payRate);
        //Weekly Pay Rate for 5 business days

        double yrly = 52 * (wkly);
        //Annual pay rate - or - Annual Gross Income without holidays and weekend

        System.out.println("The employee earns " + (wkly/5) + " on a gross daily basis.");
        System.out.println("The employee earns " + wkly + " on a gross weekly basis.");
        System.out.println("The employee earns " + yrly + " annually in Gross income.");

    }
}
