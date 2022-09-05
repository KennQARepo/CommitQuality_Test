package learnJava;
import java.util.Scanner;



public class practJava{
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanThis = new Scanner(System.in);
		boolean questionAnswered = false;
			System.out.println("Answer the following question by selecting the correct answer.");
			String theQuestion = "Which programming language are you learning right now?";
			String choices = "a) HTML\nb) JavaScript\nc) Java";
		
			System.out.println(theQuestion);
			System.out.println(choices);
			String rightAnswer = "c";
			String answer = scanThis.nextLine();
			
			while(questionAnswered==false) {
				System.out.println("Not quite, but don't give up. Please try again.");
				System.out.println(theQuestion);
				System.out.println(choices);
				answer = scanThis.nextLine();
			
			if(answer.equals(rightAnswer)) {
				questionAnswered = true;
				System.out.println("Congratulation! You're on your way to learning programming! Good Luck!!!");
				}
			
		}
			
					
					
			}
*/				
	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);
			
			String theQuestion = "Which of the following programming languages are you learning?";
			String multiChoice = "a) HTML\nb) JavaScript\nc) Java";
			boolean notCorrect = true;
			String correct = "c";
			System.out.println("Answer the following question below:");
		
			
			while(notCorrect){
				
				System.out.println(theQuestion);
				System.out.println(multiChoice);	
				String response = reader.nextLine();
			
				
				
				if(response != correct) { 
					System.out.println("I'm sorry, but that is incorrect. Please don't give up and try again.");
					notCorrect = true;
				} else if (response.equals(correct)){ 
					notCorrect = false;
					System.out.println("Congrats, you're right! Good luck on learning Java and Hello World!");
					}
				
				}
	    
			
			}
	}
