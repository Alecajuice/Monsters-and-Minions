package player;

import game.Game;
import card.Card;
import card.CreatureCard;

public abstract class Character extends Player
{
	private CreatureCard character;
		public CreatureCard getCharacter() {return character;}
		public void setCharacter(CreatureCard character) {this.character = character;}
	private int level;
	
	public Character(Game game)
	{
		super(game);
	}
}
