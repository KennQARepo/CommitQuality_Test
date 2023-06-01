import java.util.Scanner;

public class TAUChap4D
{
    public static void main(String[] args) {
	        
	System.out.println("Average Class's Average \nStudents: 24 \nExams Taken: 4");
        double[] tests = new double[4];
        //in test arrrayLength equaled [2]
        double[] student = new double[24];
        //in test arrrayLength equaled [3]
        double testScore = 0;
        double average = 0;
        double totalTestScore = 0;
        double studentAvgTotal = 0;
        double classAvgTotal = 0;
        Scanner scan = new Scanner(System.in);
        
        for(int x = 0; x < student.length; x++){
                    testScore = 0;
                    //declared testScore data (zero) here to reset average for each student
        System.out.println("Enter Exam Scores for student [" + (x + 1)+ "]: ");
                for(int i = 0; i < tests.length; i++){
                    tests[i] = scan.nextDouble();
                    testScore += tests[i];
                    average = testScore/tests.length;
                    }
        System.out.println("Student [" + (x + 1) + "] Average exam Score is: " + average);
            
            student[x] = average;
            studentAvgTotal += student[x];
            classAvgTotal = studentAvgTotal/student.length;
            
        }
        System.out.println("Total Class Average is: " + classAvgTotal);
    }
}
