package com.example.hearthstonedeckbuilder;

import android.graphics.drawable.Drawable;

public class Card {
	
	private String name;
	private String desc;
	private int manaCost;
	private int health;
	private int attack;
	private int amountInDeck;
	private CardQuality quality;
	private HeroesClasses cardClass;
	private String drawableId;

	public Card(String name,String desc, int manaCost, int health, int attack, CardQuality quality, HeroesClasses cardClass)
	{
		this.name=name;
		this.desc=desc;
		this.manaCost=manaCost;
		this.health=health;
		this.attack=attack;
		this.amountInDeck=0;
		this.quality=quality;
		this.cardClass=cardClass;
		this.drawableId=this.name.replace(".","").replace(" ","_").toLowerCase();
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getDescription()
	{
		return this.desc;
	}
	public int getManaCost()
	{
		return this.manaCost;
	}
	
	public int getHealth()
	{
		return this.health;
	}
	
	public int getAttack()
	{
		return this.attack;
	}
	
	public int getAmountInDeck()
	{
		return this.amountInDeck;
	}
	
	public String getDrawableId()
	{
		return this.drawableId;
	}
	
	public CardQuality getQuality()
	{
		return this.quality;
	}
	
	public HeroesClasses getCardClass()
	{
		return this.cardClass;
	}
	
	//returns true if card was added
	public boolean addOneCardInDeck()
	{
		this.amountInDeck++;
		
		if (this.amountInDeck>1)
		{
			if (this.quality==CardQuality.LEGENDARY)
			{
			this.amountInDeck=1;
			return false;
			}
			else if (this.amountInDeck>=2)
			{
				this.amountInDeck=2;
				return false;
			}
		}
		return true;
	}
	
	//returns true if card was taken off
	public boolean takeOneCardOffDeck()
	{
		this.amountInDeck--;
		
		if (this.amountInDeck<0)
		{
			this.amountInDeck=0;
			return false;
		}
		return true;
	}

}
