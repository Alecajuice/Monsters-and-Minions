package player;

import game.Game;
import game.GameElement;
import card.Card;
import card.Hand;

public abstract class Player extends GameElement
{
	private Hand hand;
	
	public Player(Game game)
	{
		super(game);
	}
}
