package checkOutSystem.choiceSwitchMethods;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.TreeMap;

import checkOutSystem.ifMethods.FoodIfMethods;
import checkOutSystem.items.Food;
import checkOutSystem.items.Item;
import checkOutSystem.listCreators.FoodListCreator;
import checkOutSystem.mapScannerComparatorPaymentmethods.IncrementorDecrementorMethods;
import checkOutSystem.mapScannerComparatorPaymentmethods.ScannerClass;

public class FoodChoiceSwitchMethod {

	public static void foodChoiceSwitchMethod(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		try {
		int specificItemChoice = ScannerClass.scanner.nextInt();
		switch (specificItemChoice) {
		case 101:
			Food foodChoiceBread = FoodListCreator.getBread();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoiceBread);
			out.println(
					"Bread added to Basket\nEnter 1 to add another Bread\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.breadWhileIfLoop(shoppingList);
			break;
		case 102:
			Food foodChoiceMilk = FoodListCreator.getMilk();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoiceMilk);
			out.println(
					"Milk added to Basket\nEnter 1 to add another Milk\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.milkWhileIfLoop(shoppingList);
		case 103:
			Food foodChoiceCereal = FoodListCreator.getCereal();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoiceCereal);
			out.println(
					"Cereal added to Basket\nEnter 1 to add another box of Cereal\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.cerealWhileIfLoop(shoppingList);
		case 104:
			Food foodChoiceEggs = FoodListCreator.getEggs();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoiceEggs);
			out.println(
					"Eggs added to Basket\nEnter 1 to add another box of Eggs\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.eggsWhileIfLoop(shoppingList);
		case 105:
			Food foodChoiceMince = FoodListCreator.getBread();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoiceMince);
			out.println(
					"Mince added to Basket\nEnter 1 to add another packet of Mince\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.minceWhileIfLoop(shoppingList);
		case 106:
			Food foodChoicePasta = FoodListCreator.getPasta();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoicePasta);
			out.println(
					"Pasta added to Basket\nEnter 1 to add another packet of Pasta\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.pastaWhileIfLoop(shoppingList);
		case 107:
			Food foodChoiceSoup = FoodListCreator.getSoup();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoiceSoup);
			out.println(
					"Soup added to Basket\nEnter 1 to add another Soup\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.soupWhileIfLoop(shoppingList);
		case 108:
			Food foodChoiceApples = FoodListCreator.getApple();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoiceApples);
			out.println(
					"Apples added to Basket\nEnter 1 to add another Apples\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.applesWhileIfLoop(shoppingList);
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
				FoodChoiceSwitchMethod.foodChoiceSwitchMethod(shoppingList, choice1);
			}
			break;
		}
	} catch (InputMismatchException e) {
		System.out.println("Error. Please only enter the numbers provided!");
	}
	}

	// overloaded method
	public static void foodChoiceSwitchMethod(TreeMap<Item, Integer> shoppingList, int choice1) throws InterruptedException {
		try {
		switch (choice1) {
		case 101:
			Food foodChoiceBread = FoodListCreator.getBread();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoiceBread);
			out.println(
					"Bread added to Basket\nEnter 1 to add another Bread\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.breadWhileIfLoop(shoppingList);
			break;
		case 102:
			Food foodChoiceMilk = FoodListCreator.getMilk();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoiceMilk);
			out.println(
					"Milk added to Basket\nEnter 1 to add another Milk\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.milkWhileIfLoop(shoppingList);
		case 103:
			Food foodChoiceCereal = FoodListCreator.getCereal();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoiceCereal);
			out.println(
					"Cereal added to Basket\nEnter 1 to add another box of Cereal\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.cerealWhileIfLoop(shoppingList);
		case 104:
			Food foodChoiceEggs = FoodListCreator.getEggs();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoiceEggs);
			out.println(
					"Eggs added to Basket\nEnter 1 to add another box of Eggs\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.eggsWhileIfLoop(shoppingList);
		case 105:
			Food foodChoiceMince = FoodListCreator.getBread();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoiceMince);
			out.println(
					"Mince added to Basket\nEnter 1 to add another packet of Mince\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.minceWhileIfLoop(shoppingList);
		case 106:
			Food foodChoicePasta = FoodListCreator.getPasta();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoicePasta);
			out.println(
					"Pasta added to Basket\nEnter 1 to add another packet of Pasta\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.pastaWhileIfLoop(shoppingList);
		case 107:
			Food foodChoiceSoup = FoodListCreator.getSoup();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoiceSoup);
			out.println(
					"Soup added to Basket\nEnter 1 to add another Soup\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.soupWhileIfLoop(shoppingList);
		case 108:
			Food foodChoiceApples = FoodListCreator.getApple();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoiceApples);
			out.println(
					"Apples added to Basket\nEnter 1 to add another Apples\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.applesWhileIfLoop(shoppingList);
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
				FoodChoiceSwitchMethod.foodChoiceSwitchMethod(shoppingList, choice1);
			}
			break;
		}
	} catch (InputMismatchException e) {

	}
}
}
