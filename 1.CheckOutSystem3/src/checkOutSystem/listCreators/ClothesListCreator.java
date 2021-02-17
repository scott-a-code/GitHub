package checkOutSystem.listCreators;

import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

import checkOutSystem.items.Clothes;

public class ClothesListCreator {

	static Clothes tshirt = new Clothes(201, "T-shirts", BigDecimal.valueOf(5.99));
	static Clothes trousers = new Clothes(202, "Trousers", BigDecimal.valueOf(6.99));
	static Clothes underwear = new Clothes(203, "Underwear", BigDecimal.valueOf(3.49));
	static Clothes shoes = new Clothes(204, "Shoes", BigDecimal.valueOf(21.99));
	static Clothes socks = new Clothes(205, "Socks", BigDecimal.valueOf(1.99));

	public static Set<Clothes> create() {
		Set<Clothes> clothesSet = Set.of(tshirt, trousers, underwear, shoes, socks);
		TreeSet<Clothes> clothesTS = new TreeSet<>(clothesSet);
		return clothesTS;
	}

	public static Clothes getTshirt() {
		return tshirt;
	}

	public static Clothes getTrousers() {
		return trousers;
	}

	public static Clothes getUnderwear() {
		return underwear;
	}

	public static Clothes getShoes() {
		return shoes;
	}

	public static Clothes getSocks() {
		return socks;
	}
}
