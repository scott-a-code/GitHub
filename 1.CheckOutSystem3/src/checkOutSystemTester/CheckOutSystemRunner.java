package checkOutSystemTester;

import static java.lang.System.in;
import static java.lang.System.out;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.Callable;

class PriceComparator implements Comparator<Item> {

	@Override
	public int compare(Item item1, Item item2) {
		return item1.getPrice().compareTo(item2.getPrice());
	}
}

class IdComparator implements Comparator<Item> {

	@Override
	public int compare(Item item1, Item item2) {
		return Integer.compare(item1.getId(), item2.getId());
	}
}

class nameComparator implements Comparator<Item> {

	@Override
	public int compare(Item item1, Item item2) {
		return item1.getName().compareTo(item2.getName());
	}
}

class Task<T> implements Callable<T> {

	private int taskNumber;

	public Task(int taskNumber) {
		this.taskNumber = taskNumber;
	}

	@Override
	public T call() throws Exception {

		return null;
	}
}

public class CheckOutSystemRunner {

	public static void main(String[] args) throws InterruptedException {

		out.println(
				"Welcome to your General Store, please search for the items you wish\nto purchase by entering the number of the corresponding category:");
		Thread.sleep(1000);
		String mainList = "Food - 1 \nClothing - 2 \nToiletries - 3 \nMedical products - 4 \nFurniture - 5 \nOther - 6";
		out.println(mainList);

		LocalDate foodExpiryDate = LocalDate.now();
		Food soup = new Food(107, "Soup", BigDecimal.valueOf(0.89), foodExpiryDate.plusYears(2));
		Food cereal = new Food(103, "Cereal", BigDecimal.valueOf(1.15), foodExpiryDate.plusDays(31));
		Food eggs = new Food(104, "Eggs", BigDecimal.valueOf(1.15), foodExpiryDate.plusDays(7));
		Food pasta = new Food(106, "Pasta", BigDecimal.valueOf(2.19), foodExpiryDate.plusYears(5));
		Food bread = new Food(101, "Bread", new BigDecimal("0.99"), foodExpiryDate.plusDays(6));
		Food mince = new Food(105, "Mince", BigDecimal.valueOf(5.49), foodExpiryDate.plusDays(9));
		Food apple = new Food(108, "Apples", BigDecimal.valueOf(0.99), foodExpiryDate.plusDays(8));
		Food milk = new Food(102, "Milk", BigDecimal.valueOf(0.91), foodExpiryDate.plusDays(9));
		List<Food> foodList = List.of(soup, cereal, eggs, pasta, bread, mince, apple, milk);
		ArrayList<Food> foodListAL = new ArrayList<>(foodList);
		Collections.sort(foodListAL, new IdComparator());
		String foodListALsorted = foodListAL.toString().replace("[", "").replace("]", "").replace(",", "");
		// out.println(foodListALamended);

		Scanner scanner = new Scanner(in);
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			out.println(
					"You have selected Food(1) \nPlease enter the ID number of the item you wish to purchase from the following list:");
			out.println(foodListALsorted);
			Thread.sleep(1000);
			break;

		default:
			out.println(
					"You have not selected an valid option, please select an option from the list or enter '0' to exit");
			Scanner scanner2 = new Scanner(in);
			int choice1 = scanner2.nextInt();
			switch (choice1) {
			case 0:
				out.println("Thank you, please shop with us again.");
				scanner2.close();
				break;
			default:
				mainMenuOptions(choice1);
			}
			break;
		}
		scanner.close();

		Map<Item, Integer> shoppingList = new TreeMap<>();
		Scanner scannerSpecifiItemChoice = new Scanner(in);
		int specificItemChoice = scannerSpecifiItemChoice.nextInt();

