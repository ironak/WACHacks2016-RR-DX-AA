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
		
		while( choice >= 0 )
		{
			if( choice != 1 && choice != 2 && choice != 3 )
			{
				System.out.println();
				System.out.println( "-------------------" );
				System.out.println( "Choose a game:" );
				System.out.println( " <1> Mastermind" );
				System.out.println( " <2> Beat The Die" );
				System.out.println( " <3> Quit" );
				
				stringChoice = input.nextLine();
			}
			
			while( !stringChoice.equals( "1" ) && !stringChoice.equals( "2" ) && !stringChoice.equals( "3" ) )
			{
				System.out.println( "Please enter a single number from 1 to 3." );
				stringChoice = input.nextLine();
			}
			
			choice = Integer.parseInt( stringChoice );
			
			switch( choice )
			{
				case 1:
				playMasterMind();
				break;
				case 2:
				playBeatTheDie();
				break;
				case 3:
				choice = -1;
				break;
				default:
				System.out.println( "There's been a mistake." );
				choice = 0;
				break;
			}
			
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
	
	public static void playMasterMind()
	{
		System.out.println( "Played Mastermind." );
	}
	
	public static void playBeatTheDie()
	{
		System.out.println( "Played Beat The Die." );
	}
}