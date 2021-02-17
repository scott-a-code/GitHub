package checkOutSystem;

import static java.lang.System.out;

import java.util.TreeMap;

import checkOutSystem.choiceSwitchMethods.FoodChoiceSwitchMethod;
import checkOutSystem.items.Food;
import checkOutSystem.items.Item;
import checkOutSystem.listCreators.FoodListCreator;
import checkOutSystem.mapScannerComparatorPaymentmethods.IncrementorDecrementorMethods;
import checkOutSystem.mapScannerComparatorPaymentmethods.MapShoppingList;
import checkOutSystem.mapScannerComparatorPaymentmethods.PriceCalcAndPayment;
import checkOutSystem.mapScannerComparatorPaymentmethods.ScannerClass;

public class FoodIfMethodsRefactored {

	public static void whileIfLoop(int specificItemChoice) throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		int addRemoveOrReturn = ScannerClass.scanner.nextInt();
		Food foodChoice = FoodListCreator.getBread();
		while (addRemoveOrReturn == 1) {
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoice);
			out.println(
					"Bread added to Basket\nEnter 1 to add another Bread\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturn = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturn == 2) {
			out.println(FoodListCreator.create());
			FoodChoiceSwitchMethod.foodChoiceSwitchMethod();
		} else if (addRemoveOrReturn == 3) {
			out.println(FoodListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else if (addRemoveOrReturn == 4) {
			PriceCalcAndPayment.finalPaymentMethod();
		} else if (addRemoveOrReturn == 5) {
			IncrementorDecrementorMethods.foodDerementationOfItemToList(shoppingList, foodChoice);
			out.println(FoodListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("Invalid input, please choose a valid option");
			FoodIfMethodsRefactored.whileIfLoop(specificItemChoice); // infinite loop - overload method
		}
	}

	public static void milkWhileIfLoop() throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		int addRemoveOrReturnMilk = ScannerClass.scanner.nextInt();
		Food foodChoiceMilk = FoodListCreator.getMilk();
		while (addRemoveOrReturnMilk == 1) {
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoiceMilk);
			out.println(
					"Milk added to Basket\nEnter 1 to add another Milk\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnMilk = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnMilk == 2) {
			out.println(FoodListCreator.create());
			FoodChoiceSwitchMethod.foodChoiceSwitchMethod();
		} else if (addRemoveOrReturnMilk == 3) {
			out.println(FoodListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else if (addRemoveOrReturnMilk == 4) {
			PriceCalcAndPayment.finalPaymentMethod();
		} else if (addRemoveOrReturnMilk == 5) {
			IncrementorDecrementorMethods.foodDerementationOfItemToList(shoppingList, foodChoiceMilk);
			out.println(FoodListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("Invalid input, please choose a valid option");
			FoodIfMethodsRefactored.milkWhileIfLoop();
		}
	}

	public static void cerealWhileIfLoop() throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		int addRemoveOrReturnCereal = ScannerClass.scanner.nextInt();
		Food foodChoiceCereal = FoodListCreator.getCereal();
		while (addRemoveOrReturnCereal == 1) {
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoiceCereal);
			out.println(
					"Cereal added to Basket\nEnter 1 to add another box of Cereal\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnCereal = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnCereal == 2) {
			out.println(FoodListCreator.create());
			FoodChoiceSwitchMethod.foodChoiceSwitchMethod();
		} else if (addRemoveOrReturnCereal == 3) {
			out.println(FoodListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else if (addRemoveOrReturnCereal == 4) {
			PriceCalcAndPayment.finalPaymentMethod();
		} else if (addRemoveOrReturnCereal == 5) {
			IncrementorDecrementorMethods.foodDerementationOfItemToList(shoppingList, foodChoiceCereal);
			out.println(FoodListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("Invalid input, please choose a valid option");
			FoodIfMethodsRefactored.cerealWhileIfLoop();
		}
	}

	public static void eggsWhileIfLoop() throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		int addRemoveOrReturnEggs = ScannerClass.scanner.nextInt();
		Food foodChoiceEggs = FoodListCreator.getEggs();
		while (addRemoveOrReturnEggs == 1) {
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoiceEggs);
			out.println(
					"Eggs added to Basket\nEnter 1 to add another box of Eggs\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnEggs = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnEggs == 2) {
			out.println(FoodListCreator.create());
			FoodChoiceSwitchMethod.foodChoiceSwitchMethod();
		} else if (addRemoveOrReturnEggs == 3) {
			out.println(FoodListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else if (addRemoveOrReturnEggs == 4) {
			PriceCalcAndPayment.finalPaymentMethod();
		} else if (addRemoveOrReturnEggs == 5) {
			IncrementorDecrementorMethods.foodDerementationOfItemToList(shoppingList, foodChoiceEggs);
			out.println(FoodListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("Invalid input, please choose a valid option");
			FoodIfMethodsRefactored.eggsWhileIfLoop();
		}
	}

	public static void minceWhileIfLoop() throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		int addRemoveOrReturnMince = ScannerClass.scanner.nextInt();
		Food foodChoiceMince = FoodListCreator.getMince();
		while (addRemoveOrReturnMince == 1) {
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoiceMince);
			out.println(
					"Mince added to Basket\nEnter 1 to add another packet of Mince\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnMince = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnMince == 2) {
			out.println(FoodListCreator.create());
			FoodChoiceSwitchMethod.foodChoiceSwitchMethod();
		} else if (addRemoveOrReturnMince == 3) {
			out.println(FoodListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else if (addRemoveOrReturnMince == 4) {
			PriceCalcAndPayment.finalPaymentMethod();
		} else if (addRemoveOrReturnMince == 5) {
			IncrementorDecrementorMethods.foodDerementationOfItemToList(shoppingList, foodChoiceMince);
			out.println(FoodListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("Invalid input, please choose a valid option");
			FoodIfMethodsRefactored.minceWhileIfLoop();
		}
	}

	public static void pastaWhileIfLoop() throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		int addRemoveOrReturnPasta = ScannerClass.scanner.nextInt();
		Food foodChoicePasta = FoodListCreator.getPasta();
		while (addRemoveOrReturnPasta == 1) {
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoicePasta);
			out.println(
					"Pasta added to Basket\nEnter 1 to add another packet of Pasta\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnPasta = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnPasta == 2) {
			out.println(FoodListCreator.create());
			FoodChoiceSwitchMethod.foodChoiceSwitchMethod();
		} else if (addRemoveOrReturnPasta == 3) {
			out.println(FoodListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else if (addRemoveOrReturnPasta == 4) {
			PriceCalcAndPayment.finalPaymentMethod();
		} else if (addRemoveOrReturnPasta == 5) {
			IncrementorDecrementorMethods.foodDerementationOfItemToList(shoppingList, foodChoicePasta);
			out.println(FoodListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("Invalid input, please choose a valid option");
			FoodIfMethodsRefactored.pastaWhileIfLoop();
		}
	}

	public static void soupWhileIfLoop() throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		int addRemoveOrReturnSoup = ScannerClass.scanner.nextInt();
		Food foodChoiceSoup = FoodListCreator.getSoup();
		while (addRemoveOrReturnSoup == 1) {
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoiceSoup);
			out.println(
					"Soup added to Basket\nEnter 1 to add another tin of Soup\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnSoup = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnSoup == 2) {
			out.println(FoodListCreator.create());
			FoodChoiceSwitchMethod.foodChoiceSwitchMethod();
		} else if (addRemoveOrReturnSoup == 3) {
			out.println(FoodListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else if (addRemoveOrReturnSoup == 4) {
			PriceCalcAndPayment.finalPaymentMethod();
		} else if (addRemoveOrReturnSoup == 5) {
			IncrementorDecrementorMethods.foodDerementationOfItemToList(shoppingList, foodChoiceSoup);
			out.println(FoodListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("Invalid input, please choose a valid option");
			FoodIfMethodsRefactored.soupWhileIfLoop();
		}
	}

	public static void applesWhileIfLoop() throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		int addRemoveOrReturnApple = ScannerClass.scanner.nextInt();
		Food foodChoiceApple = FoodListCreator.getApple();
		while (addRemoveOrReturnApple == 1) {
			IncrementorDecrementorMethods.foodIncrementationOfItemToList(shoppingList, foodChoiceApple);
			out.println(
					"Apples added to Basket\nEnter 1 to add another packet of Apples\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnApple = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnApple == 2) {
			out.println(FoodListCreator.create());
			FoodChoiceSwitchMethod.foodChoiceSwitchMethod();
		} else if (addRemoveOrReturnApple == 3) {
			out.println(FoodListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else if (addRemoveOrReturnApple == 4) {
			PriceCalcAndPayment.finalPaymentMethod();
		} else if (addRemoveOrReturnApple == 5) {
			IncrementorDecrementorMethods.foodDerementationOfItemToList(shoppingList, foodChoiceApple);
			out.println(FoodListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("Invalid input, please choose a valid option");
			FoodIfMethodsRefactored.applesWhileIfLoop();
		}
	}
}
