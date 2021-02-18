package checkOutSystem.mapScannerComparatorPaymentmethods;

import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

import checkOutSystem.MainMenuOptionsMethod;
import checkOutSystem.items.Item;

public class PriceCalcAndPayment {

	public static void totalPriceCalc(TreeMap<Item, Integer> shoppingList) {
		BigDecimal totalPrice = new BigDecimal(0);
		for (Map.Entry<Item, Integer> shoppingListCollection : shoppingList.entrySet()) {
			BigDecimal itemPrice = shoppingListCollection.getKey().getPrice();
			BigDecimal numberOfItemBD = new BigDecimal(shoppingListCollection.getValue());
			BigDecimal multipliedPrice = itemPrice.multiply(numberOfItemBD);
			totalPrice = totalPrice.add(multipliedPrice);
		}
		System.out.println("£" + totalPrice);
	}

	public static void finalPaymentMethod(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		System.out.println(
				"Please confirm your basket is correct\nEnter Y to confirm and pay\nEnter N to return to main shopping List menu");
		Thread.sleep(3000);
		System.out.println(shoppingList);
		totalPriceCalc(shoppingList);
		repeatFinalpaymentMethod(shoppingList);
	}

	public static void repeatFinalpaymentMethod(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		String confirmChoice = ScannerClass.scanner.next();
		if (confirmChoice.equals("y") || confirmChoice.equals("Y")) {
			System.out.println("Purchase complete. Thank you, please shop with us again.");
			System.exit(1);
		} else if (confirmChoice.equals("n") || confirmChoice.equals("N")) {
			System.out.println(MainMenuOptionsMethod.mainList);
			int choice = ScannerClass.scanner.nextInt();
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else {
			System.out.println("You have not selected a valid option, please try again");
			confirmChoice = ScannerClass.scanner.next();
			repeatFinalpaymentMethod(shoppingList);
		}
	}
}
