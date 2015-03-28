package com.example.hearthstonedeckbuilder;

import java.util.ArrayList;
import java.util.List;

import android.app.Application;

public class HearthstoneDeckBuilderApplication extends Application {

	private List<Card> cardsList;
	private List<Deck> deckList;

	public HearthstoneDeckBuilderApplication() {
		this.cardsList = new ArrayList<Card>();
		this.cardsList.add(new Card("Backstab",
				"Deal 2 damage to an undamaged minion.", 0, 0, 2,
				CardQuality.COMMON, HeroesClasses.ROGUE));
		this.cardsList.add(new Card("SI:7 Agent", "Combo: Deal 2 damage.", 3,
				3, 3, CardQuality.RARE, HeroesClasses.ROGUE));
	}

	public List<Card> getCardsList(HeroesClasses heroeClass) {
		List<Card> res = new ArrayList<Card>();
		for (Card card : this.cardsList) {
			if (card.getCardClass() == heroeClass)
				res.add(card);
		}
		return res;
	}

	public List<Deck> getDecksList() {
		return this.deckList;
	}
}
