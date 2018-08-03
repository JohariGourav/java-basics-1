
//class for result of students (pass,promoted,fail)
import java.util.Scanner;

public class ClassResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of 3 subjects");
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		classResult(sub1, sub2, sub3);

	}

	static void classResult(int sub1, int sub2, int sub3) {
		int c = 0;
		for (int i = 0; i < 1; i++) {
			if (sub1 > 60)
				c++;
			if (sub2 > 60)
				c++;
			if (sub3 > 60)
				c++;
		}
		if (c == 3)
			System.out.println("Marks of 3 Subjects " + sub1 + sub2 + sub3 + "\n Result: Passed");
		else if (c == 2)
			System.out.println("Marks of 3 Subjects " + sub1 + sub2 + sub3 + "\n Result: Promoted");
		else

			System.out.println(c + " Marks of 3 Subjects " + sub1 + sub2 + sub3 + "\n Result: Fail");
	}

}