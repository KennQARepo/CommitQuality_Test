//Roll die for user (random number 1-6)
//Roll Advances users by number rolled
//Display which space user are on THEN STATE how many more spaces is needed for them to win
// Repeat for total of 5 rolls
	if Users get EXACTLY to 20 first before 5 rolls then they WON
	
//Greater than or less than 20 by the fifth roll is a LOST


//import java.util.Scanner;
public class Dicey{ 
    public static void main(String[] args) { 
        System.out.println("Roll a Total of 20 and you win the Game!");
        String win = "You ROLLED 20! You Win!";
        int[] rollDice = new int[5];
        int dieRoll = 0;
        
        //while(dieRoll < 20 || dieRoll > 20){
            while(dieRoll < 20 || dieRoll > 20){
                dieRoll = 0; //<-- This line of code is required to automate the game (play cycle) until it has a winning chance.
            for(int roll = 0; roll < rollDice.length; roll++){
	        rollDice[roll] = (int)(Math.random()*6) + 1;
	        System.out.println("You ROLLED a " + rollDice[roll]);
	           dieRoll += rollDice[roll];
	            if(dieRoll == 20){
		        //System.out.println(win);
		        break;
	            }else if(roll == 4 && dieRoll < 20){
	            System.out.println("You didn't reach 20. I'm sorry you LOSE!!!!");     
	            }else if(dieRoll < 20){
		        System.out.println("You are on space " + dieRoll+".");
		        System.out.println("You need "+ (20 - dieRoll) + " more space to Win.");
	            }else{
		        System.out.println("You exceeded the game space. I'm sorry but you have LOST! \nGOOD DAY, SIR!!!!! ");	
	                    }
                    }
                }
                System.out.println(win);
            }
    }