		switch (specificItemChoice) {
		case 101:
			Scanner scannerAddReturnOrPay101 = new Scanner(in);
			int addRemoveOrReturnBread = scannerAddReturnOrPay101.nextInt();
			do {
				Food foodChoiceBread = bread;
				genericIncrementationOfItemToList(shoppingList, foodChoiceBread);
				out.println(
						"Bread added to Basket\nEnter 1 to add another Bread\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout");
			} while (addRemoveOrReturnBread == 1);
			if (addRemoveOrReturnBread == 2) {
				out.println(foodListALsorted);
				// method to bring up foodList and functionality
			} else if (addRemoveOrReturnBread == 3) {
				out.println(mainList);
				// method to bring up mainList and functionality
			} else {
				out.println(shoppingList);
				// method to sum shoppingList and pay
			}
			scannerAddReturnOrPay101.close();
			break;
		case 102:
			Scanner scannerAddReturnOrPay102 = new Scanner(in);
			int addRemoveOrReturnMilk = scannerAddReturnOrPay102.nextInt();
			do {
			Food foodChoiceMilk = milk;
			genericIncrementationOfItemToList(shoppingList, foodChoiceMilk);
			out.println(
					"Milk added to Basket\nEnter 1 to add another Milk\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout");
		} while (addRemoveOrReturnMilk == 1);
		if (addRemoveOrReturnMilk == 2) {
			out.println(foodListALsorted);
			// method to bring up foodList and functionality
		} else if (addRemoveOrReturnMilk == 3) {
			out.println(mainList);
			// method to bring up mainList and functionality
		} else {
			out.println(shoppingList);
			// method to sum shoppingList and pay
		}
		scannerAddReturnOrPay102.close();
			break;
		case 103:
			Scanner scannerAddReturnOrPay103 = new Scanner(in);
			int addRemoveOrReturnCereal = scannerAddReturnOrPay103.nextInt();
			do {
			Food foodChoiceCereal = cereal;
			genericIncrementationOfItemToList(shoppingList, foodChoiceCereal);
			out.println(
					"Cereal added to Basket\nEnter 1 to add another Cereal\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout");
		} while (addRemoveOrReturnCereal == 1);
		if (addRemoveOrReturnCereal == 2) {
			out.println(foodListALsorted);
			// method to bring up foodList and functionality
		} else if (addRemoveOrReturnCereal == 3) {
			out.println(mainList);
			// method to bring up mainList and functionality
		} else {
			out.println(shoppingList);
			// method to sum shoppingList and pay
		}
		scannerAddReturnOrPay103.close();
			break;
		case 104:
			Scanner scannerAddReturnOrPay104 = new Scanner(in);
			int addRemoveOrReturnEggs = scannerAddReturnOrPay104.nextInt();
			do {
			Food foodChoiceEggs = eggs;
			genericIncrementationOfItemToList(shoppingList, foodChoiceEggs);
			out.println(
					"Eggs added to Basket\nEnter 1 to add another Eggs\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout");
		} while (addRemoveOrReturnEggs == 1);
		if (addRemoveOrReturnEggs == 2) {
			out.println(foodListALsorted);
			// method to bring up foodList and functionality
		} else if (addRemoveOrReturnEggs == 3) {
			out.println(mainList);
			// method to bring up mainList and functionality
		} else {
			out.println(shoppingList);
			// method to sum shoppingList and pay
		}
		scannerAddReturnOrPay104.close();
			break;
		case 105:
			Scanner scannerAddReturnOrPay105 = new Scanner(in);
			int addRemoveOrReturnMilkMince = scannerAddReturnOrPay105.nextInt();
			do {
			Food foodChoiceMince = mince;
			genericIncrementationOfItemToList(shoppingList, foodChoiceMince);
			out.println(
					"Mince added to Basket\nEnter 1 to add another Mince\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout");
		} while (addRemoveOrReturnMilkMince == 1);
		if (addRemoveOrReturnMilkMince == 2) {
			out.println(foodListALsorted);
			// method to bring up foodList and functionality
		} else if (addRemoveOrReturnMilkMince == 3) {
			out.println(mainList);
			// method to bring up mainList and functionality
		} else {
			out.println(shoppingList);
			// method to sum shoppingList and pay
		}
		scannerAddReturnOrPay105.close();
			break;
		case 106:
			Scanner scannerAddReturnOrPay106 = new Scanner(in);
			int addRemoveOrReturnPasta = scannerAddReturnOrPay106.nextInt();
			do {
			Food foodChoicePasta = pasta;
			genericIncrementationOfItemToList(shoppingList, foodChoicePasta);
			out.println(
					"Pasta added to Basket\nEnter 1 to add another Pasta\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout");
		} while (addRemoveOrReturnPasta == 1);
		if (addRemoveOrReturnPasta == 2) {
			out.println(foodListALsorted);
			// method to bring up foodList and functionality
		} else if (addRemoveOrReturnPasta == 3) {
			out.println(mainList);
			// method to bring up mainList and functionality
		} else {
			out.println(shoppingList);
			// method to sum shoppingList and pay
		}
		scannerAddReturnOrPay106.close();
			break;
		case 107:
			Scanner scannerAddReturnOrPay107 = new Scanner(in);
			int addRemoveOrReturnSoup = scannerAddReturnOrPay107.nextInt();
			do {
			Food foodChoiceSoup = soup;
			genericIncrementationOfItemToList(shoppingList, foodChoiceSoup);
			out.println(
					"Soup added to Basket\nEnter 1 to add another Soup\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout");
		} while (addRemoveOrReturnSoup == 1);
		if (addRemoveOrReturnSoup == 2) {
			out.println(foodListALsorted);
			// method to bring up foodList and functionality
		} else if (addRemoveOrReturnSoup == 3) {
			out.println(mainList);
			// method to bring up mainList and functionality
		} else {
			out.println(shoppingList);
			// method to sum shoppingList and pay
		}
		scannerAddReturnOrPay107.close();
			break;
		case 108:
			Scanner scannerAddReturnOrPay108 = new Scanner(in);
			int addRemoveOrReturnApple = scannerAddReturnOrPay108.nextInt();
			do {
			Food foodChoiceApples = apple;
			genericIncrementationOfItemToList(shoppingList, foodChoiceApples);
			out.println(
					"Apples added to Basket\nEnter 1 to add another Apples\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout");
		} while (addRemoveOrReturnApple == 1);
		if (addRemoveOrReturnApple == 2) {
			out.println(foodListALsorted);
			// method to bring up foodList and functionality
		} else if (addRemoveOrReturnApple == 3) {
			out.println(mainList);
			// method to bring up mainList and functionality
		} else {
			out.println(shoppingList);
			// method to sum shoppingList and pay
		}
		scannerAddReturnOrPay108.close();
			break;
		default:
			out.println(
					"You have not selected an valid option, please select an option from the list or enter '0' to exit.");
			Scanner defaultscanner = new Scanner(in);
			int choice1 = defaultscanner.nextInt();
			switch (choice1) {
			case 0:
				out.println("Thank you, please shop with us again.");
				break;
			default:
				// method name for this switch (choice1);
				defaultscanner.close();
			}
			break;
		}

