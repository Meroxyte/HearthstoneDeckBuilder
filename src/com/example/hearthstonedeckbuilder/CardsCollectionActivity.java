package com.example.hearthstonedeckbuilder;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;

public class CardsCollectionActivity extends Activity implements
		OnClickListener {

	private List<Card> cardsList;
	private HearthstoneDeckBuilderApplication application;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cards_collection);

		this.application = (HearthstoneDeckBuilderApplication) this
				.getApplication();
		
		this.cardsList = this.application.getCards();
		
		ListView listView = (ListView) findViewById(R.id.cardsListDisplay);
		listView.setAdapter(new CardsListAdapter(this.getBaseContext(),
				this.cardsList, this));
	}

	// Change attribute cardsList to be the list of cards corresponding to the
	// hero
	private void displayCards(HeroesClasses heroeClass) {

//		this.cardsList = this.application.getCardsList(heroeClass);
//		ListView listView = (ListView) findViewById(R.id.cardsListDisplay);
//		listView.setAdapter(new CardsListAdapter(this.getBaseContext(),
//				this.cardsList, this));
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.droodCardsButton:
			displayCards(HeroesClasses.DROOD);
			break;
		case R.id.hunterCardsButton:
			displayCards(HeroesClasses.HUNTER);
			break;
		case R.id.mageCardsButton:
			displayCards(HeroesClasses.MAGE);
			break;
		case R.id.paladinCardsButton:
			displayCards(HeroesClasses.PALADIN);
			break;
		case R.id.priestCardsButton:
			displayCards(HeroesClasses.PRIEST);
			break;
		case R.id.rogueCardsButton:
			displayCards(HeroesClasses.ROGUE);
			break;
		case R.id.shamanCardsButton:
			displayCards(HeroesClasses.SHAMAN);
			break;
		case R.id.warlockCardsButton:
			displayCards(HeroesClasses.WARLOCK);
			break;
		case R.id.warriorCardsButton:
			displayCards(HeroesClasses.WARRIOR);
			break;
		case R.id.neutralCardsButton:
			displayCards(HeroesClasses.NEUTRAL);
			break;

		}
	}
}
