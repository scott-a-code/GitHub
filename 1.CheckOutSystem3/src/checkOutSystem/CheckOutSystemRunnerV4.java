package checkOutSystem;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.TreeMap;

import checkOutSystem.items.Item;
import checkOutSystem.mapScannerComparatorPaymentmethods.MapShoppingList;

public class CheckOutSystemRunnerV4 {

	public static void main(String[] args) throws InterruptedException {

		out.println(
				"Welcome to your General Store, please search for the items you wish\nto purchase by entering the number of the corresponding category:");
		Thread.sleep(1000);
		TreeMap<Item, Integer> shoppingList = new MapShoppingList().getShoppingList();
		extracted(shoppingList);
		System.exit(1);
	}

	private static void extracted(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		try {
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} catch (InputMismatchException e) {
			// no printing of stack trace as application is designed for end user.
		}
		// repeated method to allow continuation of program if exception occurs
		try {
		MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} catch (InputMismatchException e) {
		}
	}
}
