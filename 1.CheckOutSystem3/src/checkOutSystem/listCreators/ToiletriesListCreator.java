package checkOutSystem.listCreators;

import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

import checkOutSystem.items.Toiletries;

public class ToiletriesListCreator {

	static Toiletries toothpaste = new Toiletries(301, "Toothpaste", BigDecimal.valueOf(4.49));
	static Toiletries soap = new Toiletries(302, "Soap", BigDecimal.valueOf(3.99));
	static Toiletries toiletpaper = new Toiletries(303, "Toiletpaper", BigDecimal.valueOf(3.99));
	static Toiletries deodorant = new Toiletries(304, "Deodorant", BigDecimal.valueOf(3.49));
	Set<Toiletries> toiletriesSet = Set.of(toothpaste, soap, toiletpaper, deodorant);
	TreeSet<Toiletries> toiletriesTS = new TreeSet<>(toiletriesSet);

	public static TreeSet<Toiletries> create() {
		Set<Toiletries> toiletriesSet = Set.of(toothpaste, soap, toiletpaper, deodorant);
		TreeSet<Toiletries> toiletriesTS = new TreeSet<>(toiletriesSet);
		return toiletriesTS;
	}

	public static Toiletries getToothpaste() {
		return toothpaste;
	}

	public static Toiletries getSoap() {
		return soap;
	}

	public static Toiletries getToiletpaper() {
		return toiletpaper;
	}

	public static Toiletries getDeodorant() {
		return deodorant;
	}
}
