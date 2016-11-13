import java.util.Scanner;
public class TicTacToe {
	public static void main(String[] args) {
		char[][] theBoard = new char[3][3];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				theBoard[i][j] = ' ';
			}
		}
		int turnCounter = 1;
		boolean computer = false;
		boolean opponentChosen = false;
		while (!opponentChosen) {
			System.out.println("Do you want to play against a computer? Enter yes or no");
			String response = input.next();
			if (response.toLowerCase().contains("yes") && !response.toLowerCase().contains("no")) {
				computer = true;
				opponentChosen = true;
				boolean orderChosen = false;
				while (!orderChosen) {
					System.out.println("Do you want to go first? Enter yes or no");
					response = input.next();
					if (response.toLowerCase().contains("yes") && !response.toLowerCase().contains("no")) {
						orderChosen = true;
					}
					else if (response.toLowerCase().contains("no") && !response.toLowerCase().contains("yes")) {
						orderChosen = true;
						turnCounter++;
					}
				}
			}
			else if (response.toLowerCase().contains("no") && !response.toLowerCase().contains("yes")) {
				opponentChosen = true;
			}
		}

		//nought goes first or is human

		char currentPlayer;
		boolean keepGoing = true;
		while (keepGoing) {
			if (turnCounter % 2 == 0 && computer) {
				boolean validPosition = false;
				int xPos;
				int yPos;
				do {
					xPos = (int)(Math.random() * 3);
					yPos = (int)(Math.random() * 3);
					if (theBoard[xPos][yPos] == ' ') {
						validPosition = true;
					}
				} while (!validPosition);
				theBoard[xPos][yPos] = 'O';
				System.out.println("\nComputer turn: ");
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						System.out.print(theBoard[j][i] + " | ");
					}
					System.out.println();
					System.out.println("_   _   _");
				}
				turnCounter++;
			}
			if (turnCounter % 2 == 1)
				currentPlayer = 'X';
			else
				currentPlayer = 'O';
			boolean validPosition = false;
			while (!validPosition) {
				System.out.println("Player " + currentPlayer + ": Choose x position from 1 to 3 inclusive");
				int xPos = input.nextInt() - 1;

				System.out.println("Player " + currentPlayer + ": Choose y position from 1 to 3 inclusive");
				int yPos = input.nextInt() - 1;
				if (xPos >= 0 && xPos < 3
						&& yPos >= 0 && yPos < 3
						&& theBoard[xPos][yPos] == ' ') {
					theBoard[xPos][yPos] = currentPlayer;
					validPosition = true;
				}
				else System.out.println("Invalid position entered");
			}
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(theBoard[j][i] + " | ");
				}
				System.out.println();
				System.out.println("_   _   _");
			}
			turnCounter += 1;

			for (int i = 0; i < 3; i++) {
				if (theBoard[i][0] == theBoard[i][1] && theBoard[i][0] == theBoard[i][2] && theBoard[i][0] != ' ') {
					keepGoing = false;
					System.out.println("Player " + theBoard[i][0] + " wins.");
				}
			}
			if (keepGoing) {
				for (int i = 0; i < 3; i++) {
					if (theBoard[0][i] == theBoard[1][i] && theBoard[0][i] == theBoard[2][i] && theBoard[0][i] != ' ') {
						keepGoing = false;
						System.out.println("Player " + theBoard[0][i] + " wins.");
					}
				}
				if (keepGoing) {
					if (theBoard[0][0] == theBoard[1][1] && theBoard[0][0] == theBoard[2][2] && theBoard[0][0] != ' ') {
						keepGoing = false;
						System.out.println("Player " + theBoard[0][0] + " wins.");
					}
					else if (theBoard[2][0] == theBoard[1][1] && theBoard[2][0] == theBoard[0][2] && theBoard[2][0] != ' ') {
						keepGoing = false;
						System.out.println("Player " + theBoard[1][1] + " wins.");
					}
					if (keepGoing) {
						boolean hasBlank = false;
						for (int i = 0; i < 3; i++) {
							for (int j = 0; j < 3; j++) {
								if (theBoard[i][j] == ' ')
									hasBlank = true;
							}
						}
						if (!hasBlank) {
							keepGoing = false;
							System.out.println("No spaces left, noughts and crosses tie.");
						}
					}
				}
			}
		}
		input.close();
	}

}
