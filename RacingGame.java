import java.util.Scanner;

public class RacingGame {
	public int P1SR, P2SR, P3SR, P4SR;
	public double o, p, r, q;

	public RacingGame() {
		System.out.println("How many players are playing?");
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		if (s == 2) {
			P1SR = 100;
			P2SR = 100;
			for (int i = 0; i < 100000; i++) {
				o = Math.random();
				p = Math.random();
				if (o <= 0.17) {
					P1SR = P1SR - 1;
					System.out.println("Player 1 rolled a 1.  Player 1 has "
							+ P1SR + " tiles remaining.");
				} else if (o > 0.17 && o <= 0.33) {
					P1SR = P1SR - 2;
					System.out.println("Player 1 rolled a 2.  Player 1 has "
							+ P1SR + " tiles remaining.");
				} else if (o > 0.33 && o <= 0.5) {
					P1SR = P1SR - 3;
					System.out.println("Player 1 rolled a 3.  Player 1 has "
							+ P1SR + " tiles remaining.");
				} else if (o > 0.5 && o <= 0.67) {
					P1SR = P1SR - 4;
					System.out.println("Player 1 rolled a 4.  Player 1 has "
							+ P1SR + " tiles remaining.");
				} else if (o > 0.67 && o <= 0.83) {
					P1SR = P1SR - 5;
					System.out.println("Player 1 rolled a 5.  Player 1 has "
							+ P1SR + " tiles remaining.");
				} else {
					P1SR = P1SR - 6;
					System.out.println("Player 1 rolled a 6.  Player 1 has "
							+ P1SR + " tiles remaining.");
				}
				if (P1SR <= 0) {
					i = 100000;
					System.out.println("Congratulations.  Player 1 wins.");
				} else if (p <= 0.17) {
					P2SR = P2SR - 1;
					System.out.println("Player 2 rolled a 1.  Player 2 has "
							+ P2SR + " tiles remaining.");
				} else if (p > 0.17 && p <= 0.33) {
					P2SR = P2SR - 2;
					System.out.println("Player 2 rolled a 2.  Player 2 has "
							+ P2SR + " tiles remaining.");
				} else if (p > 0.33 && p <= 0.5) {
					P2SR = P2SR - 3;
					System.out.println("Player 2 rolled a 3.  Player 2 has "
							+ P2SR + " tiles remaining.");
				} else if (p > 0.5 && p <= 0.67) {
					P2SR = P2SR - 4;
					System.out.println("Player 2 rolled a 4.  Player 2 has "
							+ P2SR + " tiles remaining.");
				} else if (p > 0.67 && p <= 0.83) {
					P2SR = P2SR - 5;
					System.out.println("Player 2 rolled a 5.  Player 2 has "
							+ P2SR + " tiles remaining.");
				} else {
					P2SR = P2SR - 6;
					System.out.println("Player 2 rolled a 6.  Player 2 has "
							+ P2SR + " tiles remaining.");
				}
				if (P2SR <= 0) {
					i = 100000;
					System.out.println("Congratulations.  Player 2 Wins.");
				}
			}
		} else if (s == 3) {
			P1SR = 100;
			P2SR = 100;
			P3SR = 100;
			for (int i = 0; i < 100000; i++) {
				o = Math.random();
				p = Math.random();
				q = Math.random();
				if (o <= 0.17) {
					P1SR = P1SR - 1;
					System.out.println("Player 1 rolled a 1.  Player 1 has "
							+ P1SR + " tiles remaining.");
				} else if (o > 0.17 && o <= 0.33) {
					P1SR = P1SR - 2;
					System.out.println("Player 1 rolled a 2.  Player 1 has "
							+ P1SR + " tiles remaining.");
				} else if (o > 0.33 && o <= 0.5) {
					P1SR = P1SR - 3;
					System.out.println("Player 1 rolled a 3.  Player 1 has "
							+ P1SR + " tiles remaining.");
				} else if (o > 0.5 && o <= 0.67) {
					P1SR = P1SR - 4;
					System.out.println("Player 1 rolled a 4.  Player 1 has "
							+ P1SR + " tiles remaining.");
				} else if (o > 0.67 && o <= 0.83) {
					P1SR = P1SR - 5;
					System.out.println("Player 1 rolled a 5.  Player 1 has "
							+ P1SR + " tiles remaining.");
				} else {
					P1SR = P1SR - 6;
					System.out.println("Player 1 rolled a 6.  Player 1 has "
							+ P1SR + " tiles remaining.");
				}
				if (p <= 0.17) {
					P2SR = P2SR - 1;
					System.out.println("Player 2 rolled a 1.  Player 2 has "
							+ P2SR + " tiles remaining.");
				} else if (p > 0.17 && p <= 0.33) {
					P2SR = P2SR - 2;
					System.out.println("Player 2 rolled a 2.  Player 2 has "
							+ P2SR + " tiles remaining.");
				} else if (p > 0.33 && p <= 0.5) {
					P2SR = P2SR - 3;
					System.out.println("Player 2 rolled a 3.  Player 2 has "
							+ P2SR + " tiles remaining.");
				} else if (p > 0.5 && p <= 0.67) {
					P2SR = P2SR - 4;
					System.out.println("Player 2 rolled a 4.  Player 2 has "
							+ P2SR + " tiles remaining.");
				} else if (p > 0.67 && p <= 0.83) {
					P2SR = P2SR - 5;
					System.out.println("Player 2 rolled a 5.  Player 2 has "
							+ P2SR + " tiles remaining.");
				} else {
					P2SR = P2SR - 6;
					System.out.println("Player 2 rolled a 6.  Player 2 has "
							+ P2SR + " tiles remaining.");
				}
				if (q <= 0.17) {
					P3SR = P3SR - 1;
					System.out.println("Player 3 rolled a 1.  Player 3 has "
							+ P3SR + " tiles remaining.");
				} else if (q > 0.17 && q <= 0.33) {
					P3SR = P3SR - 2;
					System.out.println("Player 3 rolled a 2.  Player 3 has "
							+ P3SR + " tiles remaining.");
				} else if (q > 0.33 && q <= 0.5) {
					P3SR = P3SR - 3;
					System.out.println("Player 3 rolled a 3.  Player 3 has "
							+ P3SR + " tiles remaining.");
				} else if (q > 0.5 && q <= 0.67) {
					P3SR = P3SR - 4;
					System.out.println("Player 3 rolled a 4.  Player 3 has "
							+ P3SR + " tiles remaining.");
				} else if (q > 0.67 && q <= 0.83) {
					P3SR = P3SR - 5;
					System.out.println("Player 3 rolled a 5.  Player 3 has "
							+ P3SR + " tiles remaining.");
				} else {
					P3SR = P3SR - 6;
					System.out.println("Player 3 rolled a 6.  Player 3 has "
							+ P3SR + " tiles remaining.");
				}
				if (P1SR <= 0) {
					i = 100000;
					System.out.println("Congratulations.  Player 1 wins.");
				} else if (P2SR <= 0) {
					i = 100000;
					System.out.println("Congratulations.  Player 2 wins.");
				} else if (P3SR <= 0) {
					i = 100000;
					System.out.println("Congratulation. Player 3 wins.");
				} else {
				}
			}
		} else if (s == 4) {
			P1SR = 100;
			P2SR = 100;
			P3SR = 100;
			P4SR = 100;
			for (int i = 0; i < 100000; i++) {
				o = Math.random();
				p = Math.random();
				q = Math.random();
				r = Math.random();
				if (o <= 0.17) {
					P1SR = P1SR - 1;
					System.out.println("Player 1 rolled a 1.  Player 1 has "
							+ P1SR + " tiles remaining.");
				} else if (o > 0.17 && o <= 0.33) {
					P1SR = P1SR - 2;
					System.out.println("Player 1 rolled a 2.  Player 1 has "
							+ P1SR + " tiles remaining.");
				} else if (o > 0.33 && o <= 0.5) {
					P1SR = P1SR - 3;
					System.out.println("Player 1 rolled a 3.  Player 1 has "
							+ P1SR + " tiles remaining.");
				} else if (o > 0.5 && o <= 0.67) {
					P1SR = P1SR - 4;
					System.out.println("Player 1 rolled a 4.  Player 1 has "
							+ P1SR + " tiles remaining.");
				} else if (o > 0.67 && o <= 0.83) {
					P1SR = P1SR - 5;
					System.out.println("Player 1 rolled a 5.  Player 1 has "
							+ P1SR + " tiles remaining.");
				} else {
					P1SR = P1SR - 6;
					System.out.println("Player 1 rolled a 6.  Player 1 has "
							+ P1SR + " tiles remaining.");
				}
				if (p <= 0.17) {
					P2SR = P2SR - 1;
					System.out.println("Player 2 rolled a 1.  Player 2 has "
							+ P2SR + " tiles remaining.");
				} else if (p > 0.17 && p <= 0.33) {
					P2SR = P2SR - 2;
					System.out.println("Player 2 rolled a 2.  Player 2 has "
							+ P2SR + " tiles remaining.");
				} else if (p > 0.33 && p <= 0.5) {
					P2SR = P2SR - 3;
					System.out.println("Player 2 rolled a 3.  Player 2 has "
							+ P2SR + " tiles remaining.");
				} else if (p > 0.5 && p <= 0.67) {
					P2SR = P2SR - 4;
					System.out.println("Player 2 rolled a 4.  Player 2 has "
							+ P2SR + " tiles remaining.");
				} else if (p > 0.67 && p <= 0.83) {
					P2SR = P2SR - 5;
					System.out.println("Player 2 rolled a 5.  Player 2 has "
							+ P2SR + " tiles remaining.");
				} else {
					P2SR = P2SR - 6;
					System.out.println("Player 2 rolled a 6.  Player 2 has "
							+ P2SR + " tiles remaining.");
				}
				if (q <= 0.17) {
					P3SR = P3SR - 1;
					System.out.println("Player 3 rolled a 1.  Player 3 has "
							+ P3SR + " tiles remaining.");
				} else if (q > 0.17 && q <= 0.33) {
					P3SR = P3SR - 2;
					System.out.println("Player 3 rolled a 2.  Player 3 has "
							+ P3SR + " tiles remaining.");
				} else if (q > 0.33 && q <= 0.5) {
					P3SR = P3SR - 3;
					System.out.println("Player 3 rolled a 3.  Player 3 has "
							+ P3SR + " tiles remaining.");
				} else if (q > 0.5 && q <= 0.67) {
					P3SR = P3SR - 4;
					System.out.println("Player 3 rolled a 4.  Player 3 has "
							+ P3SR + " tiles remaining.");
				} else if (q > 0.67 && q <= 0.83) {
					P3SR = P3SR - 5;
					System.out.println("Player 3 rolled a 5.  Player 3 has "
							+ P3SR + " tiles remaining.");
				} else {
					P3SR = P3SR - 6;
					System.out.println("Player 4 rolled a 6.  Player 4 has "
							+ P3SR + " tiles remaining.");
				}
				if (r <= 0.17) {
					P4SR = P4SR - 1;
					System.out.println("Player 4 rolled a 1.  Player 4 has "
							+ P4SR + " tiles remaining.");
				} else if (r > 0.17 && r <= 0.33) {
					P4SR = P4SR - 2;
					System.out.println("Player 4 rolled a 2.  Player 4 has "
							+ P4SR + " tiles remaining.");
				} else if (r > 0.33 && r <= 0.5) {
					P4SR = P4SR - 3;
					System.out.println("Player 4 rolled a 3.  Player 4 has "
							+ P4SR + " tiles remaining.");
				} else if (r > 0.5 && r <= 0.67) {
					P4SR = P4SR - 4;
					System.out.println("Player 4 rolled a 4.  Player 4 has "
							+ P4SR + " tiles remaining.");
				} else if (r > 0.67 && r <= 0.83) {
					P4SR = P4SR - 5;
					System.out.println("Player 4 rolled a 5.  Player 4 has "
							+ P4SR + " tiles remaining.");
				} else {
					P4SR = P4SR - 6;
					System.out.println("Player 4 rolled a 6.  Player 4 has "
							+ P4SR + " tiles remaining.");
				}
				if (P1SR <= 0) {
					i = 100000;
					System.out.println("Congratulations.  Player 1 wins.");
				} else if (P2SR <= 0) {
					i = 100000;
					System.out.println("Congratulations.  Player 2 wins.");
				} else if (P3SR <= 0) {
					i = 100000;
					System.out.println("Congratulations.  Player 3 wins.");
				} else if (P4SR <= 0) {
					i = 100000;
					System.out.println("Congratulations.  Player 4 wins");
				} else {
				}
			}
		} else {
			System.out
					.println("That is not a valid number of players.  Please restart the game.");
		}
	}
/*
	public static void main(String[] args) {
		new RacingGame();
	}*/
}