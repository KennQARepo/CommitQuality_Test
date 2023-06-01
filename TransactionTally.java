import java.util.Scanner;

public class TransactionTally{
  public static void main(String[] args){
    System.out.println("Scan and tally the items for a total in transaction");
    Scanner scan = new Scanner(System.in);
    System.out.println("How many items are you purchasing?");
    int numOfItems = scan.nextInt();
    double totalCost = 0;
    System.out.println("Great, you may now begin scanning the prices of your items. \nScan item please:");
    for(int x = 1; x <= numOfItems; x++){
        
        double costOfItem = scan.nextDouble();
        totalCost = totalCost + costOfItem;
        //System.out.println("Scan item please:");
        String theCostOfItem = String.format("%.02f", costOfItem);
        System.out.println("$" + theCostOfItem);
        if(x == numOfItems){
            String theTotalCost = String.format("%.02f", totalCost);
            System.out.println("Your total is \n$" + theTotalCost);
        }
    }
        }
    }    
