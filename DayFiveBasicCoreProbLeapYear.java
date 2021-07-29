import java.util.Scanner;

//Leap Year

public class DayFiveBasicCoreProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any year");
		int year = sc.nextInt();

		if (year <= 9999 && year >= 1000) {
			if (year % 4 == 0)
				System.out.println("Specified year is a leap year");
			else

				System.out.println("Specified year is not a leap year");

		} else {
			System.out.println("You have not entered year in proper format");
		}

	}

}
