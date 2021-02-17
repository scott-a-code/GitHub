package checkOutSystem.ifMethods;

import static java.lang.System.out;

import java.util.TreeMap;

import checkOutSystem.MainMenuOptionsMethod;
import checkOutSystem.choiceSwitchMethods.ToiletriesChoiceSwitchMethod;
import checkOutSystem.items.Item;
import checkOutSystem.items.Toiletries;
import checkOutSystem.listCreators.ToiletriesListCreator;
import checkOutSystem.mapScannerComparatorPaymentmethods.IncrementorDecrementorMethods;
import checkOutSystem.mapScannerComparatorPaymentmethods.MapShoppingList;
import checkOutSystem.mapScannerComparatorPaymentmethods.PriceCalcAndPayment;
import checkOutSystem.mapScannerComparatorPaymentmethods.ScannerClass;

public class ToiletriesIfMethods {

	public static void toothpasteWhileIfLoop() throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		int addRemoveOrReturnToothPaste = ScannerClass.scanner.nextInt();
		Toiletries toiletriesChoiceToothPaste = ToiletriesListCreator.getToothpaste();
		while (addRemoveOrReturnToothPaste == 1) {
			IncrementorDecrementorMethods.toiletriesIncrementationOfItemToList(shoppingList,
					toiletriesChoiceToothPaste);
			out.println(
					"ToothPaste added to Basket\nEnter 1 to add another ToothPaste\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnToothPaste = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnToothPaste == 2) {
			out.println(ToiletriesListCreator.create());
			ToiletriesChoiceSwitchMethod.toiletriesChoiceSwitchMethod();
		} else if (addRemoveOrReturnToothPaste == 3) {
			out.println(ToiletriesListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else if (addRemoveOrReturnToothPaste == 4) {
			PriceCalcAndPayment.finalPaymentMethod();
		} else if (addRemoveOrReturnToothPaste == 5) {
			IncrementorDecrementorMethods.toiletriesDerementationOfItemToList(shoppingList, toiletriesChoiceToothPaste);
			out.println(ToiletriesListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("Invalid input, please choose a valid option");
			ToiletriesIfMethods.toothpasteWhileIfLoop();
		}
	}

	public static void soapWhileIfLoop() throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		int addRemoveOrReturnSoap = ScannerClass.scanner.nextInt();
		Toiletries toiletriesChoiceSoap = ToiletriesListCreator.getSoap();
		while (addRemoveOrReturnSoap == 1) {
			IncrementorDecrementorMethods.toiletriesIncrementationOfItemToList(shoppingList, toiletriesChoiceSoap);
			out.println(
					"Soap added to Basket\nEnter 1 to add another Soap\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnSoap = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnSoap == 2) {
			out.println(ToiletriesListCreator.create());
			ToiletriesChoiceSwitchMethod.toiletriesChoiceSwitchMethod();
		} else if (addRemoveOrReturnSoap == 3) {
			out.println(ToiletriesListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else if (addRemoveOrReturnSoap == 4) {
			PriceCalcAndPayment.finalPaymentMethod();
		} else if (addRemoveOrReturnSoap == 5) {
			IncrementorDecrementorMethods.toiletriesDerementationOfItemToList(shoppingList, toiletriesChoiceSoap);
			out.println(ToiletriesListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("Invalid input, please choose a valid option");
			ToiletriesIfMethods.soapWhileIfLoop();
		}
	}

	public static void toiletpaperWhileIfLoop() throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		int addRemoveOrReturnToiletpaper = ScannerClass.scanner.nextInt();
		Toiletries toiletriesChoiceToiletpaper = ToiletriesListCreator.getToiletpaper();
		while (addRemoveOrReturnToiletpaper == 1) {
			IncrementorDecrementorMethods.toiletriesIncrementationOfItemToList(shoppingList,
					toiletriesChoiceToiletpaper);
			out.println(
					"Toiletpaper added to Basket\nEnter 1 to add another Toiletpaper\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnToiletpaper = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnToiletpaper == 2) {
			out.println(ToiletriesListCreator.create());
			ToiletriesChoiceSwitchMethod.toiletriesChoiceSwitchMethod();
		} else if (addRemoveOrReturnToiletpaper == 3) {
			out.println(ToiletriesListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else if (addRemoveOrReturnToiletpaper == 4) {
			PriceCalcAndPayment.finalPaymentMethod();
		} else if (addRemoveOrReturnToiletpaper == 5) {
			IncrementorDecrementorMethods.toiletriesDerementationOfItemToList(shoppingList,
					toiletriesChoiceToiletpaper);
			out.println(ToiletriesListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("Invalid input, please choose a valid option");
			ToiletriesIfMethods.toiletpaperWhileIfLoop();
		}
	}

	public static void deodorantWhileIfLoop() throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		int addRemoveOrReturnDeodorant = ScannerClass.scanner.nextInt();
		Toiletries toiletriesChoiceDeodorant = ToiletriesListCreator.getDeodorant();
		while (addRemoveOrReturnDeodorant == 1) {
			IncrementorDecrementorMethods.toiletriesIncrementationOfItemToList(shoppingList, toiletriesChoiceDeodorant);
			out.println(
					"Shoes added to Basket\nEnter 1 to add another pair of Shoes\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnDeodorant = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnDeodorant == 2) {
			out.println(ToiletriesListCreator.create());
			ToiletriesChoiceSwitchMethod.toiletriesChoiceSwitchMethod();
		} else if (addRemoveOrReturnDeodorant == 3) {
			out.println(ToiletriesListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else if (addRemoveOrReturnDeodorant == 4) {
			PriceCalcAndPayment.finalPaymentMethod();
		} else if (addRemoveOrReturnDeodorant == 5) {
			IncrementorDecrementorMethods.toiletriesDerementationOfItemToList(shoppingList, toiletriesChoiceDeodorant);
			out.println(ToiletriesListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("Invalid input, please choose a valid option");
			ToiletriesIfMethods.deodorantWhileIfLoop();
		}
	}

}
