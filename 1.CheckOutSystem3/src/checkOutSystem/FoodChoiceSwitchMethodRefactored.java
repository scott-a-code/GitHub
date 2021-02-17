package checkOutSystem.choiceSwitchMethods;

import static java.lang.System.out;

import java.util.TreeMap;

import checkOutSystem.FoodIfMethodsRefactored;
import checkOutSystem.ifMethods.FoodIfMethods;
import checkOutSystem.items.Food;
import checkOutSystem.items.Item;
import checkOutSystem.listCreators.FoodListCreator;
import checkOutSystem.mapScannerComparatorPaymentmethods.IncrementorDecrementorMethods;
import checkOutSystem.mapScannerComparatorPaymentmethods.MapShoppingList;
import checkOutSystem.mapScannerComparatorPaymentmethods.ScannerClass;

public class FoodChoiceSwitchMethodRefactored {

	public static void foodChoiceSwitchMethod() throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		int specificItemChoice = ScannerClass.scanner.nextInt();
		switch (specificItemChoice) {
		case 101:
			Food foodChoice = FoodListCreator.getBread();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoice);
			out.println(
					"Bread added to Basket\nEnter 1 to add another Bread\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethodsRefactored.whileIfLoop(specificItemChoice);
			break;
		case 102:
			foodChoice = FoodListCreator.getMilk();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoice);
			out.println(
					"Milk added to Basket\nEnter 1 to add another Milk\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.milkWhileIfLoop();
		case 103:
			foodChoice = FoodListCreator.getCereal();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoice);
			out.println(
					"Cereal added to Basket\nEnter 1 to add another box of Cereal\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.cerealWhileIfLoop();
		case 104:
			foodChoice = FoodListCreator.getEggs();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoice);
			out.println(
					"Eggs added to Basket\nEnter 1 to add another box of Eggs\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.eggsWhileIfLoop();
		case 105:
			foodChoice = FoodListCreator.getBread();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoice);
			out.println(
					"Mince added to Basket\nEnter 1 to add another packet of Mince\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.minceWhileIfLoop();
		case 106:
			foodChoice = FoodListCreator.getPasta();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoice);
			out.println(
					"Pasta added to Basket\nEnter 1 to add another packet of Pasta\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.pastaWhileIfLoop();
		case 107:
			foodChoice = FoodListCreator.getSoup();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoice);
			out.println(
					"Soup added to Basket\nEnter 1 to add another Soup\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.soupWhileIfLoop();
		case 108:
			foodChoice = FoodListCreator.getApple();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoice);
			out.println(
					"Apples added to Basket\nEnter 1 to add another Apples\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.applesWhileIfLoop();
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
				FoodChoiceSwitchMethodRefactored.foodChoiceSwitchMethod(choice1);
			}
			break;
		}
	}

	// overloaded method
	public static void foodChoiceSwitchMethod(int choice1) throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		switch (choice1) {
		case 101:
			Food foodChoice = FoodListCreator.getBread();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoice);
			out.println(
					"Bread added to Basket\nEnter 1 to add another Bread\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.breadWhileIfLoop();
			break;
		case 102:
			foodChoice = FoodListCreator.getMilk();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoice);
			out.println(
					"Milk added to Basket\nEnter 1 to add another Milk\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.milkWhileIfLoop();
		case 103:
			foodChoice = FoodListCreator.getCereal();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoice);
			out.println(
					"Cereal added to Basket\nEnter 1 to add another box of Cereal\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.cerealWhileIfLoop();
		case 104:
			foodChoice = FoodListCreator.getEggs();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoice);
			out.println(
					"Eggs added to Basket\nEnter 1 to add another box of Eggs\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.eggsWhileIfLoop();
		case 105:
			foodChoice = FoodListCreator.getBread();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoice);
			out.println(
					"Mince added to Basket\nEnter 1 to add another packet of Mince\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.minceWhileIfLoop();
		case 106:
			foodChoice = FoodListCreator.getPasta();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoice);
			out.println(
					"Pasta added to Basket\nEnter 1 to add another packet of Pasta\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.pastaWhileIfLoop();
		case 107:
			foodChoice = FoodListCreator.getSoup();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoice);
			out.println(
					"Soup added to Basket\nEnter 1 to add another Soup\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.soupWhileIfLoop();
		case 108:
			foodChoice = FoodListCreator.getApple();
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoice);
			out.println(
					"Apples added to Basket\nEnter 1 to add another Apples\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			FoodIfMethods.applesWhileIfLoop();
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
				FoodChoiceSwitchMethodRefactored.foodChoiceSwitchMethod(choice1);
			}
			break;
		}
	}
}
