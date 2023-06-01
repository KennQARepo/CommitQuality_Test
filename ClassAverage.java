public class ClassAverage{ 
	public static void main(String[] args) {
		System.out.println("Find the avg. test scores for each student in the class, \nThere are 24 students and 4 tests. ");	
		
		int sum = 0; 	
		double average;
		int[] testScore = {89, 90, 92, 100};
		
		int x = 0;
		while(x < testScore.length){
		    //System.out.println(testScore[x]); - prints result of average before printing all of line_13
		    sum = sum + testScore[x];
		    System.out.println(testScore[x]); //This is the right/sweet spot of printing 
		    x++;
		    //System.out.println(testScore[x]); - Creates a error of exceeding range
		    if(x == testScore.length - 1){
		        average = sum/testScore.length;
		        System.out.println("Average score totals: " + average);
		    }
		}
		
		/*
		for(int i = 0; i < testScore.length; i++){
						
			//System.out.println(testScore[i]);
			sum = sum + testScore[i];
			System.out.print(testScore[i] + " ");
			
		}
		average = (sum/testScore.length);	
		System.out.println("\n" + average);
		*/
	 }

}
