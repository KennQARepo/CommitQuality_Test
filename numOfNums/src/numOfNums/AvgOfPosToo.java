package numOfNums;
/**Assignment is to find the average of the postive inputs
* Skip Average for any negative number input
* break after input 0
*/
import java.util.Scanner;


public class AvgOfPosToo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		        System.out.println("Enter number: ");
		        
		        //double totes = 0;
		        //double posNum = 0;
		        double totalSum = 0;
		        //double plusOne = posNum ++;		        
		        double plusOne =0;
		        
		        while(true){
		            int num = scan.nextInt();
		            if(num > 0){
		                //plusOne = posNum ++;
		                totalSum = totalSum + num;
		                plusOne ++;
		            }		            
		            else if(num < 0){
		                //if negative input entered then skip the increment
		                //continue;
		                
		                
		            }else if(plusOne == 0){
		                System.out.println("Cannot calculate Average");
		                break;
		            
		            }else{
		                double avgNum = totalSum/plusOne;
		                System.out.println(avgNum);
		                break;
		            }
		            
		        }
		       
		    }
		}