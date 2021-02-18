package checkOutSystem.choiceSwitchMethods;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.TreeMap;

import checkOutSystem.ifMethods.OtherIfMethods;
import checkOutSystem.items.Item;
import checkOutSystem.items.Other;
import checkOutSystem.listCreators.OtherListCreator;
import checkOutSystem.mapScannerComparatorPaymentmethods.IncrementorDecrementorMethods;
import checkOutSystem.mapScannerComparatorPaymentmethods.ScannerClass;

public class OtherChoiceSwitchMethod {

	public static void otherChoiceSwitchMethod(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		try {
		int specificItemChoice = ScannerClass.scanner.nextInt();
		switch (specificItemChoice) {
		case 601:
			Other otherChoiceFlowers = OtherListCreator.getFlowers();
			IncrementorDecrementorMethods.otherIncrementationOfItemToList(shoppingList, otherChoiceFlowers);
			out.println(
					"Flowers added to Basket\nEnter 1 to add another bouquet of Flowers\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			OtherIfMethods.flowersWhileIfLoop(shoppingList);
			break;
		case 602:
			Other otherChoicePetFood = OtherListCreator.getPetFood();
			IncrementorDecrementorMethods.otherIncrementationOfItemToList(shoppingList, otherChoicePetFood);
			out.println(
					"Pet Food added to Basket\nEnter 1 to add another box of PetFood\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			OtherIfMethods.petFoodWhileIfLoop(shoppingList);
		case 603:
			Other otherChoiceToy = OtherListCreator.getToys();
			IncrementorDecrementorMethods.otherIncrementationOfItemToList(shoppingList, otherChoiceToy);
			out.println(
					"Toy added to Basket\nEnter 1 to add another Toy\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			OtherIfMethods.toysWhileIfLoop(shoppingList);
		case 604:
			Other otherChoiceCard = OtherListCreator.getCards();
			IncrementorDecrementorMethods.otherIncrementationOfItemToList(shoppingList, otherChoiceCard);
			out.println(
					"Card added to Basket\nEnter 1 to add another Card\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			OtherIfMethods.cardsWhileIfLoop(shoppingList);
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
				OtherChoiceSwitchMethod.otherChoiceSwitchMethod(shoppingList);
			}
			break;
		}
	} catch (InputMismatchException e) {
	}
}

	// overloaded method
	public static void otherChoiceSwitchMethod(TreeMap<Item, Integer> shoppingList, int choice1)
			throws InterruptedException {
		try {
		switch (choice1) {
		case 601:
			Other otherChoiceFlowers = OtherListCreator.getFlowers();
			IncrementorDecrementorMethods.otherIncrementationOfItemToList(shoppingList, otherChoiceFlowers);
			out.println(
					"Flowers added to Basket\nEnter 1 to add another bouquet of Flowers\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			OtherIfMethods.flowersWhileIfLoop(shoppingList);
			break;
		case 602:
			Other otherChoicePetFood = OtherListCreator.getPetFood();
			IncrementorDecrementorMethods.otherIncrementationOfItemToList(shoppingList, otherChoicePetFood);
			out.println(
					"Pet Food added to Basket\nEnter 1 to add another box of PetFood\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			OtherIfMethods.petFoodWhileIfLoop(shoppingList);
		case 603:
			Other otherChoiceToy = OtherListCreator.getToys();
			IncrementorDecrementorMethods.otherIncrementationOfItemToList(shoppingList, otherChoiceToy);
			out.println(
					"Toy added to Basket\nEnter 1 to add another Toy\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			OtherIfMethods.toysWhileIfLoop(shoppingList);
		case 604:
			Other otherChoiceCard = OtherListCreator.getCards();
			IncrementorDecrementorMethods.otherIncrementationOfItemToList(shoppingList, otherChoiceCard);
			out.println(
					"Card added to Basket\nEnter 1 to add another Card\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			OtherIfMethods.cardsWhileIfLoop(shoppingList);
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
				OtherChoiceSwitchMethod.otherChoiceSwitchMethod(shoppingList, choice1);
			}
			break;
		}
	} catch (InputMismatchException e) {
	}
	}
}
