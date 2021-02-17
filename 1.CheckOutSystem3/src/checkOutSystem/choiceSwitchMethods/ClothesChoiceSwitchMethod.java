package checkOutSystem.choiceSwitchMethods;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.TreeMap;

import checkOutSystem.ifMethods.ClothesIfMethods;
import checkOutSystem.items.Clothes;
import checkOutSystem.items.Item;
import checkOutSystem.listCreators.ClothesListCreator;
import checkOutSystem.mapScannerComparatorPaymentmethods.IncrementorDecrementorMethods;
import checkOutSystem.mapScannerComparatorPaymentmethods.MapShoppingList;
import checkOutSystem.mapScannerComparatorPaymentmethods.ScannerClass;

public class ClothesChoiceSwitchMethod {

	public static void clothesChoiceSwitchMethod() throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		try {
		int specificItemChoice = ScannerClass.scanner.nextInt();
		switch (specificItemChoice) {
		case 201:
			Clothes clothesChoiceTshirt = ClothesListCreator.getTshirt();
			IncrementorDecrementorMethods.clothesIncrementationOfItemToList(shoppingList, clothesChoiceTshirt);
			out.println(
					"T-shirt added to Basket\nEnter 1 to add another T-shirt\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			ClothesIfMethods.tshirtWhileIfLoop();
			break;
		case 202:
			Clothes clothesChoiceTrousers = ClothesListCreator.getTrousers();
			IncrementorDecrementorMethods.clothesIncrementationOfItemToList(shoppingList, clothesChoiceTrousers);
			out.println(
					"Trousers added to Basket\nEnter 1 to add another pair of Trousers\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			ClothesIfMethods.trousersWhileIfLoop();
		case 203:
			Clothes clothesChoiceUnderwear = ClothesListCreator.getUnderwear();
			IncrementorDecrementorMethods.clothesIncrementationOfItemToList(shoppingList, clothesChoiceUnderwear);
			out.println(
					"Underwear added to Basket\nEnter 1 to add another pair of underwear\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			ClothesIfMethods.underwearWhileIfLoop();
		case 204:
			Clothes clothesChoiceShoes = ClothesListCreator.getShoes();
			IncrementorDecrementorMethods.clothesIncrementationOfItemToList(shoppingList, clothesChoiceShoes);
			out.println(
					"Shoes added to Basket\nEnter 1 to add another pair of Shoes\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			ClothesIfMethods.shoesWhileIfLoop();
		case 205:
			Clothes clothesChoiceSocks = ClothesListCreator.getSocks();
			IncrementorDecrementorMethods.clothesIncrementationOfItemToList(shoppingList, clothesChoiceSocks);
			out.println(
					"Socks added to Basket\nEnter 1 to add another pair of Scoks\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			ClothesIfMethods.socksWhileIfLoop();
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
				ClothesChoiceSwitchMethod.clothesChoiceSwitchMethod();
			}
			break;
		}
	} catch (InputMismatchException e) {
	}
}

	// overloaded method
	public static void clothesChoiceSwitchMethod(int choice1) throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		try {
		switch (choice1) {
		case 201:
			Clothes clothesChoiceTshirt = ClothesListCreator.getTshirt();
			IncrementorDecrementorMethods.clothesIncrementationOfItemToList(shoppingList, clothesChoiceTshirt);
			out.println(
					"T-shirt added to Basket\nEnter 1 to add another T-shirt\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			ClothesIfMethods.tshirtWhileIfLoop();
			break;
		case 202:
			Clothes clothesChoiceTrousers = ClothesListCreator.getTrousers();
			IncrementorDecrementorMethods.clothesIncrementationOfItemToList(shoppingList, clothesChoiceTrousers);
			out.println(
					"Trousers added to Basket\nEnter 1 to add another pair of Trousers\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			ClothesIfMethods.trousersWhileIfLoop();
		case 203:
			Clothes clothesChoiceUnderwear = ClothesListCreator.getUnderwear();
			IncrementorDecrementorMethods.clothesIncrementationOfItemToList(shoppingList, clothesChoiceUnderwear);
			out.println(
					"Underwear added to Basket\nEnter 1 to add another pair of underwear\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			ClothesIfMethods.underwearWhileIfLoop();
		case 204:
			Clothes clothesChoiceShoes = ClothesListCreator.getShoes();
			IncrementorDecrementorMethods.clothesIncrementationOfItemToList(shoppingList, clothesChoiceShoes);
			out.println(
					"Shoes added to Basket\nEnter 1 to add another pair of Shoes\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			ClothesIfMethods.shoesWhileIfLoop();
		case 205:
			Clothes clothesChoiceSocks = ClothesListCreator.getSocks();
			IncrementorDecrementorMethods.clothesIncrementationOfItemToList(shoppingList, clothesChoiceSocks);
			out.println(
					"Socks added to Basket\nEnter 1 to add another pair of Scoks\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			ClothesIfMethods.socksWhileIfLoop();
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
				ClothesChoiceSwitchMethod.clothesChoiceSwitchMethod(choice1);
			}
			break;
		}
	} catch (InputMismatchException e) {
	}
	}
}
