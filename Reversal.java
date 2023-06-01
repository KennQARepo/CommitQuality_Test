import java.util.Scanner;

public class Reversal{
    public static void reversal(String text){
        String[] word = text.split("");
        int letters = word.length;
        for(int x = letters - 1; x >= 0; x--){
            System.out.print(word[x]);
            
        }
    }
    
    public static void main(String[] args){
    System.out.println("Enter text and reverse it");
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    scan.close();
    reversal(input);
    System.out.println("");
        
    } 
}
