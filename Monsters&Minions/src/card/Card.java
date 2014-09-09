package card;

import player.Player;

public class Card
{
	public enum Rank
	{
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
	}
	public enum Suit
	{
		CLUBS, DIAMONDS, HEARTS, SPADES;
	}
	private Rank rank;
		public Rank getRank(){return this.rank;}
	private Suit suit;
		public Suit getSuit(){return this.suit;}
	
	private Player owner;
	
	public Card(Rank rank, Suit suit, Player owner)
	{
		this.rank = rank;
		this.suit = suit;
		this.owner = owner;
	}
	
	public static Suit randomSuit()
	{
		int random = (int)Math.round(Math.random() * 4);
		switch(random)
		{
		case 1:
			return Suit.CLUBS;
		case 2:
			return Suit.DIAMONDS;
		case 3:
			return Suit.HEARTS;
		default:
			return Suit.SPADES;
		}
	}
}
