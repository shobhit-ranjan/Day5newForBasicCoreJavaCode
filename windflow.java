import java.util.Scanner;

public class windflow {
	static float result;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temprature: ");
		float temp = sc.nextFloat();
		System.out.print("Enter Velocity: ");
		float velo = sc.nextFloat();
		sc.close();
		windspeed(temp, velo);

	}

	public static float windspeed(float Temp, float Velo) {
		double wind = 35.74 + (Temp * 0.6215) + (0.4275 * Temp - 35.75) * (Math.pow(Velo, 0.16));
		System.out.printf("the wind speed can  be upto : %.3f", wind);

		return (result);

	}

}