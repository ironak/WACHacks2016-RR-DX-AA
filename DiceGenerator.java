import java.util.Scanner;

public class DiceGenerator {
	public int val1, val2, total;
	public double p, q;

	public DiceGenerator() {
		System.out.println("How many times would you like to roll the dice?");
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		for (int i = 0; i < s; i++) {
			p = Math.random();
			q = Math.random();
			if (p <= 0.17) {
				val1 = 1;
			} else if (p > 0.17 && p <= 0.33) {
				val1 = 2;
			} else if (p > 0.33 && p <= 0.5) {
				val1 = 3;
			} else if (p > 0.5 && p <= 0.67) {
				val1 = 4;
			} else if (p > 0.67 && p <= 0.83) {
				val1 = 5;
			} else {
				val1 = 6;
			}
			if (q <= 0.17) {
				val2 = 1;
			} else if (q > 0.17 && q <= 0.33) {
				val2 = 2;
			} else if (q > 0.33 && q <= 0.5) {
				val2 = 3;
			} else if (q > 0.5 && q <= 0.67) {
				val2 = 4;
			} else if (q > 0.67 && q <= 0.83) {
				val2 = 5;
			} else {
				val2 = 6;
			}
			total = val1 + val2;
			System.out.println("The first die rolled a " + val1
					+ " and the second die rolled a " + val2
					+ ".  Therefore, the total is " + total + ".");
		}
	}
/*
	public static void main(String[] args) {
		new DiceGenerator();
	}*/
}