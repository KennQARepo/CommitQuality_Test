import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();
        int[] sides = new int[length];

        for(int x = 0; x < length; x++){
            sides[x] = scan.nextInt();
            double squared =  (Math.pow(sides[x],2));
            System.out.println((int)squared);
        }
    }
}