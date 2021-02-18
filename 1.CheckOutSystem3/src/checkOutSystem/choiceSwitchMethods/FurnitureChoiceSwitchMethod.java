package checkOutSystem.choiceSwitchMethods;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.TreeMap;

import checkOutSystem.ifMethods.FurnitureIfMethods;
import checkOutSystem.items.Furniture;
import checkOutSystem.items.Item;
import checkOutSystem.listCreators.FurnitureListCreator;
import checkOutSystem.mapScannerComparatorPaymentmethods.IncrementorDecrementorMethods;
import checkOutSystem.mapScannerComparatorPaymentmethods.ScannerClass;

public class FurnitureChoiceSwitchMethod {

	public static void furnitureChoiceSwitchMethod(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		try {
		int specificItemChoice = ScannerClass.scanner.nextInt();
		switch (specificItemChoice) {
		case 501:
			Furniture furnitureChoiceCouch = FurnitureListCreator.getCouch();
			IncrementorDecrementorMethods.furnitureIncrementationOfItemToList(shoppingList, furnitureChoiceCouch);
			out.println(
					"Couch added to Basket\nEnter 1 to add another Couch\nEnter 2 to return to Furniture list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FurnitureIfMethods.couchWhileIfLoop(shoppingList);
			break;
		case 502:
			Furniture furnitureChoiceTable = FurnitureListCreator.getTable();
			IncrementorDecrementorMethods.furnitureIncrementationOfItemToList(shoppingList, furnitureChoiceTable);
			out.println(
					"Table added to Basket\nEnter 1 to add another Table\nEnter 2 to return to Furniture list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FurnitureIfMethods.tableWhileIfLoop(shoppingList);
		case 503:
			Furniture furnitureChoiceKitchen = FurnitureListCreator.getKitchen();
			IncrementorDecrementorMethods.furnitureIncrementationOfItemToList(shoppingList, furnitureChoiceKitchen);
			out.println(
					"Kitchen added to Basket\nEnter 1 to add another Kitchen\nEnter 2 to return to Furniture list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FurnitureIfMethods.kitchenWhileIfLoop(shoppingList);
		case 504:
			Furniture furnitureChoiceLamp = FurnitureListCreator.getLamp();
			IncrementorDecrementorMethods.furnitureIncrementationOfItemToList(shoppingList, furnitureChoiceLamp);
			out.println(
					"Lamp added to Basket\nEnter 1 to add another Lamp\nEnter 2 to return to Furniture list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FurnitureIfMethods.lampWhileIfLoop(shoppingList);
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
				FurnitureChoiceSwitchMethod.furnitureChoiceSwitchMethod(shoppingList, choice1);
			}
			break;
		}
	} catch (InputMismatchException e) {
	}
}

	// overloaded method
	public static void furnitureChoiceSwitchMethod(TreeMap<Item, Integer> shoppingList, int choice1)
			throws InterruptedException {
		try {
		switch (choice1) {
		case 501:
			Furniture furnitureChoiceCouch = FurnitureListCreator.getCouch();
			IncrementorDecrementorMethods.furnitureIncrementationOfItemToList(shoppingList, furnitureChoiceCouch);
			out.println(
					"Couch added to Basket\nEnter 1 to add another Couch\nEnter 2 to return to Furniture list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FurnitureIfMethods.couchWhileIfLoop(shoppingList);
			break;
		case 502:
			Furniture furnitureChoiceTable = FurnitureListCreator.getTable();
			IncrementorDecrementorMethods.furnitureIncrementationOfItemToList(shoppingList, furnitureChoiceTable);
			out.println(
					"Table added to Basket\nEnter 1 to add another Table\nEnter 2 to return to Furniture list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FurnitureIfMethods.tableWhileIfLoop(shoppingList);
		case 503:
			Furniture furnitureChoiceKitchen = FurnitureListCreator.getKitchen();
			IncrementorDecrementorMethods.furnitureIncrementationOfItemToList(shoppingList, furnitureChoiceKitchen);
			out.println(
					"Kitchen added to Basket\nEnter 1 to add another Kitchen\nEnter 2 to return to Furniture list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FurnitureIfMethods.kitchenWhileIfLoop(shoppingList);
		case 504:
			Furniture furnitureChoiceLamp = FurnitureListCreator.getLamp();
			IncrementorDecrementorMethods.furnitureIncrementationOfItemToList(shoppingList, furnitureChoiceLamp);
			out.println(
					"Lamp added to Basket\nEnter 1 to add another Lamp\nEnter 2 to return to Furniture list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FurnitureIfMethods.lampWhileIfLoop(shoppingList);
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
				FurnitureChoiceSwitchMethod.furnitureChoiceSwitchMethod(shoppingList, choice1);
			}
			break;
		}
	} catch (InputMismatchException e) {
	}
	}

}
