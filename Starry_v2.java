import java.util.Scanner;
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
        while(spot >= 0){
            for(start = 0; start <= limit; start++){
            if(start >= spot){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            
        }
        spot--;
        System.out.println(" ");
    }
    }
}
