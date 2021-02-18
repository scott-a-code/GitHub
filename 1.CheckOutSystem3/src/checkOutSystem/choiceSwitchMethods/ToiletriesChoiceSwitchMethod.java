package checkOutSystem.choiceSwitchMethods;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.TreeMap;

import checkOutSystem.ifMethods.ToiletriesIfMethods;
import checkOutSystem.items.Item;
import checkOutSystem.items.Toiletries;
import checkOutSystem.listCreators.ToiletriesListCreator;
import checkOutSystem.mapScannerComparatorPaymentmethods.IncrementorDecrementorMethods;
import checkOutSystem.mapScannerComparatorPaymentmethods.ScannerClass;

public class ToiletriesChoiceSwitchMethod {

	public static void toiletriesChoiceSwitchMethod(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		try {
		int specificItemChoice = ScannerClass.scanner.nextInt();
		switch (specificItemChoice) {
		case 301:
			Toiletries toiletriesChoiceToothpaste = ToiletriesListCreator.getToothpaste();
			IncrementorDecrementorMethods.toiletriesIncrementationOfItemToList(shoppingList,
					toiletriesChoiceToothpaste);
			out.println(
					"Toothpaste added to Basket\nEnter 1 to add another Toothpaste\nEnter 2 to return to Toiletries list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			ToiletriesIfMethods.toothpasteWhileIfLoop(shoppingList);
			break;
		case 302:
			Toiletries toiletriesChoiceSoap = ToiletriesListCreator.getSoap();
			IncrementorDecrementorMethods.toiletriesIncrementationOfItemToList(shoppingList, toiletriesChoiceSoap);
			out.println(
					"Soap added to Basket\nEnter 1 to add another pair of Soap\nEnter 2 to return to Toiletries list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			ToiletriesIfMethods.soapWhileIfLoop(shoppingList);
		case 303:
			Toiletries toiletriesChoiceToiletpaper = ToiletriesListCreator.getToiletpaper();
			IncrementorDecrementorMethods.toiletriesIncrementationOfItemToList(shoppingList,
					toiletriesChoiceToiletpaper);
			out.println(
					"Toiletpaper added to Basket\nEnter 1 to add another Toiletpaper\nEnter 2 to return to Toiletries list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			ToiletriesIfMethods.toiletpaperWhileIfLoop(shoppingList);
		case 304:
			Toiletries toiletriesChoiceDeodorant = ToiletriesListCreator.getDeodorant();
			IncrementorDecrementorMethods.toiletriesIncrementationOfItemToList(shoppingList, toiletriesChoiceDeodorant);
			out.println(
					"Deodorant added to Basket\nEnter 1 to add another Deodorant\nEnter 2 to return to Toiletries list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			ToiletriesIfMethods.deodorantWhileIfLoop(shoppingList);
		default:
			out.println(
					"You have not selected an valid option, please select an option from the list or enter '0' to exit.");
			int choice1 = ScannerClass.scanner.nextInt();
			switch (choice1) {
			case 0:
				out.println("Thank you, please shop with us again.");
				System.exit(1);
				break;
			default:
				ToiletriesChoiceSwitchMethod.toiletriesChoiceSwitchMethod(shoppingList, choice1);
			}
			break;
		}
	} catch (InputMismatchException e) {
	}
}

	// overloaded method
	public static void toiletriesChoiceSwitchMethod(TreeMap<Item, Integer> shoppingList, int choice1)
			throws InterruptedException {
		try {
		switch (choice1) {
		case 301:
			Toiletries toiletriesChoiceToothpaste = ToiletriesListCreator.getToothpaste();
			IncrementorDecrementorMethods.toiletriesIncrementationOfItemToList(shoppingList,
					toiletriesChoiceToothpaste);
			out.println(
					"Toothpaste added to Basket\nEnter 1 to add another Toothpaste\nEnter 2 to return to Toiletries list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			ToiletriesIfMethods.toothpasteWhileIfLoop(shoppingList);
			break;
		case 302:
			Toiletries toiletriesChoiceSoap = ToiletriesListCreator.getSoap();
			IncrementorDecrementorMethods.toiletriesIncrementationOfItemToList(shoppingList, toiletriesChoiceSoap);
			out.println(
					"Soap added to Basket\nEnter 1 to add another pair of Soap\nEnter 2 to return to Toiletries list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			ToiletriesIfMethods.soapWhileIfLoop(shoppingList);
		case 303:
			Toiletries toiletriesChoiceToiletpaper = ToiletriesListCreator.getToiletpaper();
			IncrementorDecrementorMethods.toiletriesIncrementationOfItemToList(shoppingList,
					toiletriesChoiceToiletpaper);
			out.println(
					"Toiletpaper added to Basket\nEnter 1 to add another Toiletpaper\nEnter 2 to return to Toiletries list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			ToiletriesIfMethods.toiletpaperWhileIfLoop(shoppingList);
		case 304:
			Toiletries toiletriesChoiceDeodorant = ToiletriesListCreator.getDeodorant();
			IncrementorDecrementorMethods.toiletriesIncrementationOfItemToList(shoppingList, toiletriesChoiceDeodorant);
			out.println(
					"Deodorant added to Basket\nEnter 1 to add another Deodorant\nEnter 2 to return to Toiletries list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			ToiletriesIfMethods.deodorantWhileIfLoop(shoppingList);
		default:
			out.println(
					"You have not selected an valid option, please select an option from the list or enter '0' to exit.");
			choice1 = ScannerClass.scanner.nextInt();
			switch (choice1) {
			case 0:
				out.println("Thank you, please shop with us again.");
				System.exit(1);
				break;
			default:
				ToiletriesChoiceSwitchMethod.toiletriesChoiceSwitchMethod(shoppingList, choice1);
			}
			break;
		}
	} catch (InputMismatchException e) {
	}
	}
}