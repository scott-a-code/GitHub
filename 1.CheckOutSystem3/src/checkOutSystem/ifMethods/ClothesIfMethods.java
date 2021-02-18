package checkOutSystem.ifMethods;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.TreeMap;

import checkOutSystem.MainMenuOptionsMethod;
import checkOutSystem.choiceSwitchMethods.ClothesChoiceSwitchMethod;
import checkOutSystem.items.Clothes;
import checkOutSystem.items.Item;
import checkOutSystem.listCreators.ClothesListCreator;
import checkOutSystem.mapScannerComparatorPaymentmethods.IncrementorDecrementorMethods;
import checkOutSystem.mapScannerComparatorPaymentmethods.PriceCalcAndPayment;
import checkOutSystem.mapScannerComparatorPaymentmethods.ScannerClass;

public class ClothesIfMethods {

	public static void tshirtWhileIfLoop(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		try {
		int addRemoveOrReturnTshirt = ScannerClass.scanner.nextInt();
		Clothes clothesChoiceTshirt = ClothesListCreator.getTshirt();
		while (addRemoveOrReturnTshirt == 1) {
			IncrementorDecrementorMethods.clothesIncrementationOfItemToList(shoppingList, clothesChoiceTshirt);
			out.println(
					"Tshirt added to Basket\nEnter 1 to add another Tshirt\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnTshirt = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnTshirt == 2) {
			out.println(ClothesListCreator.create());
			ClothesChoiceSwitchMethod.clothesChoiceSwitchMethod(shoppingList);
		} else if (addRemoveOrReturnTshirt == 3) {
			out.println(ClothesListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else if (addRemoveOrReturnTshirt == 4) {
			PriceCalcAndPayment.finalPaymentMethod(shoppingList);
		} else if (addRemoveOrReturnTshirt == 5) {
			IncrementorDecrementorMethods.clothesDerementationOfItemToList(shoppingList, clothesChoiceTshirt);
			out.println(ClothesListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			ClothesIfMethods.tshirtWhileIfLoop(shoppingList);
		}
	} catch (InputMismatchException e) {
	}
	}

	public static void trousersWhileIfLoop(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		try {
		int addRemoveOrReturnTrousers = ScannerClass.scanner.nextInt();
		Clothes clothesChoiceTrousers = ClothesListCreator.getTrousers();
		while (addRemoveOrReturnTrousers == 1) {
			IncrementorDecrementorMethods.clothesIncrementationOfItemToList(shoppingList, clothesChoiceTrousers);
			out.println(
					"Trousers added to Basket\nEnter 1 to add another pair of Trousers\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnTrousers = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnTrousers == 2) {
			out.println(ClothesListCreator.create());
			ClothesChoiceSwitchMethod.clothesChoiceSwitchMethod(shoppingList);
		} else if (addRemoveOrReturnTrousers == 3) {
			out.println(ClothesListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else if (addRemoveOrReturnTrousers == 4) {
			PriceCalcAndPayment.finalPaymentMethod(shoppingList);
		} else if (addRemoveOrReturnTrousers == 5) {
			IncrementorDecrementorMethods.clothesDerementationOfItemToList(shoppingList, clothesChoiceTrousers);
			out.println(ClothesListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			ClothesIfMethods.trousersWhileIfLoop(shoppingList);
		}
	} catch (InputMismatchException e) {
	}
	}

	public static void underwearWhileIfLoop(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		try {
		int addRemoveOrReturnUnderwear = ScannerClass.scanner.nextInt();
		Clothes clothesChoiceUnderwear = ClothesListCreator.getUnderwear();
		while (addRemoveOrReturnUnderwear == 1) {
			IncrementorDecrementorMethods.clothesIncrementationOfItemToList(shoppingList, clothesChoiceUnderwear);
			out.println(
					"Underwear added to Basket\nEnter 1 to add another pair of Underwear\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnUnderwear = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnUnderwear == 2) {
			out.println(ClothesListCreator.create());
			ClothesChoiceSwitchMethod.clothesChoiceSwitchMethod(shoppingList);
		} else if (addRemoveOrReturnUnderwear == 3) {
			out.println(ClothesListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else if (addRemoveOrReturnUnderwear == 4) {
			PriceCalcAndPayment.finalPaymentMethod(shoppingList);
		} else if (addRemoveOrReturnUnderwear == 5) {
			IncrementorDecrementorMethods.clothesDerementationOfItemToList(shoppingList, clothesChoiceUnderwear);
			out.println(ClothesListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			ClothesIfMethods.underwearWhileIfLoop(shoppingList);
		}
	} catch (InputMismatchException e) {
	}
	}

	public static void shoesWhileIfLoop(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		try {
		int addRemoveOrReturnShoes = ScannerClass.scanner.nextInt();
		Clothes clothesChoiceShoes = ClothesListCreator.getShoes();
		while (addRemoveOrReturnShoes == 1) {
			IncrementorDecrementorMethods.clothesIncrementationOfItemToList(shoppingList, clothesChoiceShoes);
			out.println(
					"Shoes added to Basket\nEnter 1 to add another pair of Shoes\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnShoes = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnShoes == 2) {
			out.println(ClothesListCreator.create());
			ClothesChoiceSwitchMethod.clothesChoiceSwitchMethod(shoppingList);
		} else if (addRemoveOrReturnShoes == 3) {
			out.println(ClothesListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else if (addRemoveOrReturnShoes == 4) {
			PriceCalcAndPayment.finalPaymentMethod(shoppingList);
		} else if (addRemoveOrReturnShoes == 5) {
			IncrementorDecrementorMethods.clothesDerementationOfItemToList(shoppingList, clothesChoiceShoes);
			out.println(ClothesListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			ClothesIfMethods.shoesWhileIfLoop(shoppingList);
		}
	} catch (InputMismatchException e) {
	}
	}

	public static void socksWhileIfLoop(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		try {
		int addRemoveOrReturnSocks = ScannerClass.scanner.nextInt();
		Clothes clothesChoiceSocks = ClothesListCreator.getSocks();
		while (addRemoveOrReturnSocks == 1) {
			IncrementorDecrementorMethods.clothesIncrementationOfItemToList(shoppingList, clothesChoiceSocks);
			out.println(
					"Socks added to Basket\nEnter 1 to add another pair of Socks\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnSocks = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnSocks == 2) {
			out.println(ClothesListCreator.create());
			ClothesChoiceSwitchMethod.clothesChoiceSwitchMethod(shoppingList);
		} else if (addRemoveOrReturnSocks == 3) {
			out.println(ClothesListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else if (addRemoveOrReturnSocks == 4) {
			PriceCalcAndPayment.finalPaymentMethod(shoppingList);
		} else if (addRemoveOrReturnSocks == 5) {
			IncrementorDecrementorMethods.clothesDerementationOfItemToList(shoppingList, clothesChoiceSocks);
			out.println(ClothesListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			ClothesIfMethods.socksWhileIfLoop(shoppingList);
		}
	} catch (InputMismatchException e) {
	}
	}
}
