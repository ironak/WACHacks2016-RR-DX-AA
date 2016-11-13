//import java.util.*;

public class Card implements Comparable
{
	private static final String[] VALUE_STRINGS = { "Error", "Ace", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
	private static final String[] SUIT_STRINGS = { "Clubs", "Diamonds", "Hearts", "Spades" };
	private int value;	//1: Ace, 2-10: 2-10, 11: Jack, 12: Queen, 13: King
	private int suit;	//0: Clubs, 1: Diamonds, 2: Hearts, 3: Spades
	
	//Constructors
	public Card()
	{
		value = 1;
		suit = 3;
	}
	
	public Card( int v, int s )
	{
		setValue( v );
		setSuit( s );
	}
	
	//Getters
	public int getValue()
	{
		return value;
	}
	
	public int getSuit()
	{
		return suit;
	}
	
	public String getValueString()
	{
		return VALUE_STRINGS[value];
	}
	
	public String getSuitString()
	{
		return SUIT_STRINGS[suit];
	}
	
	public String toString()
	{
		return getValueString() + " of " + getSuitString();
	}
	
	//Setters
	public void setValue( int v )
	{
		if ( v >= 1 && v <= 13 )
		{
			value = v;
		}
		else
		{
			value = 1;
			System.out.println( v + " is not a valid value. Card has been set to " + toString() );
		}
	}
	
	public void setSuit( int s )
	{
		if ( s >= 0 && s <= 3 )
		{
			suit = s;
		}
		else
		{
			suit = 3;
			System.out.println( s + " is not a valid suit. Card has been set to " + toString() );
		}
	}
	
	//Compare
	public int compareTo( Card c )
	{
		return getIndexInSortedDeck() - c.getIndexInSortedDeck();
	}
	
	public int compareTo( Object o )
	{
		return -1;
	}
	
	public int getIndexInSortedDeck()
	{
		return 13*suit + value;
	}
	
	public boolean equals( Card c )
	{
		return compareTo( c ) == 0;
	}
	
	/* public static void main( String[] args )
	{
		ArrayList<Card> cards = new ArrayList<Card>();
		cards.add( new Card( 1,0 ) );
		cards.add( new Card( 1,1 ) );
		cards.add( new Card( 1,2 ) );
		cards.add( new Card( 12,0 ) );
		cards.add( new Card( 13,0 ) );
		Collections.sort( cards );
		for( Card c : cards )
		{
			System.out.println( c );
		}
	} */
}