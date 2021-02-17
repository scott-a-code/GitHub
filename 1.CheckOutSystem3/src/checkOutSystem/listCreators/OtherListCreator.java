package checkOutSystem.listCreators;

import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

import checkOutSystem.items.Other;

public class OtherListCreator {

	static Other flowers = new Other(601, "Flower", BigDecimal.valueOf(24.99));
	static Other petFood = new Other(602, "Pet Food", BigDecimal.valueOf(13.99));
	static Other toys = new Other(603, "Toys", BigDecimal.valueOf(6.99));
	static Other cards = new Other(604, "Card", BigDecimal.valueOf(1.99));

	public static TreeSet<Other> create() {
		Set<Other> otherSet = Set.of(flowers, petFood, toys, cards);
		TreeSet<Other> otherTS = new TreeSet<>(otherSet);
		return otherTS;
	}

	public static Other getFlowers() {
		return flowers;
	}

	public static Other getPetFood() {
		return petFood;
	}

	public static Other getToys() {
		return toys;
	}

	public static Other getCards() {
		return cards;
	}
}
