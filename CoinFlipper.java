import java.util.Scanner;

public class CoinFlipper {

	public static int TotalHeads, TotalTails, MaxFlips;
	public double r;

	public CoinFlipper() {
		TotalHeads = 0;
		TotalTails = 0;
		System.out.println("How many times do you want to flip the coin?");
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		for (int i = 0; i < s; i++) {
			r = Math.random();
			if (r < 0.5) {
				TotalHeads++;
				System.out.println("It is heads.");
			} else {
				TotalTails++;
				System.out.println("It is tails.");
			}
		}
		System.out.println("Total heads: " + TotalHeads);
		System.out.println("Total tails: " + TotalTails);
	}

	public static void main(String[] args) {
		new CoinFlipper();
	}
}