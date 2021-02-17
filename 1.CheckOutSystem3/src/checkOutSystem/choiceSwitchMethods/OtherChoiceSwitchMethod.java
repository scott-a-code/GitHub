package checkOutSystem.choiceSwitchMethods;

import static java.lang.System.out;

import java.util.TreeMap;

import checkOutSystem.ifMethods.OtherIfMethods;
import checkOutSystem.items.Item;
import checkOutSystem.items.Other;
import checkOutSystem.listCreators.OtherListCreator;
import checkOutSystem.mapScannerComparatorPaymentmethods.IncrementorDecrementorMethods;
import checkOutSystem.mapScannerComparatorPaymentmethods.MapShoppingList;
import checkOutSystem.mapScannerComparatorPaymentmethods.ScannerClass;

public class OtherChoiceSwitchMethod {

	public static void otherChoiceSwitchMethod() throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		int specificItemChoice = ScannerClass.scanner.nextInt();
		switch (specificItemChoice) {
		case 601:
			Other otherChoiceFlowers = OtherListCreator.getFlowers();
			IncrementorDecrementorMethods.otherIncrementationOfItemToList(shoppingList, otherChoiceFlowers);
			out.println(
					"Flowers added to Basket\nEnter 1 to add another bouquet of Flowers\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			OtherIfMethods.flowersWhileIfLoop();
			break;
		case 602:
			Other otherChoicePetFood = OtherListCreator.getPetFood();
			IncrementorDecrementorMethods.otherIncrementationOfItemToList(shoppingList, otherChoicePetFood);
			out.println(
					"Pet Food added to Basket\nEnter 1 to add another box of PetFood\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			OtherIfMethods.petFoodWhileIfLoop();
		case 603:
			Other otherChoiceToy = OtherListCreator.getToys();
			IncrementorDecrementorMethods.otherIncrementationOfItemToList(shoppingList, otherChoiceToy);
			out.println(
					"Toy added to Basket\nEnter 1 to add another Toy\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			OtherIfMethods.toysWhileIfLoop();
		case 604:
			Other otherChoiceCard = OtherListCreator.getCards();
			IncrementorDecrementorMethods.otherIncrementationOfItemToList(shoppingList, otherChoiceCard);
			out.println(
					"Card added to Basket\nEnter 1 to add another Card\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			OtherIfMethods.cardsWhileIfLoop();
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
				OtherChoiceSwitchMethod.otherChoiceSwitchMethod();
			}
			break;
		}
	}

	// overloaded method
	public static void otherChoiceSwitchMethod(int choice1) throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		switch (choice1) {
		case 601:
			Other otherChoiceFlowers = OtherListCreator.getFlowers();
			IncrementorDecrementorMethods.otherIncrementationOfItemToList(shoppingList, otherChoiceFlowers);
			out.println(
					"Flowers added to Basket\nEnter 1 to add another bouquet of Flowers\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			OtherIfMethods.flowersWhileIfLoop();
			break;
		case 602:
			Other otherChoicePetFood = OtherListCreator.getPetFood();
			IncrementorDecrementorMethods.otherIncrementationOfItemToList(shoppingList, otherChoicePetFood);
			out.println(
					"Pet Food added to Basket\nEnter 1 to add another box of PetFood\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			OtherIfMethods.petFoodWhileIfLoop();
		case 603:
			Other otherChoiceToy = OtherListCreator.getToys();
			IncrementorDecrementorMethods.otherIncrementationOfItemToList(shoppingList, otherChoiceToy);
			out.println(
					"Toy added to Basket\nEnter 1 to add another Toy\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			OtherIfMethods.toysWhileIfLoop();
		case 604:
			Other otherChoiceCard = OtherListCreator.getCards();
			IncrementorDecrementorMethods.otherIncrementationOfItemToList(shoppingList, otherChoiceCard);
			out.println(
					"Card added to Basket\nEnter 1 to add another Card\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			OtherIfMethods.cardsWhileIfLoop();
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
				OtherChoiceSwitchMethod.otherChoiceSwitchMethod(choice1);
			}
			break;
		}
	}
}
