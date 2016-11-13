import java.util.Scanner;

public class BeatTheDie {

	public BeatTheDie()
	{
		System.out.println("Welcome to Beat the Die!");
		System.out.println("How many Numbers do you want to play with?");
		Scanner rows = new Scanner(System.in);
		int numberRows = rows.nextInt();
		System.out.println("How many digits do you want in each number?");
		Scanner columns = new Scanner(System.in);
		int numberColumns = columns.nextInt();
		
		char[][] computerMoves = new char[numberRows][numberColumns];
		for (int i=0; i<computerMoves.length; i++) {
			for (int j=0; j<computerMoves[i].length; j++) {
				computerMoves[i][j]='_';
			}
		} 
	
		char[][] yourMoves = new char[numberRows][numberColumns];
		for (int i=0; i<yourMoves.length; i++) {
			for (int j=0; j<yourMoves[i].length; j++) {
				yourMoves[i][j]='_';
			}
		}
		
		int[][] yourFinalMoves = new int[numberRows][numberColumns];
		int[][] computerFinalMoves = new int[numberRows][numberColumns];
		
		System.out.println("My Moves: ");
		printArray(computerMoves);
		System.out.println("Your Moves: ");
		printArray(yourMoves);
		
		int[] diceRolled = new int[numberRows*numberColumns];
		
		for (int i=0; i<(numberRows*numberColumns); i++) {
			System.out.println("Round " + (i+1));
			
			diceRolled[i]=diceRoll();
			System.out.println("The number rolled is "+ diceRolled[i]);
			
			Scanner positionRows = new Scanner(System.in);
			Scanner positionColumns = new Scanner(System.in);
			
			int j =0;
			while (j!=1){
				int k =0;
				System.out.println("What row would you like to put the number in?");
				int row = positionRows.nextInt();
				if (1<=row && row<=numberRows) {
					while (k!=1) {
						System.out.println("What column would you like to put the number in?");
						int column = positionColumns.nextInt();
						
						if (1<=column && column<=numberColumns) {
							k=1;
							if (yourMoves[row-1][column-1]!='_') {
								System.out.println("Please pick a position that is not taken up yet.");
							}
							else {
								
								if (diceRolled[i]<=3) {
									boolean unfinished = true;
									for (int computerColumn =numberColumns-1; computerColumn>=0 && unfinished;computerColumn--) {
										for (int computerRow =0; computerRow<numberRows && unfinished;computerRow++) {
											if (computerMoves[computerRow][computerColumn]=='_') {
												computerMoves[computerRow][computerColumn]=(char)(diceRolled[i]+48);
												computerFinalMoves[computerRow][computerColumn]=diceRolled[i]; 
												unfinished=false;
												
											}
										}
									}
								}
								if (diceRolled[i]>=4) {
									boolean unfinished = true;
									for (int computerColumn =0; computerColumn<numberColumns && unfinished;computerColumn++) {
										for (int computerRow =0; computerRow<numberRows && unfinished;computerRow++) {
											if (computerMoves[computerRow][computerColumn]=='_') {
												computerMoves[computerRow][computerColumn]=(char)(diceRolled[i]+48);
												computerFinalMoves[computerRow][computerColumn]=diceRolled[i]; 
												unfinished=false;
												
											}
										}
									}
								}

								
								
								yourMoves[row-1][column-1]=(char) (diceRolled[i]+48);
								yourFinalMoves[row-1][column-1]= diceRolled[i];
								System.out.println("Computer's moves: ");
								printArray(computerMoves);
								System.out.println("Your moves: ");
								printArray(yourMoves);
								j=1;
								System.out.println();
							}
						}
						else {
							System.out.println("Please pick a Column number between 1 and " + numberColumns);
						}
					}
					
				}
				else {
					System.out.println("Please pick a row number between 1 and " + numberRows);
				}
			}
		}
		System.out.println("Computer's Final Score");
		int computerFinalScore = 0;
		for (int j=0;j<numberRows;j++) {
			for (int k=0;k<numberColumns;k++) {
				computerFinalScore+=(Math.pow(10, numberColumns-(k+1)))*computerFinalMoves[j][k];
			}
		}
		
		System.out.println(computerFinalScore);
		System.out.println("Your Final Score: ");
		int finalScore = 0;
		for (int j=0;j<numberRows;j++) {
			for (int k=0;k<numberColumns;k++) {
				finalScore+=(Math.pow(10, numberColumns-(k+1)))*yourFinalMoves[j][k];
			}
			
		}
		
		System.out.println(finalScore);
		System.out.println();
		if (finalScore>computerFinalScore) {
			System.out.println("You WIN!");
		}
		else {
			System.out.println("You Lose!");
		}
		
	}
	/*public static void main(String[] args) {
		
	}*/
		
	public static int diceRoll() {
		
		return (int) (Math.random()*6+1);
	}
	
	public static void printArray( char[][] a ) {
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		
		
	}

}
}
