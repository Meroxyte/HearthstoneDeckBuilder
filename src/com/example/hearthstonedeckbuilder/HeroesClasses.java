package com.example.hearthstonedeckbuilder;

public enum HeroesClasses {

	DROOD("Drood"), HUNTER("Hunter"), MAGE("Mage"), PALADIN("Paladin"), PRIEST(
			"Priest"), ROGUE("Rogue"), SHAMAN("Shaman"), WARLOCK("Warlock"), WARRIOR(
			"Warrior"), JARAXXUS("Jaraxxus"), NEUTRAL("Neutral");

	private final String name;

	private HeroesClasses(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
