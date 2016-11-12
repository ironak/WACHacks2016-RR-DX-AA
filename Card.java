public class Card implements Comparable
{
	private static final String[] VALUE_STRINGS = { "Error", "Ace", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
	private static final String[] SUIT_STRINGS = { "Clubs", "Diamonds", "Hearts", "Spades" };
	private int value;	//1: Ace, 2-10: 2-10, 11: Jack, 12: Queen, 13: King
	private int suit;	//0: Clubs, 1: Diamonds, 2: Hearts, 3: Spades
	
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
	
	public int getValueString()
	{
		return VALUE_STRINGS[value];
	}
	
	public int getSuitString()
	{
		return SUIT_STRINGS[suit];
	}
	
	public String toString()
	{
		return getValueString() + " of " getSuitString();
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
			System.out.println( v + " is not a valid value. Card has been set to " toString() );
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
			System.out.println( s + " is not a valid suit. Card has been set to " toString() );
		}
	}
	
	public int compareTo( Card c )
	{
		return getIndexInSortedDeck() - c.getIndexInSortedDeck();
	}
	
	public int getIndexInSortedDeck()
	{
		return 13*suit + value;
	}
}