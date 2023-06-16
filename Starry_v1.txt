import java.util.Scanner;

/*Exercise is to create the following
    *
   **
  ***
 ****
*****

*/
//This file is only a refresher of the first step/line
//v2 will be working on the rest of the steps

public class Starry{
    public static void main(String[] args) {
        //Create a print LIMIT
        //Print SPACEs in space leading to SPOT
        //Print STAR in SPOT when reached
        //Decrease SPOT for next line
        //
        int limit = 4;
        int spot = 4;
        int start = 0;
        for(start = 0; start < limit; start++){
            if(start >= spot){
                System.out.print("*");
            }else{
                System.out.print("(_)");
            }
            //spot--;
        }
    }
    
}
