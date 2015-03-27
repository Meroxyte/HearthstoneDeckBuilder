package com.example.hearthstonedeckbuilder;

public enum CardQuality {

	COMMON("Common"),
	RARE("Rare"),
	EPIC("Epic"),
	LEGENDARY("Legendary");
	
	private final String quality;
	
	private CardQuality(String quality)
	{
		this.quality=quality;
	}
	
	public String getQuality()
	{
		return this.quality;
	}
}
