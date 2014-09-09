package player;

import card.CreatureCard;
import card.Card.Rank;
import game.Game;

public class Fighter extends Character
{

	public Fighter(Game game)
	{
		super(game);
		this.setCharacter((CreatureCard)this.game.getDeck().fetch(Rank.KING, this));
	}

}
