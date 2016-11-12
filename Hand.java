import java.util.*;

public class Hand
{
	private static final ArrayList<Card> deck;
	for( int s = 0; s < 4; s++ )
	{
		for( int v = 1; v < 14; v++ )
		{
			cards.add( v, s );
		}
	}
	private ArrayList<Card> cards;
	
	public Hand()
	{
		cards = ArrayList<Cards>();
	}
	
	public Hand( ArrayList<Cards> newCards )
	{
		setCards( newCards );
	}
	
	public setCards( ArrayList<Cards> newCards )
	{
		cards = newCards.clone();
	}
	
	public Card drawCard()
	{
		
	}
	
	public void makeIntoFullDeck()
	{
		
	}
	
	public void shuffle()
	{
		Collections.shuffle(cards);
	}
}