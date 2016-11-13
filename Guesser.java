import java.util.Scanner;

public class Guesser {
	public double n;

	public Guesser() {
		System.out.println("Pick a number between 1 and 100.");
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		n = (int) (Math.random() * 100);
		while (s != n) {
			if (s > n) {
				System.out.println("Your guess is too high.");
				s = scanner.nextInt();
			} else {
				System.out.println("Your guess is too low.");
				s = scanner.nextInt();
			}
		}
		System.out.println("Congratulations.  Your guess of " + n
				+ " is correct.");
	}

	public static void main(String[] args) {
		new Guesser();
	}
}