import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		float number = sc.nextFloat();
		sc.close();
		float sum = 0;
		for (float i = 1; i <= number; i++) {
			sum = sum + (1 / i);
		}
		System.out.printf("Harmonic Number is %3f", sum);

	}

}
