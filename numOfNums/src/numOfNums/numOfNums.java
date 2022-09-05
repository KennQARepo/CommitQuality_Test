package numOfNums;
import java.util.Scanner;

public class numOfNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int numSum = 0;
		int divNum = 0;
		int divNums = divNum ++;
		System.out.println(divNums);
		
		while(true) {
			System.out.println("Enter a number: ");
			int num = scan.nextInt();
			if(num != 0) {
				numSum = numSum + num;
				divNums = divNum ++;
				System.out.println(divNums);
				
			}else {
				break;
			}
		}
		System.out.println("The average of your input is : " + numSum/divNums);
		//System.out.println("Sum of the numbers: " + sumOfNum);
    	}

}
