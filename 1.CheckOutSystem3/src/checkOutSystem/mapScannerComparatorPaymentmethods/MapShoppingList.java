package checkOutSystem.mapScannerComparatorPaymentmethods;

import java.util.TreeMap;

import checkOutSystem.items.Item;

public class MapShoppingList {

	private TreeMap<Item, Integer> shoppingList = new TreeMap<>();

	public TreeMap<Item, Integer> getShoppingList() {
		return shoppingList;
	}

}
