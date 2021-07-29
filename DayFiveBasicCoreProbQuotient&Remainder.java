import java.util.Scanner;



public class DayFiveBasicCoreProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter First Number.");
		int num1 = sc.nextInt();

		System.out.println("Please enter Second number ");
		int num2 = sc.nextInt();
		
		 
	        System.out.println("Before Swap");
	        System.out.println("x = " + num1);
	        System.out.println("y = " + num2);
	 
	        int temp = num1;
	        num1 = num2;
	        num2 = temp;
	 
	        System.out.println("After swap");
	        System.out.println("x = " + num1);
	        System.out.println("y = " + num2);
	    }
	}