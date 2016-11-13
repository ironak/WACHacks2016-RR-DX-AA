import java.util.*;

public class Hand
{
	private ArrayList<Card> cards;
	
	//Constructors
	public Hand()
	{
		cards = new ArrayList<Card>();
	}
	
	public Hand( ArrayList<Card> newCards )
	{
		setCards( newCards );
	}
	
	//Getters
	public ArrayList<Card> getCards()
	{
		return cards;
	}
	
	//Setters
	public void setCards( ArrayList<Card> newCards )
	{
		cards = newCards;
	}
	
	public void empty()
	{
		setCards( new ArrayList<Card>() );
	}
	
	//Adding cards
	public Card addCard( Card c )
	{
		if ( !contains( c ) )
		{
			cards.add( c );
		}
		
		return c;
	}
	
	//Drawing cards
	public Card drawTopCard()
	{
		return removeCardAt( 0 );
	}
	
	public Card drawRandomCard()
	{
		return removeCardAt( (int) ( Math.random() * cards.size() ) );
	}
	
	//Checking cards
	public Card checkCardAt( int index )
	{
		return cards.get( index );
	}
	
	public boolean contains( Card c )
	{
		boolean contains = false;
		
		for( Card myCard : cards )
		{
			if ( c.equals( myCard ) )
			{
				contains = true;
			}
		}
		
		return contains;
	}
	
	//Removing cards
	public Card removeCardAt( int index )
	{
		return cards.remove( index );
	}
	
	public void removeCard( Card c )
	{
		for( Card myCard : cards )
		{
			if ( myCard.equals( c ) )
			{
				cards.remove( myCard );
			}
		}
	}
	
	public void dealCardsFromTop( int number, Hand h )
	{
		for( int j = 0; j < number; j++ )
		{
			h.addCard( removeCardAt(j) );
		}
	}
	
	//Other methods
	public void makeIntoFullDeck()
	{
		for( int s = 0; s < 4; s++ )
		{
			for( int v = 1; v < 14; v++ )
			{
				cards.add( new Card( v, s ) );
			}
		}
		
	}
	
	public void shuffle()
	{
		Collections.shuffle(cards);
	}
}