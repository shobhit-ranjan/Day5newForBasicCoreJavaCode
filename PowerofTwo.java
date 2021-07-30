import java.util.Scanner;

public class PowerofTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println("Power of 2^" + num + " is: " + (Math.pow(2, num)));
		
		
		}

	}
