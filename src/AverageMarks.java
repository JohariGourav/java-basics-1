//class to calculate Avg marks of students subjectwise as well as total
import java.util.Scanner;

public class AverageMarks {
	static int subAvg = 0;
	static int total[] = new int[3];

	public static void main(String[] args) {

		AverageMarks avg = new AverageMarks();
		Scanner sc = new Scanner(System.in);
		int studMarks[][] = new int[3][3];
		System.out.println("Enter marks of 3 students for 3 subjects (student wise)");
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter marks of " + (i + 1) + " student for 3 subjects");
			for (int j = 0; j < 3; j++) {
				studMarks[i][j] = sc.nextInt();
			}

		}
		avg.averageSubjectWise(studMarks);
		avg.totalAverage(studMarks);
	}

	public int[] averageSubjectWise(int arr[][]) {
		int sum = 0;

		for (int j = 0; j < 3; j++) {
			sum = 0;
			for (int i = 0; i < 3; i++) {
				sum += arr[i][j];
			}
			total[j] = sum;
		}

		for (int j = 0; j < 3; j++) {
			subAvg = total[j] / 3;
			System.out.println("Subject " + (j + 1) + ": Total=" + total[j] + " Average=" + subAvg);
		}
		return total;
	}

	public void totalAverage(int arr[][]) {
		int sum = 0, totAvg, i = 0;
		for (i = 0; i < 3; i++) {
			sum += total[i];
		}
		totAvg = sum / 3;
		System.out.println("Overall average of " + i + " students for 3 subjects: " + totAvg);
	}
}
