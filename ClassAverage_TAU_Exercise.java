import java.util.Scanner;

public class ClassAverage_TAU_Exercise{ 
    
    public static double studentAvg(double w, double x, double y, double z) { 
        double sum = 0;
        double average;
        double[] testScore = {w, x, y, z};
        
        for(int i = 0; i < testScore.length; i++){
    	sum = sum + testScore[i];
		}
		average = (sum/testScore.length);	
		//System.out.println("\n" + average);
		return average;
    }
        
    
	public static void main(String[] args) {
		System.out.println("Find the avg. test scores for each student in the class, \nThere are 24 students and 4 tests. ");	
		int students = 24;
		Scanner scan = new Scanner(System.in);
		for(int x = 0; x < students; x++){
		/*
			for(int j = 0; j < 4; j++){
			int testGrades = scan.nextInt();
			String exam = "Test #: " + j++; 
			double examScore = scan.nextDouble();
			studentAvg(j);
			System.out.println("Test #" + j++ +": " );
		*/
			
			}
		}
		
		//System.out.println(studentAvg(80, 90, 100, 100));
		scan.close();
	 }
    
}
