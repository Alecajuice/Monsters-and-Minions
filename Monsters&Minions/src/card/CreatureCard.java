package card;

import player.Player;

public class CreatureCard extends Card
{
	private int hp;
	
	public CreatureCard(Rank rank, Suit suit, Player owner)
	{
		super(rank, suit, owner);
	}

}
