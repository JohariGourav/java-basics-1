//class to calculate tax amount based on CTC
import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your CTC for Tax Calculation");
		double ctc = sc.nextInt();
		taxCalc(ctc);
	}

	static int taxCalc(double ctc) {
		double taxamt = 0;
		if (ctc < 180000)
			taxamt = 0;
		else if (ctc >= 181001 && ctc <= 300000) {
			taxamt = ctc / 10;
		} else if (ctc >= 300001 && ctc <= 500000) {
			taxamt = ctc / 5;
		} else if (ctc >= 500001 && ctc <= 1000000) {
			taxamt = (ctc * 3) / 10;
		} else {
			System.out.println("Your CTC is out of range (Rs. 0 to 1000000)");
			return 0;
		}
		System.out.println("Your Tax amount is " + taxamt);
		return 0;
	}
}
