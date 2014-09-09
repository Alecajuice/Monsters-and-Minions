package card;

import java.util.ArrayList;

import player.Player;
import card.Card.Rank;
import card.Card.Suit;
import game.Game;
import game.GameElement;

public class Deck extends GameElement
{
	private ArrayList<Card> cards;
	
	public Deck(Game game)
	{
		super(game);
	}
	
	public Card fetch(Rank rank, Player owner)
	{
		Suit suit = Card.randomSuit();
		if(cards.remove(new Card(rank, suit, owner)))
		{
			return new Card(rank, suit, owner);
		}
		else
		{
			return fetch(rank, owner);
		}
	}
}
