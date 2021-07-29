import java.util.Scanner;



public class DayFiveBasicCoreProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter any Charter");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
			System.out.println("Given character is an vowel");
		} else {
			System.out.println("Given character is a consonant");
		}
	}
}