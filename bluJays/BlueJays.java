
/**
 * Write a description of class BlueJays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */import java.util.Scanner;
public class BlueJays
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class BlueJays
     */
    public static void main(String[] args)
    {
        // initialise instance variables
        Scanner scan = new Scanner(System.in);
        int x = 0;
        int num = scan.nextInt();
        //System.out.println(num + x);
        while(x == 0){
            System.out.println(num + x);
            System.out.println("You entered "+ num + " but x integer is still 0 so it echos");
            if(num == 10){
                x++;
                //num = scan.nextInt();
            }else{
                System.out.println("Think of a number that can break this loop \nit's a number between 1 and 100");
            }
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
