package checkOutSystem.ifMethods;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.TreeMap;

import checkOutSystem.MainMenuOptionsMethod;
import checkOutSystem.choiceSwitchMethods.OtherChoiceSwitchMethod;
import checkOutSystem.items.Item;
import checkOutSystem.items.Other;
import checkOutSystem.listCreators.OtherListCreator;
import checkOutSystem.mapScannerComparatorPaymentmethods.IncrementorDecrementorMethods;
import checkOutSystem.mapScannerComparatorPaymentmethods.PriceCalcAndPayment;
import checkOutSystem.mapScannerComparatorPaymentmethods.ScannerClass;

public class OtherIfMethods {

	public static void flowersWhileIfLoop(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		try {
		int addRemoveOrReturnFlowers = ScannerClass.scanner.nextInt();
		Other otherChoiceFlowers = OtherListCreator.getFlowers();
		while (addRemoveOrReturnFlowers == 1) {
			IncrementorDecrementorMethods.otherIncrementationOfItemToList(shoppingList, otherChoiceFlowers);
			out.println(
					"Flowers added to Basket\nEnter 1 to add another bouquet of Flowers\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnFlowers = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnFlowers == 2) {
			out.println(OtherListCreator.create());
			OtherChoiceSwitchMethod.otherChoiceSwitchMethod(shoppingList);
		} else if (addRemoveOrReturnFlowers == 3) {
			out.println(OtherListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else if (addRemoveOrReturnFlowers == 4) {
			PriceCalcAndPayment.finalPaymentMethod();
		} else if (addRemoveOrReturnFlowers == 5) {
			IncrementorDecrementorMethods.otherDerementationOfItemToList(shoppingList, otherChoiceFlowers);
			out.println(OtherListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("Invalid input, please choose a valid option");
			OtherIfMethods.flowersWhileIfLoop(shoppingList);
		}
	} catch (InputMismatchException e) {
	}
	}

	public static void petFoodWhileIfLoop(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		try {
		int addRemoveOrReturnPetFood = ScannerClass.scanner.nextInt();
		Other otherChoicePetFood = OtherListCreator.getPetFood();
		while (addRemoveOrReturnPetFood == 1) {
			IncrementorDecrementorMethods.otherIncrementationOfItemToList(shoppingList, otherChoicePetFood);
			out.println(
					"Pet Food added to Basket\nEnter 1 to add another box of PetFood\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnPetFood = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnPetFood == 2) {
			out.println(OtherListCreator.create());
			OtherChoiceSwitchMethod.otherChoiceSwitchMethod(shoppingList);
		} else if (addRemoveOrReturnPetFood == 3) {
			out.println(OtherListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else if (addRemoveOrReturnPetFood == 4) {
			PriceCalcAndPayment.finalPaymentMethod();
		} else if (addRemoveOrReturnPetFood == 5) {
			IncrementorDecrementorMethods.otherDerementationOfItemToList(shoppingList, otherChoicePetFood);
			out.println(OtherListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("Invalid input, please choose a valid option");
			OtherIfMethods.petFoodWhileIfLoop(shoppingList);
		}
	} catch (InputMismatchException e) {
	}
	}

	public static void toysWhileIfLoop(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		try {
		int addRemoveOrReturnToys = ScannerClass.scanner.nextInt();
		Other otherChoiceToys = OtherListCreator.getToys();
		while (addRemoveOrReturnToys == 1) {
			IncrementorDecrementorMethods.otherIncrementationOfItemToList(shoppingList, otherChoiceToys);
			out.println(
					"Toy added to Basket\nEnter 1 to add another Toy\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnToys = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnToys == 2) {
			out.println(OtherListCreator.create());
			OtherChoiceSwitchMethod.otherChoiceSwitchMethod(shoppingList);
		} else if (addRemoveOrReturnToys == 3) {
			out.println(OtherListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else if (addRemoveOrReturnToys == 4) {
			PriceCalcAndPayment.finalPaymentMethod();
		} else if (addRemoveOrReturnToys == 5) {
			IncrementorDecrementorMethods.otherDerementationOfItemToList(shoppingList, otherChoiceToys);
			out.println(OtherListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("Invalid input, please choose a valid option");
			OtherIfMethods.toysWhileIfLoop(shoppingList);
		}
	} catch (InputMismatchException e) {
	}
	}

	public static void cardsWhileIfLoop(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		try {
		int addRemoveOrReturnCards = ScannerClass.scanner.nextInt();
		Other otherChoiceCards = OtherListCreator.getCards();
		while (addRemoveOrReturnCards == 1) {
			IncrementorDecrementorMethods.otherIncrementationOfItemToList(shoppingList, otherChoiceCards);
			out.println(
					"Card added to Basket\nEnter 1 to add another Card\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnCards = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnCards == 2) {
			out.println(OtherListCreator.create());
			OtherChoiceSwitchMethod.otherChoiceSwitchMethod(shoppingList);
		} else if (addRemoveOrReturnCards == 3) {
			out.println(OtherListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else if (addRemoveOrReturnCards == 4) {
			PriceCalcAndPayment.finalPaymentMethod();
		} else if (addRemoveOrReturnCards == 5) {
			IncrementorDecrementorMethods.otherDerementationOfItemToList(shoppingList, otherChoiceCards);
			out.println(OtherListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("Invalid input, please choose a valid option");
			OtherIfMethods.cardsWhileIfLoop(shoppingList);
		}
	} catch (InputMismatchException e) {
	}
	}

}
