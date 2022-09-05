import java.util.Scanner;
public class CodeBro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double doubleOne = 5.0;
		
		System.out.println("Select a number");
		int num = scan.nextInt();
		
		int multiWhy = (int)(Math.random()*(num));
		
		System.out.println(doubleOne + num);
		System.out.println("Your number times a random number will be " + multiWhy);
	}

}
