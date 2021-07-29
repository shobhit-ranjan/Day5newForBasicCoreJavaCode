import java.util.Scanner;

public class LargestOfthree {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter any Charter");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number:");
		int num2 = sc.nextInt();
		System.out.print("Enter the third number:");
		int num3 = sc.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println("Largest number is:" + num1);
		} else if (num2 > num1 && num2>num3) {
			System.out.println("Largest number is:" + num2);
		} else {
			System.out.println("Largest number is:" + num3);
		}

	}



}
