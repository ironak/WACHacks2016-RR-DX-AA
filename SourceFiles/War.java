import java.util.*;

public class War
{
	public War()
	{
		ArrayList<Card> fullDeck = new ArrayList<Card>();
		ArrayList<Card> player1 = new ArrayList<Card>();
		ArrayList<Card> player2 = new ArrayList<Card>();
		ArrayList<Card> pot = new ArrayList<Card>();
		Card player1card;
		Card player2card;
		
		for( int s = 0; s < 4; s++ )
		{
			for( int v = 1; v < 14; v++ )
			{
				fullDeck.add( new Card( v, s ) );
			}
		}
		
		Collections.shuffle( fullDeck );
		for( int j = 0; j < 26; j++ )
		{
			player1.add( fullDeck.get( j ) );
		}
		for( int j = 26; j < 52; j++ )
		{
			player2.add( fullDeck.get( j ) );
		}
		
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Enter Player 1's name: " );
		String player1Name = input.nextLine(); 
		System.out.println( "Enter Player 2's name: " );
		String player2Name = input.nextLine(); 
		
		while( player1.size() > 0 && player2.size() > 0 )
		{
			System.out.println( player1Name + "'s Turn (Press Enter)" );
			input.nextLine();
			player1card = player1.remove( 0 );
			pot.add( player1card );
			System.out.println( player1Name + " plays the " + player1card );
			System.out.println();
			
			System.out.println( player2Name + "'s Turn (Press Enter)" );
			input.nextLine();
			player2card = player2.remove( 0 );
			pot.add( player2card );
			System.out.println( player2Name + " plays the " + player2card );
			System.out.println();
			
			if ( player1card.getValue() > player2card.getValue() )
			{
				for( Card c : pot )
				{
					player1.add( c );
				}
				pot.clear();
				System.out.println( player1Name + " won this round, and now has " + player1.size() + " cards!" );
				System.out.println( "-------------------------------------------" );
			}
			else if ( player1card.getValue() < player2card.getValue() )
			{
				for( Card c : pot )
				{
					player2.add( c );
				}
				pot.clear();
				System.out.println( player2Name + " won this round, and now has " + player2.size() + " cards!" );
				System.out.println( "-------------------------------------------" );
			}
			else if ( player1card.getValue() == player2card.getValue() )
			{
				for( int i = 0; i < 3 && player1.size() > 0 && player2.size() > 0; i++ )
				{
					player1card = player1.remove( 0 );
					pot.add( player1card );
					System.out.println( player1Name + " puts down the " + player1card );
					
					player2card = player2.remove( 0 );
					pot.add( player2card );
					System.out.println( player2Name + " puts down the " + player2card );
				}
			}
			else
			{
				System.out.println( "Oops, something went wrong..." );
			}
			
			System.out.println();
		}
		
		System.out.println( ( player1.size() > 0 ? player1Name : player2Name ) + " won the war!" );
	}
	/*
	public static void main( String[] args )
	{
		new War();
	}*/
}