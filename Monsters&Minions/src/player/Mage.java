package player;

import game.Game;
import card.Card;
import card.Card.Rank;
import card.CreatureCard;

public class Mage extends Character
{
	public Mage(Game game)
	{
		super(game);
		this.setCharacter((CreatureCard)this.game.getDeck().fetch(Rank.JACK, this));
	}
}
