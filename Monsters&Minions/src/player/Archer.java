package player;

import card.CreatureCard;
import card.Card.Rank;
import game.Game;

public class Archer extends Character
{

	public Archer(Game game)
	{
		super(game);
		this.setCharacter((CreatureCard)this.game.getDeck().fetch(Rank.QUEEN, this));
	}

}