		scannerSpecifiItemChoice.close();

		System.out.println(shoppingList);
		scanner.close();
		// create empty map - Done
		// if person wants to add item (via ID), either initialise map with value 1 for
		// the object(Item) using map.put()
		// or have as a separate option to add any quantity to it, potentially using an
		// overloaded method
		// Need a method to remove items as well, can only remove items that are
		// there(i.e. protect the member variable)
		// or only allow removal of 1 at a time, potential to use the Queue class?
		// Need a method to calculate price and have that as a running total
		// Always have a proceed to checkout option
		// Once selected cash/card. Enter amount into the console.
		// If the amount doesn't match exactly, try again
		// Once completed finish

	}

	private static void genericIncrementationOfItemToList(Map<Item, Integer> shoppingList, Food foodChoice) {
		if (shoppingList.containsKey(foodChoice) == false) {
			shoppingList.put(foodChoice, 1);
		} else {
			int numberOfItems = shoppingList.get(foodChoice).intValue();
			numberOfItems++;
			shoppingList.put(foodChoice, numberOfItems);
		}
	}

	private static void genericDerementationOfItemToList(Map<Item, Integer> shoppingList, Food foodChoice) {
		if (shoppingList.containsKey(foodChoice) == true) {
			int numberOfItems = shoppingList.get(foodChoice).intValue();
			numberOfItems--;
			shoppingList.put(foodChoice, numberOfItems);
		} else {
			System.out.println("This item is not in the basket");
		}
	}


		// JOANNAAAAA Why can't i do the below? Wanted to have all of the sets in a set
		// so could then just call the 'master' set.
		// Is it because the sets within are of different types? i.e. food/ clothing
		// etc? If so, would turning them all into Generics help?

		// Set<Set<Item>> fullItemSet = new HashSet<Set<Item>>();
		// fullItemSet.add(foodSet, clothesSet, toiletriesSet, medicalSet, furnitureSet,
		// otherSet);


		/*
		 * System.out.println(foodListAL); System.out.println(clothesTS);
		 * System.out.println(toiletriesTS); System.out.println(medicalTS);
		 * System.out.println(furnitureTS); System.out.println(otherTS);
		 */


	private static void mainMenuOptions(int choice) throws InterruptedException {

		// create empty map - Done
		// if person wants to add item (via ID), either initialise map with value 1 for
		// the object(Item) using map.put()
		// or have as a separate option to add any quantity to it.
		// Need a method to remove items as well, can only remove items that are
		// there(i.e. protect the member variable)
		// or only allow removal of 1 at a time, potential to use the Queue class?
		// Need a method to calculate price and have that as a running total
		// Always have a proceed to checkout option / view basket + continue shopping
		// Once selected cash/card. Enter amount into the console.
		// If the amount doesn't match exactly, try again
		// Once completed finish
		switch (choice) {
		case 1:
			out.println(
					"You have selected Food(1)\nPlease enter the ID number of the item you wish to purchase from the following list:");
			// Thread.sleep(1000);
			// shoppingList.put(itemSelection, itemSelection.getName());
			break;
		case 2:
			out.println("You have selected Clothing(2)");
			break;
		case 3:
			out.println("You have selected Toiletries(3)");
			break;
		case 4:
			out.println("You have selected Medical products(4)");
			break;
		case 5:
			out.println("You have selected Furniture(5)");
			break;
		case 6:
			out.println("You have selected Other(6)");
			break;
		default:
			out.println(
					"You have not selected an valid option, please select an option from the list or enter '0' to exit");
			Scanner scanner2 = new Scanner(in);
			int choice1 = scanner2.nextInt();
			switch (choice1) {
			case 0:
				out.println("Thank you, please shop with us again.");
				scanner2.close();
				break;
			default:
				mainMenuOptions(choice1);
			}
			break;
		}
	}
}
