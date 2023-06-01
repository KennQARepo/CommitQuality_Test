import java.util.Scanner; 

class PayChange {  
  public static void main(String args[]) { 
    System.out.println("Pay for your item(s) here. \nWill you owe or receive change?"); 

    int range = (int)(Math.random()*100); 
    int cost = (int)(Math.random()*range);
    int paid = (int)(Math.random()*range);
    int x = 1, y = 1, z = 1;
    x = cost - paid;

    System.out.println("The item cost $" + cost);
    System.out.println("And you paid $" + paid);

    while(x != 0){
      if(x > 0){
      System.out.println("You still owe $" + x);
      System.out.print("Please provide the remaining amount. \n$");
        //while(x > 0){
        if(x > 0){
          Scanner scan = new Scanner(System.in);
          y = scan.nextInt();
          x = x - y;
        }
      }else if(x < 0){
        z = x;
        x = x*0;
        System.out.println("Here is your change, $" + z*-1);
      }
      
    }
    System.out.println("Thank you for your payment!");
  } 
}
