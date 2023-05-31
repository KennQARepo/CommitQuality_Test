import java.util.Scanner;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class saleTaxTipCost {
    public static double tax(double cost){
        double fifteenPercent = 0.15;
        double taxAmount = cost * fifteenPercent;
        return taxAmount;
    }
    public static double tip(double cost){
        double fifteenPercent = 0.15;
        double tipAmount = cost * fifteenPercent;
        return tipAmount;
        }
    public static void main(String[] args) {
        System.out.println("Enter cost of purchase");
        Scanner scan = new Scanner(System.in);
        double costOfItem = scan.nextInt();
       //totalCost();
       /*
       tax(costOfItem);
       tip(costOfItem);
       */
       System.out.println("$" + totalCost(tax(costOfItem),tip(costOfItem)));
        scan.close();
    }
    public static String totalCost(double tip, double tax){
        //double totalAmount = tip() + tax();
        double totalAmount = tip + tax;
        String finalPrice = String.format("%.02f", totalAmount);
        //System.out.println(" ");
        return finalPrice;
    }
}
