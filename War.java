import java.util.Scanner;

public class War
{
	public War()
	{
		Hand fullDeck = new Hand().makeIntoFullDeck();
		Hand player1 = new Hand();
		Hand player2 = new Hand();
		Card player1card;
		Card player2card;
		Hand pot = new Hand();
		
		fullDeck.shuffle();
		fullDeck.dealCardsFromTop( 26, player1 );
		player2.setCards( fullDeck.getCards() );
		
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Enter Player 1's name: " );
		String player1Name = input.nextLine(); 
		System.out.println( "Enter Player 2's name: " );
		String player2Name = input.nextLine(); 
		
		while( player1.getCards().size() > 0 && player2.getCards().size() > 0 )
		{
			System.out.println( player1Name + "'s Turn (Press Enter)" );
			input.nextLine();
			player1card = player1.drawTopCard();
			pot.addCard( player1card );
			System.out.println( player1Name + "plays a(n) " player1card );
			
			System.out.println( player2Name + "'s Turn (Press Enter)" );
			input.nextLine();
			player2card = player2.drawTopCard();
			pot.addCard( player2card );
			System.out.println( player2Name + "plays a(n) " player2card );
			
			if ( player1card.greaterThanByValue( player2card ) )
			{
				System.out.println( player1Name + " won this round!" );
				for( Card c : pot )
				{
					player1.addCard();
				}
			}
			else if ( player2card.greaterThanByValue( player1card ) )
			{
				System.out.println( player1Name + " won this round!" );
				for( Card c : pot )
				{
					player1.addCard();
				}
			}
			else if ( player2card.equalsByValue( player1card ) )
			{
				
			}
			else
			{
				System.out.println( "Oops, something went wrong..." );
			}
			
		}
		
		System.out.println( ( player1.getCards().size() > 0 ? player1Name : player2Name ) + " won the war!" );
	}
	
	public static void main( String[] args )
	{
		new War();
	}
}