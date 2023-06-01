import java.util.Scanner;

public class TransactionTally2{
  public static void main(String[] args){
    System.out.println("Scan and tally the items for a total in transaction");
    Scanner scan = new Scanner(System.in);
    System.out.println("How many items are you purchasing?");
    int numOfItems = scan.nextInt();
    double totalCost = 0;
    System.out.println("Great, you may now begin scanning the prices of your items. \nScan item please:");
    for(int x = 0; x < numOfItems; x++){
        
        double costOfItem = scan.nextDouble();
        totalCost = totalCost + costOfItem;
        String theCostOfItem = String.format("%.02f", costOfItem);
        System.out.println("$" + theCostOfItem);
        }
        String actualTotalCost = String.format("%.02f",totalCost);
        System.out.println(actualTotalCost);
    }
    
}
