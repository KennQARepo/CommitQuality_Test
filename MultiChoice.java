import java.util.Scanner;
// Online IDE - Code Editor, Compiler, Interpreter

public class MultiChoice{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String question = "What are you studying?\n(a)HTML \n(b)JavaScript \n(c)Java";
        boolean notAnswered = true;
        
        
        while(notAnswered){
            //System.out.println("I'm sorry that is not correct. Please try again");
            System.out.println(question);
            String choices = scan.nextLine();
            if(choices.equals("c")){
                
                notAnswered = false;
            }else if(choices.equals("C")){
            
                notAnswered = false;    
            }else if(choices.equals("Java")){
                
                notAnswered = false;
            }else if(choices.equals("java")){
                
                notAnswered = false;
                
            }else if(choices.equals("c)Java")){
                notAnswered = false;
                
            }else if(choices.equals("c)java")){
                notAnswered = false;    
            }else{
                System.out.println("I'm sorry that is not correct. Please try again");
                }
            
            }
            System.out.println("That is correct! Good Luck learning Java!");
        }
    }
