import java.util.Scanner;


class TipsAndTax {
    public static void finalPay(double cost) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Now you tip rate:");
        double tax = cost * 0.15;
        //15 percent sale tax
        //Need to find db or api that has tax rate based on state
        double tip = Double.valueOf(scan.nextLine());
        tip = cost * tip;
        //15 percent Gradutity
        double total = cost + tax + tip;
        //Final payment amount once tip and tax has been calculated and added to the cost of the transaction.
        String finalTotal = String.format("%.02f", total);
        scan.close();
        System.out.println("Your total is: $" + finalTotal);
        }
    
    public static void main(String[] args) {
        System.out.println("Enter the cost of the transaction FIRST and THEN the amount of tip you wish to contribute. \nTax and Gradutity will be calculated in your final total.\n");
        System.out.print("$");
        Scanner scan = new Scanner(System.in);
        double amount = Double.valueOf(scan.nextLine());
        finalPay(amount);
        
        scan.close();
        
    }
}
