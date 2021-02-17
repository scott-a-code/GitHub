package checkOutSystem.mapScannerComparatorPaymentmethods;

import java.util.TreeMap;

import checkOutSystem.items.Clothes;
import checkOutSystem.items.Food;
import checkOutSystem.items.Furniture;
import checkOutSystem.items.Item;
import checkOutSystem.items.Medical;
import checkOutSystem.items.Other;
import checkOutSystem.items.Toiletries;

public class IncrementorDecrementorMethods {

	public static void foodIncrementationOfItemToList(TreeMap<Item, Integer> shoppingList, Item foodChoice) {
		// MapShoppingList shopList = new MapShoppingList();
		// TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		if (shoppingList.containsKey(foodChoice) == false) {
			shoppingList.put(foodChoice, 1);
		} else {
			int numberOfItems = shoppingList.get(foodChoice).intValue();
			numberOfItems++;
			shoppingList.put(foodChoice, numberOfItems);
		}
	}

	public static void foodDerementationOfItemToList(TreeMap<Item, Integer> shoppingList, Food foodChoice) {
		if (shoppingList.containsKey(foodChoice) == true) {
			int numberOfItems = shoppingList.get(foodChoice).intValue();
			numberOfItems--;
			shoppingList.put(foodChoice, numberOfItems);
			System.out.println("Item removed from basket");
		} else {
			System.out.println("This item is not in the basket");
		}
	}

	public static void clothesIncrementationOfItemToList(TreeMap<Item, Integer> shoppingList, Clothes clothesChoice) {
		if (shoppingList.containsKey(clothesChoice) == false) {
			shoppingList.put(clothesChoice, 1);
		} else {
			int numberOfItems = shoppingList.get(clothesChoice).intValue();
			numberOfItems++;
			shoppingList.put(clothesChoice, numberOfItems);
		}
	}

	public static void clothesDerementationOfItemToList(TreeMap<Item, Integer> shoppingList, Clothes clothesChoice) {
		if (shoppingList.containsKey(clothesChoice) == true) {
			int numberOfItems = shoppingList.get(clothesChoice).intValue();
			numberOfItems--;
			shoppingList.put(clothesChoice, numberOfItems);
			System.out.println("Item removed from basket");
		} else {
			System.out.println("This item is not in the basket");
		}
	}

	public static void toiletriesIncrementationOfItemToList(TreeMap<Item, Integer> shoppingList,
			Toiletries toiletriesChoice) {
		if (shoppingList.containsKey(toiletriesChoice) == false) {
			shoppingList.put(toiletriesChoice, 1);
		} else {
			int numberOfItems = shoppingList.get(toiletriesChoice).intValue();
			numberOfItems++;
			shoppingList.put(toiletriesChoice, numberOfItems);
		}
	}

	public static void toiletriesDerementationOfItemToList(TreeMap<Item, Integer> shoppingList,
			Toiletries toiletriesChoice) {
		if (shoppingList.containsKey(toiletriesChoice) == true) {
			int numberOfItems = shoppingList.get(toiletriesChoice).intValue();
			numberOfItems--;
			shoppingList.put(toiletriesChoice, numberOfItems);
			System.out.println("Item removed from basket");
		} else {
			System.out.println("This item is not in the basket");
		}
	}

	public static void medicalIncrementationOfItemToList(TreeMap<Item, Integer> shoppingList, Medical medicalChoice) {
		if (shoppingList.containsKey(medicalChoice) == false) {
			shoppingList.put(medicalChoice, 1);
		} else {
			int numberOfItems = shoppingList.get(medicalChoice).intValue();
			numberOfItems++;
			shoppingList.put(medicalChoice, numberOfItems);
		}
	}

	public static void medicalDerementationOfItemToList(TreeMap<Item, Integer> shoppingList, Medical medicalChoice) {
		if (shoppingList.containsKey(medicalChoice) == true) {
			int numberOfItems = shoppingList.get(medicalChoice).intValue();
			numberOfItems--;
			shoppingList.put(medicalChoice, numberOfItems);
			System.out.println("Item removed from basket");
		} else {
			System.out.println("This item is not in the basket");
		}
	}

	public static void furnitureIncrementationOfItemToList(TreeMap<Item, Integer> shoppingList,
			Furniture furnitureChoice) {
		if (shoppingList.containsKey(furnitureChoice) == false) {
			shoppingList.put(furnitureChoice, 1);
		} else {
			int numberOfItems = shoppingList.get(furnitureChoice).intValue();
			numberOfItems++;
			shoppingList.put(furnitureChoice, numberOfItems);
		}
	}

	public static void furnitureDerementationOfItemToList(TreeMap<Item, Integer> shoppingList,
			Furniture furnitureChoice) {
		if (shoppingList.containsKey(furnitureChoice) == true) {
			int numberOfItems = shoppingList.get(furnitureChoice).intValue();
			numberOfItems--;
			shoppingList.put(furnitureChoice, numberOfItems);
			System.out.println("Item removed from basket");
		} else {
			System.out.println("This item is not in the basket");
		}
	}

	public static void otherIncrementationOfItemToList(TreeMap<Item, Integer> shoppingList, Other otherChoice) {
		if (shoppingList.containsKey(otherChoice) == false) {
			shoppingList.put(otherChoice, 1);
		} else {
			int numberOfItems = shoppingList.get(otherChoice).intValue();
			numberOfItems++;
			shoppingList.put(otherChoice, numberOfItems);
		}
	}

	public static void otherDerementationOfItemToList(TreeMap<Item, Integer> shoppingList, Other otherChoice) {
		if (shoppingList.containsKey(otherChoice) == true) {
			int numberOfItems = shoppingList.get(otherChoice).intValue();
			numberOfItems--;
			shoppingList.put(otherChoice, numberOfItems);
			System.out.println("Item removed from basket");
		} else {
			System.out.println("This item is not in the basket");
		}
	}
}
