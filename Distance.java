import java.util.Scanner;

public class distance {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter The x Coordinate: ");
		int numOne = sc.nextInt();
		System.out.print("Enter The y Cordinate: ");
		int numTwo = sc.nextInt();
		sc.close();
		System.out.printf("Distance from Origin: %.3f", Math.sqrt(numOne * numOne + numTwo * numTwo));
	}

}