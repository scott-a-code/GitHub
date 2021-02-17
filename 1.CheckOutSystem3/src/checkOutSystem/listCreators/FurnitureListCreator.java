package checkOutSystem.listCreators;

import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

import checkOutSystem.items.Furniture;

public class FurnitureListCreator {

	static Furniture couch = new Furniture(501, "Couch", BigDecimal.valueOf(150.99), "Essential Home");
	static Furniture table = new Furniture(502, "Table", BigDecimal.valueOf(75.00), "Brabbu");
	static Furniture kitchen = new Furniture(503, "Kitchen", BigDecimal.valueOf(1349.99), "Zeyko");
	static Furniture lamps = new Furniture(504, "Lamp", BigDecimal.valueOf(81.99), "DelightFULL");

	public static TreeSet<Furniture> create() {
		Set<Furniture> furnitureSet = Set.of(couch, table, kitchen, lamps);
		TreeSet<Furniture> furnitureTS = new TreeSet<>(furnitureSet);
		return furnitureTS;
	}

	public static Furniture getCouch() {
		return couch;
	}

	public static Furniture getTable() {
		return table;
	}

	public static Furniture getKitchen() {
		return kitchen;
	}

	public static Furniture getLamp() {
		return lamps;
	}

}
