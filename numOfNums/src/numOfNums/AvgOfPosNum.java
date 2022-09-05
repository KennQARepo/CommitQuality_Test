package numOfNums;

import java.util.Scanner;
public class AvgOfPosNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int end = scan.nextInt();
		//int x = 0;
		int z = 0;
		
		for(int x = 0; x <= end; x++) {
			z+=x;
			System.out.println("> " + x);
			System.out.println(z);
		}
		
	}
}
