package checkOutSystem.mapScannerComparatorPaymentmethods;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

import checkOutSystem.MainMenuOptionsMethod;
import checkOutSystem.items.Clothes;
import checkOutSystem.items.Furniture;
import checkOutSystem.items.Item;
import checkOutSystem.items.Medical;
import checkOutSystem.items.Other;
import checkOutSystem.items.Toiletries;

public class PriceCalcAndPayment {

	public static void totalPriceCalc(Map<Item, Integer> shoppingList) {
		BigDecimal totalPrice = new BigDecimal(0);
		for (Map.Entry<Item, Integer> shoppingListCollection : shoppingList.entrySet()) {
			BigDecimal itemPrice = shoppingListCollection.getKey().getPrice();
			BigDecimal numberOfItemBD = new BigDecimal(shoppingListCollection.getValue());
			BigDecimal multipliedPrice = itemPrice.multiply(numberOfItemBD);
			totalPrice = totalPrice.add(multipliedPrice);
		}
		System.out.println("£" + totalPrice);
	}

	public static void finalPaymentMethod(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, int choice, Map<Item, Integer> shoppingList)
			throws InterruptedException {
		System.out.println(
				"Please confirm your basket is correct\nEnter Y to confirm and pay\nEnter N to return to main shopping List menu");
		Thread.sleep(3000);
		System.out.println(shoppingList);
		totalPriceCalc(shoppingList);
		repeatFinalpaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
				scanner, choice);
	}

	public static void repeatFinalpaymentMethod(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, int choice) throws InterruptedException {
		String confirmChoice = scanner.next();
		if (confirmChoice.equals("y") || confirmChoice.equals("Y")) {
			System.out.println("Purchase complete. Thank you, please shop with us again.");
		} else if (confirmChoice.equals("n") || confirmChoice.equals("N")) {
			System.out.println(mainList);
			choice = scanner.nextInt();
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("You have not selected a valid option, please try again");
			confirmChoice = scanner.next();
			repeatFinalpaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, choice);
		}
	}

	public static void finalPaymentMethod() throws InterruptedException {
		System.out.println(
				"Please confirm your basket is correct\nEnter Y to confirm and pay\nEnter N to return to main shopping List menu");
		Thread.sleep(3000);
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		System.out.println(shoppingList);
		totalPriceCalc(shoppingList);
		PriceCalcAndPayment.repeatFinalpaymentMethod();
	}

	public static void repeatFinalpaymentMethod() throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		String confirmChoice = scanner.next();
		if (confirmChoice.equals("y") || confirmChoice.equals("Y")) {
			System.out.println("Purchase complete. Thank you, please shop with us again.");
			scanner.close();
			System.exit(1);
		} else if (confirmChoice.equals("n") || confirmChoice.equals("N")) {
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("You have not selected a valid option, please try again");
			confirmChoice = scanner.next();
			PriceCalcAndPayment.repeatFinalpaymentMethod();
		}
	}
}
