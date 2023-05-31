import java.util.Scanner;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class saleTaxTipCost {
    public static double tax(double cost){
        double fifteenPercent = 0.15;
        double taxAmount = cost * fifteenPercent;
        //String theTaxAmount = String.format("%.02f", taxAmount);
        return taxAmount;
    }
    public static double tip(double cost){
        double fifteenPercent = 0.15;
        double tipAmount = cost * fifteenPercent;
        //String theTipAmount = String.format("%.02f", tipAmount);
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
       String theTaxAmount = String.format("%.02f", tax(costOfItem));
       System.out.println("Tax: $" + theTaxAmount);
       
       String theTipAmount = String.format("%.02f", tip(costOfItem));
       System.out.println("Tip: $" + theTipAmount);
       
       
       System.out.println("TOTAL: $" + totalCost(costOfItem));
        scan.close();
    }
    public static String totalCost(double cost){
        double totalAmount = tip(cost) + tax(cost) + cost;
        String finalPrice = String.format("%.02f", totalAmount);
        //System.out.println(" ");
        return finalPrice;
    }
}
