package checkOutSystemTester;

import static java.lang.System.in;
import static java.lang.System.out;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TesterClass {

	protected static void main(String[] args) {

		out.println("Welcome to your General Store, please search for your items from the following categories:");
		out.println("Food - 1 \nClothing - 2 \nToiletries - 3 \nMedical products - 4 \nFurniture - 5 \nOther - 6");
		Scanner scanner = new Scanner(in);
		int choice = scanner.nextInt();

		switchOnly(choice);
		scanner.close();

		LocalDate foodExpiryDate = LocalDate.now();
		Food soup = new Food(107, "Soup", BigDecimal.valueOf(0.89), foodExpiryDate.plusYears(2));
		Food cereal = new Food(103, "Cereal", BigDecimal.valueOf(1.15), foodExpiryDate.plusDays(31));
		Food eggs = new Food(104, "Eggs", BigDecimal.valueOf(1.15), foodExpiryDate.plusDays(7));
		Food pasta = new Food(106, "Pasta", BigDecimal.valueOf(2.19), foodExpiryDate.plusYears(5));
		Food bread = new Food(101, "Bread", new BigDecimal("0.99"), foodExpiryDate.plusDays(6));
		Food mince = new Food(105, "Mince", BigDecimal.valueOf(5.49), foodExpiryDate.plusDays(9));
		Food apple = new Food(108, "Apples", BigDecimal.valueOf(0.99), foodExpiryDate.plusDays(8));
		Food milk = new Food(102, "Milk", BigDecimal.valueOf(0.91), foodExpiryDate.plusDays(9));
		List<Food> foodSet = List.of(soup, cereal, eggs, pasta, bread, mince, apple, milk);
		ArrayList<Food> foodListAL = new ArrayList<>(foodSet);
		Collections.sort(foodListAL, new IdComparator());
		String foodListALamended = foodListAL.toString().replace("[", " ").replace("]", " ").replace(",", " ").trim();
		System.out.println(foodListALamended);
		
		Map<Item, Integer> shoppingList = new TreeMap<>();
		Scanner scanner3 = new Scanner(in);
		int itemChoice = scanner3.nextInt();

		switch (itemChoice) {
		case 101:
			// Food foodChoiceBread = bread;
			// genericIncrementationOfFoodToList(shoppingList, foodChoiceBread);
			// out.println(
			// "Bread added to Basket\nEnter 1 to add another Bread\nEnter 2 to return to
			// Food list\nEnter 3 to return to the General item list\nEnter 4 to proceed to
			// checkout");
			Scanner scanner5 = new Scanner(in);
			int addAnother = scanner5.nextInt();
			do {
				Food foodChoiceBread = bread;
				genericIncrementationOfFoodToList(shoppingList, foodChoiceBread);
				out.println(
						"Bread added to Basket\nEnter 1 to add another Bread\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout");
			} while (addAnother == 1);

		case 102:
			Food foodChoiceMilk = milk;
			genericIncrementationOfFoodToList(shoppingList, foodChoiceMilk);
			out.println(
					"Milk added to Basket\nEnter 1 to add another Milk\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout");
		case 103:
			Food foodChoiceCereal = cereal;
			genericIncrementationOfFoodToList(shoppingList, foodChoiceCereal);
			out.println(
					"Cereal added to Basket\nEnter 1 to add another Cereal\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout");
		case 104:
			Food foodChoiceEggs = eggs;
			genericIncrementationOfFoodToList(shoppingList, foodChoiceEggs);
			out.println(
					"Eggs added to Basket\nEnter 1 to add another Eggs\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout");
		case 105:
			Food foodChoiceMince = mince;
			genericIncrementationOfFoodToList(shoppingList, foodChoiceMince);
			out.println(
					"Mince added to Basket\nEnter 1 to add another Mince\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout");
		case 106:
			Food foodChoicePasta = pasta;
			genericIncrementationOfFoodToList(shoppingList, foodChoicePasta);
			out.println(
					"Pasta added to Basket\nEnter 1 to add another Pasta\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout");
		case 107:
			Food foodChoiceSoup = soup;
			genericIncrementationOfFoodToList(shoppingList, foodChoiceSoup);
			out.println(
					"Soup added to Basket\nEnter 1 to add another Soup\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout");
		case 108:
			Food foodChoiceApples = apple;
			genericIncrementationOfFoodToList(shoppingList, foodChoiceApples);
			out.println(
					"Apples added to Basket\nEnter 1 to add another Apples\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout");
		default:
			out.println(
					"You have not selected an valid option, please select an option from the list or enter '0' to exit.");
		}
		
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

	private static void genericIncrementationOfFoodToList(Map<Item, Integer> shoppingList, Food foodChoice) {
		if (shoppingList.containsKey(foodChoice) == false) {
			shoppingList.put(foodChoice, 1);
		} else {
			int numberOfItems = shoppingList.get(foodChoice).intValue();
			numberOfItems++;
			shoppingList.put(foodChoice, numberOfItems);
		}
	}

	private static void genericDerementationOfFoodToList(Map<Item, Integer> shoppingList, Food foodChoice) {
		if (shoppingList.containsKey(foodChoice) == true) {
			int numberOfItems = shoppingList.get(foodChoice).intValue();
			numberOfItems--;
			shoppingList.put(foodChoice, numberOfItems);
		} else {
			System.out.println("This item is not in the basket");
		}
	}

	private static void switchOnly(int choice) {
		switch (choice) {
		case 1:
			out.println("You have selected Food(1)");
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
					"You have not selected an valid option, please select an option from the list or enter '0' to exit.");

			Scanner scanner2 = new Scanner(in);
			int choice1 = scanner2.nextInt();
			switch (choice1) {
			case 0:
				out.println("Thank you, please shop with us again.");
				break;
			default:
				switchOnly(choice1);
				scanner2.close();
			}
			break;

		}

		// this is the same as the code up top
		LocalDate foodExpiryDate = LocalDate.now();

		Food soup = new Food(107, "Soup", BigDecimal.valueOf(0.89), foodExpiryDate.plusYears(2));
		Food cereal = new Food(103, "Cereal", BigDecimal.valueOf(1.15), foodExpiryDate.plusDays(31));
		Food eggs = new Food(104, "Eggs", BigDecimal.valueOf(1.15), foodExpiryDate.plusDays(7));
		Food pasta = new Food(106, "Pasta", BigDecimal.valueOf(2.19), foodExpiryDate.plusYears(5));
		Food bread = new Food(101, "Bread", new BigDecimal("0.99"), foodExpiryDate.plusDays(6));
		Food mince = new Food(105, "Mince", BigDecimal.valueOf(5.49), foodExpiryDate.plusDays(9));
		Food apple = new Food(108, "Apples", BigDecimal.valueOf(0.99), foodExpiryDate.plusDays(8));
		Food milk = new Food(102, "Milk", BigDecimal.valueOf(0.91), foodExpiryDate.plusDays(9));
		List<Food> foodSet = List.of(soup, cereal, eggs, pasta, bread, mince, apple, milk);
		ArrayList<Food> foodListAL = new ArrayList<>(foodSet);
		Collections.sort(foodListAL, new IdComparator());
		String foodListALamended = foodListAL.toString().replace("[", " ").replace("]", " ").replace(",", " ").trim();
		System.out.println(foodListALamended);

	}
}


