
// Online IDE - Code Editor, Compiler, Interpreter

public class Bottles
{
    public static void main(String[] args) {
        System.out.println("How many bottles of beer?");
        int glassBottles = (int)(Math.random()*100);
        //int demBottles = glassBottles;
        
        for(int x = 0; 1 < glassBottles; x++){
            System.out.println(glassBottles + " bottles of beer on the wall " + glassBottles + " bottles of beer");
            System.out.println("You take one down and pass it around ");
            --glassBottles;
            //System.outprintln("Now you have "+ glassBottles + "bottles of beer on the wall");
            
            if(glassBottles == 1){
            System.out.println(glassBottles + " bottle of beer on the wall " + glassBottles + " bottle of beer");
            System.out.println("You take it down and pass it around ");
            --glassBottles;
            System.out.println("Now you have no more bottles of beer on the wall");
            } else{
                System.out.println("Now you have "+ glassBottles + " bottles of beer on the wall");
            }
            
        }
        
    }
}
