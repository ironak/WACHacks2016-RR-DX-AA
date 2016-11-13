import java.util.Scanner;

public class Menu
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		int choice = 0;
		String stringChoice = "0";
		System.out.println();
		System.out.println( "WELCOME TO THE GAME EMPORIUM");
		boolean choiceIsValid = false;
		
		while( choice >= 0 )
		{
			if( !( choice >= 1 && choice <= 10 ) )
			{
				System.out.println();
				System.out.println( "-------------------" );
				System.out.println( "Choose a game:" );
				System.out.println( " <1> Mastermind" );
				System.out.println( " <2> Beat The Die" );
				System.out.println( " <3> Tic Tac Toe" );
				System.out.println( " <4> Dungeon Escape" );
				System.out.println( " <5> Coin Flipper" );
				System.out.println( " <6> War" );
				System.out.println( " <7> Racing Game" );
				System.out.println( " <8> Guesser" );
				System.out.println( " <9> Dice Generator" );
				System.out.println( " <10> Quit" );
				
				stringChoice = input.nextLine();
				
				choiceIsValid = false;
				for( int i = 1; i <= 10; i++ )
				{
					if ( stringChoice.equals( "" + i ) )
					{
						choiceIsValid = true;
					}
				}
			}
			
			while( !choiceIsValid )
			{
				System.out.println( "Please enter a single number from 1 to 10." );
				stringChoice = input.nextLine();
				
				for( int i = 1; i <= 10; i++ )
				{
					if ( stringChoice.equals( "" + i ) )
					{
						choiceIsValid = true;
					}
				}
			}
			
			choice = Integer.parseInt( stringChoice );
			
			switch( choice )
			{
				case 1:
				playMastermind();
				break;
				case 2:
				playBeatTheDie();
				break;
				case 3:
				playTicTacToe();
				break;
				case 4:
				playDungeonEscape();
				break;
				case 5:
				playCoinFlipper();
				break;
				case 6:
				playWar();
				break;
				case 7:
				playRacingGame();
				break;
				case 8:
				playGuesser();
				break;
				case 9:
				playDiceGenerator();
				break;
				case 10:
				choice = -1;
				break;
				default:
				System.out.println( "There's been a mistake." );
				choice = 0;
				break;
			}
			
			System.out.println();
			
			if ( choice != -1 && !userWantsToReplay() )
			{
				choice = 0;
			}
		}
	}
	
	public static boolean userWantsToReplay()
	{
		Scanner input = new Scanner( System.in );
		System.out.println();
		System.out.println( "Do you want to play the same game again?" );
		System.out.println( "(Y/N) Please: " );
		String choice = input.nextLine();
		
		if ( choice.equalsIgnoreCase( "y" ) )
		{
			return true;
		}
		else if ( choice.equalsIgnoreCase( "n" ) )
		{
			return false;
		}
		else
		{
			System.out.println( "We'll take that as a 'no'" );
			return false;
		}
	}
	
	public static void playMastermind()
	{
		new Mastermind();
	}
	
	public static void playBeatTheDie()
	{
		new BeatTheDie();
	}
	
	public static void playTicTacToe()
	{
		new TicTacToe();
	}
	
	public static void playDungeonEscape()
	{
		new DungeonEscape();
	}
	
	public static void playCoinFlipper()
	{
		new CoinFlipper();
	}
	
	public static void playWar()
	{
		new War();
	}
	
	public static void playRacingGame()
	{
		new RacingGame();
	}
	
	public static void playGuesser()
	{
		new Guesser();
	}
	
	public static void playDiceGenerator()
	{
		new DiceGenerator();
	}
}