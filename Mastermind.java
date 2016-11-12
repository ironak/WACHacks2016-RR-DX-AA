import java.util.Scanner;
public class Mastermind {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//user can choose number of things they're guessing
		boolean positionsChosen = false;
		int numPositions = 0;
		while (!positionsChosen) {
			System.out.println("How many positions do you want to play with? Enter an integer greater than 0");
			numPositions = input.nextInt();
			if (numPositions >= 1)
				positionsChosen = true;
		}
		String[] realPosition = new String[numPositions];

		//ACTUALLY NOPE user can choose how many colors to play with (2-8)
		boolean colorsChosen = false;
		int numColors = 0;
		String[] colors = {"cyan", "red", "green", "yellow", "orange", "purple", "black", "white"};
		char[] colorChar = {'c', 'r', 'g', 'y', 'o', 'p', 'b', 'w'};
		while (!colorsChosen) {
			System.out.println("How many colors do you want to play with? Enter an integer between 2 and 8 inclusive");
			numColors = input.nextInt();
			if (numColors >= 2 && numColors <= 8) {
				colorsChosen = true;
			}
		}

		String colorsPlayedWith = "";
		for (int i = 0; i < numColors - 1; i++) {
			colorsPlayedWith += colors[i] + "(" + colors[i].charAt(0) + "), ";
		}
		colorsPlayedWith += colors[numColors - 1] + "(" + colors[numColors - 1].charAt(0) + ")";
		System.out.println("The colors you are playing with are " + colorsPlayedWith + ".");

		//user can choose if another user or the computer sets the code
		boolean setterChosen = false;
		while (!setterChosen) {
			System.out.println("Do you want the computer to set the unknown code? Enter yes or no");
			String response = input.next();
			if (response.toLowerCase().contains("yes") && !response.toLowerCase().contains("no")) {
				for (int i = 0; i < realPosition.length; i++) {
					int j = (int)(Math.random() * (numColors));
					realPosition[i] = colors[j];
					setterChosen = true;
				}
			}
			else if (response.toLowerCase().contains("no") && !response.toLowerCase().contains("yes")) {
				for (int i = 0; i < realPosition.length; i++) {
					boolean choiceSet = false;
					while (!choiceSet) {
						System.out.println("Enter choice " + colorsPlayedWith + " for position " + (i + 1));
						String choice = input.next();
						for (int j = 0; j < numColors; j++) {
							if (colors[j].equals(choice)) {
								realPosition[i] = choice;
								choiceSet = true;
							}
							else if (colorChar[j] == choice.charAt(0)) {
								realPosition[i] = colors[j];
								choiceSet = true;
							}
						}
					}
				}
				setterChosen = true;
			}
		}

		//user makes guesses, which are evaluated
		boolean allCorrect = false;
		String[] guessArray = new String[numPositions];
		int count = 0;
		int trueCorrect = 0;
		int semiCorrect = 0;
		while (!allCorrect) {
			count++;
			//get the user guess
			for (int i = 0; i < numPositions; i++) {
				boolean guessSet = false;
				while (!guessSet) {
					System.out.println("Enter guess " + colorsPlayedWith + " for position " + (i + 1));
					String guess = input.next();
					for (int j = 0; j < numColors; j++) {
						if (colors[j].equals(guess)) {
							guessArray[i] = guess;
							guessSet = true;
						}
						else if (colorChar[j] == guess.charAt(0)) {
							guessArray[i] = colors[j];
							guessSet = true;
						}
					}
				}
			}

			//check the guess
			semiCorrect = 0;
			trueCorrect = 0;
			String[] tempAnswers = new String[numPositions];
			for (int i = 0; i < numPositions; i++) {
				tempAnswers[i] = "" + realPosition[i];
			}
			for (int i = 0; i < numPositions; i++) {
				if (guessArray[i].equals(tempAnswers[i])) {
					trueCorrect++;
					guessArray[i] = "123";
					tempAnswers[i] = "abc";
				}
			}
			for (int i = 0; i < numPositions; i++) {
				for (int j = 0; j < numPositions; j++) {
					if (guessArray[i].equals(tempAnswers[j])) {
						guessArray[i] = "456";
						tempAnswers[j] = "def";
						semiCorrect++;
					}
				}
			}
			System.out.println("Right color, right position:" + trueCorrect);
			System.out.println("Right color, wrong position:" + semiCorrect);
			System.out.println("Number of guesses so far:" + count);
			if (trueCorrect == numPositions) {
				allCorrect = true;
			}
		}

		System.out.println("You've won! The correct code was ");
		for (int i = 0; i < numPositions; i++) {
			System.out.print(realPosition[i] + " ");
		}
		System.out.println("It took you " + count + " tries.");

		input.close();
	}

}
