import java.util.Scanner;

//Flip Coin and print percentage of Heads and Tails

public class DayFiveBasicCoreProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int headCount=0;
        int tailCount=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Times you want to flip the coin.");
		int coin = sc.nextInt();

		for (int i = 0; i <= coin; i++) {

			double randomDouble = Math.random();
			System.out.println(randomDouble);

			if (randomDouble < 0.50) {
				System.out.println("Head");
				headCount=headCount+1;
			} else {
				System.out.println("Tails");
				tailCount=tailCount+1;
			}
		}
		int perForHead= ((headCount*100)/coin);
		System.out.println("Percetage of Head is "+ perForHead);
		int perForTail= ((tailCount*100)/coin);
		System.out.println("Percetage of Tails is "+ perForTail);
		
	}

}
