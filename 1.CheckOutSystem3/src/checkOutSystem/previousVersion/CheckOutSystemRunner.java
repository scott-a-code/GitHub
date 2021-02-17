package checkOutSystem.previousVersion;

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
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import checkOutSystem.items.Clothes;
import checkOutSystem.items.Food;
import checkOutSystem.items.Furniture;
import checkOutSystem.items.Item;
import checkOutSystem.items.Medical;
import checkOutSystem.items.Other;
import checkOutSystem.items.Toiletries;

class IdComparator implements Comparator<Item> {

	public int compare(Item item1, Item item2) {
		return Integer.compare(item1.getId(), item2.getId());
	}
}

public class CheckOutSystemRunner {

	// reason we cannot add more than 1 class of item is because it gets assigned a
	// value of null when things loop. De-linking it all should help

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

		Clothes tshirt = new Clothes(201, "T-shirts", BigDecimal.valueOf(5.99));
		Clothes trousers = new Clothes(202, "Trousers", BigDecimal.valueOf(6.99));
		Clothes underwear = new Clothes(203, "Underwear", BigDecimal.valueOf(3.49));
		Clothes shoes = new Clothes(204, "Shoes", BigDecimal.valueOf(21.99));
		Clothes socks = new Clothes(205, "Socks", BigDecimal.valueOf(1.99));
		Set<Clothes> clothesSet = Set.of(tshirt, trousers, underwear, shoes, socks);
		TreeSet<Clothes> clothesTS = new TreeSet<>(clothesSet);
		// String clothesTSSorted = clothesTS.toString().replace("[", "").replace("]",
		// "").replace(",", "");

		Toiletries toothpaste = new Toiletries(301, "Toothpaste", BigDecimal.valueOf(4.49));
		Toiletries soap = new Toiletries(302, "Soap", BigDecimal.valueOf(3.99));
		Toiletries toiletpaper = new Toiletries(303, "Toiletpaper", BigDecimal.valueOf(3.99));
		Toiletries deodorant = new Toiletries(304, "Deodorant", BigDecimal.valueOf(3.49));
		Set<Toiletries> toiletriesSet = Set.of(toothpaste, soap, toiletpaper, deodorant);
		TreeSet<Toiletries> toiletriesTS = new TreeSet<>(toiletriesSet);
		// String toiletriesTSSorted = toiletriesTS.toString().replace("[",
		// "").replace("]", "").replace(",", "");

		Medical paracetamol = new Medical(401, "Paracetamol", BigDecimal.valueOf(0.39), "Johnson & Johnson");
		Medical antihistamines = new Medical(402, "Antihistamines", BigDecimal.valueOf(2.99), "GSK");
		Medical condoms = new Medical(403, "Condoms", BigDecimal.valueOf(7.99), "Durex");
		Medical coldAndFlu = new Medical(404, "Cold & Flu", BigDecimal.valueOf(4.99), "Johnson & Johnson");
		Set<Medical> medicalSet = Set.of(paracetamol, antihistamines, condoms, coldAndFlu);
		TreeSet<Medical> medicalTS = new TreeSet<>(medicalSet);
		// String medicalTSSorted = medicalTS.toString().replace("[", "").replace("]",
		// "").replace(",", "");

		Furniture couch = new Furniture(501, "Couch", BigDecimal.valueOf(150.99), "Essential Home");
		Furniture table = new Furniture(502, "Table", BigDecimal.valueOf(75.00), "Brabbu");
		Furniture kitchen = new Furniture(503, "Kitchen", BigDecimal.valueOf(1349.99), "Zeyko");
		Furniture lamps = new Furniture(504, "Lamp", BigDecimal.valueOf(81.99), "DelightFULL");
		Set<Furniture> furnitureSet = Set.of(couch, table, kitchen, lamps);
		TreeSet<Furniture> furnitureTS = new TreeSet<>(furnitureSet);
		// String furnitureTSSorted = furnitureTS.toString().replace("[",
		// "").replace("]", "").replace(",", "");

		Other flowers = new Other(601, "Flower", BigDecimal.valueOf(24.99));
		Other petFood = new Other(602, "Pet Food", BigDecimal.valueOf(13.99));
		Other toys = new Other(603, "Toys", BigDecimal.valueOf(6.99));
		Other cards = new Other(604, "Card", BigDecimal.valueOf(1.99));
		Set<Other> otherSet = Set.of(flowers, petFood, toys, cards);
		TreeSet<Other> otherTS = new TreeSet<>(otherSet);
		// String otherTSSorted = otherTS.toString().replace("[", "").replace("]",
		// "").replace(",", "");

		Map<Item, Integer> shoppingList = new TreeMap<>();
		// shoppingList.put(soup, 1);
		// shoppingList.put(flowers, 1);
		Scanner scanner = new Scanner(in);
		int choice = scanner.nextInt();
		mainMenuOptions(mainList, soup, cereal, eggs, pasta, bread, mince, apple, milk, foodListALsorted, tshirt,
				trousers, underwear, shoes, socks, clothesTS, toothpaste, soap, toiletpaper, deodorant, toiletriesTS,
				paracetamol, antihistamines, condoms, coldAndFlu, medicalTS, couch, table, kitchen, lamps, furnitureTS,
				flowers, petFood, toys, cards, otherTS, shoppingList, scanner, choice);
		scanner.close();
		System.exit(1);
	}

	private static void mainMenuOptions(String mainList, Food soup, Food cereal, Food eggs, Food pasta, Food bread,
			Food mince, Food apple, Food milk, String foodListALsorted, Clothes tshirt, Clothes trousers,
			Clothes underwear, Clothes shoes, Clothes socks, TreeSet<Clothes> clothesTS, Toiletries toothpaste,
			Toiletries soap, Toiletries toiletpaper, Toiletries deodorant, TreeSet<Toiletries> toiletriesTS,
			Medical paracetamol, Medical antihistamines, Medical condoms, Medical coldAndFlu,
			TreeSet<Medical> medicalTS, Furniture couch, Furniture table, Furniture kitchen, Furniture lamps,
			TreeSet<Furniture> furnitureTS, Other flowers, Other petFood, Other toys, Other cards,
			TreeSet<Other> otherTS, Map<Item, Integer> shoppingList, Scanner scanner, int choice)
			throws InterruptedException {
		switch (choice) {
		case 1:
			out.println(
					"You have selected Food(1) \nPlease enter the ID number of the item you wish to purchase from the following list:");
			Thread.sleep(1000);
			out.println(foodListALsorted);
			int specificItemChoiceFood = scanner.nextInt();
			foodChoiceSwitchMethod(mainList, soup, cereal, eggs, pasta, bread, mince, apple, milk, foodListALsorted,
					clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS, scanner, shoppingList,
					specificItemChoiceFood);
			break;
		case 2:
			out.println(
					"You have selected Clothing(2) \nPlease enter the ID number of the item you wish to purchase from the following list:");
			Thread.sleep(1000);
			out.println(clothesTS);
			int specificItemChoiceClothes = scanner.nextInt();
			clothesChoiceSwitchMethod(mainList, tshirt, trousers, underwear, shoes, socks, foodListALsorted,
					clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS, scanner, shoppingList,
					specificItemChoiceClothes);
			break;
		case 3:
			out.println(
					"You have selected Toiletries(3) \nPlease enter the ID number of the item you wish to purchase from the following list:");
			Thread.sleep(1000);
			out.println(toiletriesTS);
			int specificItemChoiceToiletries = scanner.nextInt();
			toiletriesChoiceSwitchMethod(mainList, toothpaste, soap, toiletpaper, deodorant, foodListALsorted,
					clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS, scanner, shoppingList,
					specificItemChoiceToiletries);
			break;
		case 4:
			out.println(
					"You have selected Medical products(4) \nPlease enter the ID number of the item you wish to purchase from the following list:");
			Thread.sleep(1000);
			out.println(medicalTS);
			int specificItemChoiceMedical = scanner.nextInt();
			medicalChoiceSwitchMethod(mainList, paracetamol, antihistamines, condoms, coldAndFlu, foodListALsorted,
					clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS, scanner, shoppingList,
					specificItemChoiceMedical);
			break;
		case 5:
			out.println(
					"You have selected Furniture(5) \nPlease enter the ID number of the item you wish to purchase from the following list:");
			Thread.sleep(1000);
			out.println(furnitureTS);
			int specificItemChoiceFurniture = scanner.nextInt();
			furnitureChoiceSwitchMethod(mainList, couch, table, kitchen, lamps, foodListALsorted, clothesTS,
					toiletriesTS, medicalTS, furnitureTS, otherTS, scanner, shoppingList, specificItemChoiceFurniture);
			break;
		case 6:
			out.println(
					"You have selected Other(6) \nPlease enter the ID number of the item you wish to purchase from the following list:");
			Thread.sleep(1000);
			out.println(otherTS);
			int specificItemChoiceOther = scanner.nextInt();
			otherChoiceSwitchMethod(mainList, flowers, petFood, toys, cards, foodListALsorted, clothesTS, toiletriesTS,
					medicalTS, furnitureTS, otherTS, scanner, shoppingList, specificItemChoiceOther);
			break;
		default:
			out.println(
					"You have not selected an valid option, please select an option from the list or enter '0' to exit");
			int choice1 = scanner.nextInt();
			switch (choice1) {
			case 0:
				out.println("Thank you, please shop with us again.");
				System.exit(1);
				break;
			default:
				mainMenuOptions(mainList, milk, milk, milk, milk, milk, milk, milk, milk, foodListALsorted,
						socks, socks, socks, socks, socks, clothesTS, deodorant, deodorant, deodorant, deodorant,
						toiletriesTS, coldAndFlu, coldAndFlu, coldAndFlu, coldAndFlu, medicalTS, lamps, lamps, lamps,
						lamps, furnitureTS, cards, cards, cards, cards, otherTS, shoppingList, scanner,
						choice1);
			}
			break;
		}
	}

	private static void foodChoiceSwitchMethod(String mainList, Food soup, Food cereal, Food eggs, Food pasta,
			Food bread, Food mince, Food apple, Food milk, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, int specificItemChoice)
			throws InterruptedException {
		switch (specificItemChoice) {
		case 101:
			Food foodChoiceBread = bread;
			foodIncrementationOfItemToList(shoppingList, foodChoiceBread);
			out.println(
					"Bread added to Basket\nEnter 1 to add another Bread\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnBread = scanner.nextInt();
			breadWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, foodChoiceBread, addRemoveOrReturnBread);
			break;
		case 102:
			Food foodChoiceMilk = milk;
			foodIncrementationOfItemToList(shoppingList, foodChoiceMilk);
			out.println(
					"Milk added to Basket\nEnter 1 to add another Milk\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnMilk = scanner.nextInt();
			milkWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, foodChoiceMilk, addRemoveOrReturnMilk);
		break;
		case 103:
			Food foodChoiceCereal = cereal;
			foodIncrementationOfItemToList(shoppingList, foodChoiceCereal);
			out.println(
					"Cereal added to Basket\nEnter 1 to add another Cereal\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnCereal = scanner.nextInt();
			cerealWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, foodChoiceCereal, addRemoveOrReturnCereal);
		break;
		case 104:
			Food foodChoiceEggs = eggs;
			foodIncrementationOfItemToList(shoppingList, foodChoiceEggs);
			out.println(
					"Eggs added to Basket\nEnter 1 to add another Eggs\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnEggs = scanner.nextInt();
			eggsWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, foodChoiceEggs, addRemoveOrReturnEggs);
		break;
		case 105:
			Food foodChoiceMince = mince;
			foodIncrementationOfItemToList(shoppingList, foodChoiceMince);
			out.println(
					"Mince added to Basket\nEnter 1 to add another Mince\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnMince = scanner.nextInt();
			minceWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, foodChoiceMince, addRemoveOrReturnMince);
		break;
		case 106:
			Food foodChoicePasta = pasta;
			foodIncrementationOfItemToList(shoppingList, foodChoicePasta);
			out.println(
					"Pasta added to Basket\nEnter 1 to add another Pasta\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnPasta = scanner.nextInt();
			pastaWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, foodChoicePasta, addRemoveOrReturnPasta);
		break;
		case 107:
			Food foodChoiceSoup = soup;
			foodIncrementationOfItemToList(shoppingList, foodChoiceSoup);
			out.println(
					"Soup added to Basket\nEnter 1 to add another Soup\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnSoup = scanner.nextInt();
			soupWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner,
					shoppingList, foodChoiceSoup, addRemoveOrReturnSoup);	break;
		case 108:
			Food foodChoiceApples = apple;
			foodIncrementationOfItemToList(shoppingList, foodChoiceApples);
			out.println(
					"Apples added to Basket\nEnter 1 to add another Apples\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnApple = scanner.nextInt();
			appleWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, foodChoiceApples, addRemoveOrReturnApple);
			break;
		default:
			out.println(
					"You have not selected an valid option, please select an option from the list or enter '0' to exit.");
			int choice1 = scanner.nextInt();
			switch (choice1) {
			case 0:
				out.println("Thank you, please shop with us again.");
				System.exit(1);
				break;
			default:
				foodChoiceSwitchMethod(mainList, bread, milk, cereal, eggs, mince, pasta, soup, apple,
						foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS, scanner,
						shoppingList, choice1);
			}
			break;
		}
	}

	private static void breadWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, Food foodChoiceBread,
			int addRemoveOrReturnBread) throws InterruptedException {
		while (addRemoveOrReturnBread == 1) {
			foodIncrementationOfItemToList(shoppingList, foodChoiceBread);
			out.println(
					"Bread added to Basket\nEnter 1 to add another Bread\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnBread = scanner.nextInt();
		}
		if (addRemoveOrReturnBread == 2) {
			out.println(foodListALsorted);
			int newChoice = scanner.nextInt();
			foodChoiceSwitchMethod(mainList, foodChoiceBread, foodChoiceBread, foodChoiceBread, foodChoiceBread,
					foodChoiceBread, foodChoiceBread, foodChoiceBread, foodChoiceBread, foodListALsorted, clothesTS,
					toiletriesTS, medicalTS, furnitureTS, otherTS, scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnBread == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, foodChoiceBread, foodChoiceBread, foodChoiceBread, foodChoiceBread,
					foodChoiceBread, foodChoiceBread, foodChoiceBread, foodChoiceBread, foodListALsorted, null, null,
					null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList,
					scanner, newChoice);
		} else if (addRemoveOrReturnBread == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnBread, shoppingList);
		} else if (addRemoveOrReturnBread == 5) {
			foodDerementationOfItemToList(shoppingList, foodChoiceBread);
			System.out.println(mainList);
			addRemoveOrReturnBread = scanner.nextInt();
			mainMenuOptions(mainList, foodChoiceBread, foodChoiceBread, foodChoiceBread, foodChoiceBread,
					foodChoiceBread, foodChoiceBread, foodChoiceBread, foodChoiceBread, foodListALsorted, null, null,
					null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList,
					scanner, addRemoveOrReturnBread);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnBread = scanner.nextInt();
			breadWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, foodChoiceBread, addRemoveOrReturnBread);
		}
	}

	private static void milkWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, Food foodChoiceMilk,
			int addRemoveOrReturnMilk) throws InterruptedException {
		while (addRemoveOrReturnMilk == 1) {
			foodIncrementationOfItemToList(shoppingList, foodChoiceMilk);
			out.println(
					"Milk added to Basket\nEnter 1 to add another Milk\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnMilk = scanner.nextInt();
		}
		if (addRemoveOrReturnMilk == 2) {
		out.println(foodListALsorted);
		int newChoice = scanner.nextInt();
		foodChoiceSwitchMethod(mainList, foodChoiceMilk, foodChoiceMilk, foodChoiceMilk, foodChoiceMilk,
				foodChoiceMilk, foodChoiceMilk, foodChoiceMilk, foodChoiceMilk, foodListALsorted, clothesTS,
				toiletriesTS, medicalTS, furnitureTS, otherTS, scanner, shoppingList, newChoice);
	} else if (addRemoveOrReturnMilk == 3) {
		out.println(mainList);
		int newChoice = scanner.nextInt();
		mainMenuOptions(mainList, foodChoiceMilk, foodChoiceMilk, foodChoiceMilk, foodChoiceMilk,
				foodChoiceMilk, foodChoiceMilk, foodChoiceMilk, foodChoiceMilk, foodListALsorted, null, null, null,
				null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null, medicalTS, null,
				null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
				newChoice);
	} else if (addRemoveOrReturnMilk == 4) {
		finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
				otherTS, scanner, addRemoveOrReturnMilk, shoppingList);
	} else if (addRemoveOrReturnMilk == 5) {
		foodDerementationOfItemToList(shoppingList, foodChoiceMilk);
		System.out.println(mainList);
		addRemoveOrReturnMilk = scanner.nextInt();
		mainMenuOptions(mainList, foodChoiceMilk, foodChoiceMilk, foodChoiceMilk, foodChoiceMilk,
				foodChoiceMilk, foodChoiceMilk, foodChoiceMilk, foodChoiceMilk, foodListALsorted, null, null, null,
				null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null, medicalTS, null,
				null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
				addRemoveOrReturnMilk);
	} else {
		System.out.println("Please choose a valid option");
		addRemoveOrReturnMilk = scanner.nextInt();
		milkWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
				scanner, shoppingList, foodChoiceMilk, addRemoveOrReturnMilk);
}
	}

	private static void cerealWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, Food foodChoiceCereal,
			int addRemoveOrReturnCereal) throws InterruptedException {
		while (addRemoveOrReturnCereal == 1) {
			foodIncrementationOfItemToList(shoppingList, foodChoiceCereal);
			out.println(
					"Cereal added to Basket\nEnter 1 to add another Cereal\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnCereal = scanner.nextInt();
		}
		if (addRemoveOrReturnCereal == 2) {
		out.println(foodListALsorted);
		int newChoice = scanner.nextInt();
		foodChoiceSwitchMethod(mainList, foodChoiceCereal, foodChoiceCereal, foodChoiceCereal, foodChoiceCereal,
				foodChoiceCereal, foodChoiceCereal, foodChoiceCereal, foodChoiceCereal, foodListALsorted, clothesTS,
				toiletriesTS, medicalTS, furnitureTS, otherTS, scanner, shoppingList, newChoice);
	} else if (addRemoveOrReturnCereal == 3) {
		out.println(mainList);
		int newChoice = scanner.nextInt();
		mainMenuOptions(mainList, foodChoiceCereal, foodChoiceCereal, foodChoiceCereal, foodChoiceCereal,
				foodChoiceCereal, foodChoiceCereal, foodChoiceCereal, foodChoiceCereal, foodListALsorted, null, null,
				null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null, medicalTS,
				null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
				newChoice);
	} else if (addRemoveOrReturnCereal == 4) {
		finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
				otherTS, scanner, addRemoveOrReturnCereal, shoppingList);
	} else if (addRemoveOrReturnCereal == 5) {
		foodDerementationOfItemToList(shoppingList, foodChoiceCereal);
		System.out.println(mainList);
		addRemoveOrReturnCereal = scanner.nextInt();
		mainMenuOptions(mainList, foodChoiceCereal, foodChoiceCereal, foodChoiceCereal, foodChoiceCereal,
				foodChoiceCereal, foodChoiceCereal, foodChoiceCereal, foodChoiceCereal, foodListALsorted, null, null,
				null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null, medicalTS,
				null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
				addRemoveOrReturnCereal);
	} else {
		System.out.println("Please choose a valid option");
		addRemoveOrReturnCereal = scanner.nextInt();
		cerealWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
				scanner, shoppingList, foodChoiceCereal, addRemoveOrReturnCereal);
	}
	}

	private static void eggsWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, Food foodChoiceEggs,
			int addRemoveOrReturnEggs) throws InterruptedException {
		while (addRemoveOrReturnEggs == 1) {
			foodIncrementationOfItemToList(shoppingList, foodChoiceEggs);
			out.println(
					"Eggs added to Basket\nEnter 1 to add another Eggs\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnEggs = scanner.nextInt();
		}
		if (addRemoveOrReturnEggs == 2) {
		out.println(foodListALsorted);
		int newChoice = scanner.nextInt();
		foodChoiceSwitchMethod(mainList, foodChoiceEggs, foodChoiceEggs, foodChoiceEggs, foodChoiceEggs,
				foodChoiceEggs, foodChoiceEggs, foodChoiceEggs, foodChoiceEggs, foodListALsorted, clothesTS,
				toiletriesTS, medicalTS, furnitureTS, otherTS, scanner, shoppingList, newChoice);
	} else if (addRemoveOrReturnEggs == 3) {
		out.println(mainList);
		int newChoice = scanner.nextInt();
		mainMenuOptions(mainList, foodChoiceEggs, foodChoiceEggs, foodChoiceEggs, foodChoiceEggs,
				foodChoiceEggs, foodChoiceEggs, foodChoiceEggs, foodChoiceEggs, foodListALsorted, null, null, null,
				null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null, medicalTS, null,
				null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
				newChoice);
	} else if (addRemoveOrReturnEggs == 4) {
		finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
				otherTS, scanner, addRemoveOrReturnEggs, shoppingList);
	} else if (addRemoveOrReturnEggs == 5) {
		foodDerementationOfItemToList(shoppingList, foodChoiceEggs);
		System.out.println(mainList);
		addRemoveOrReturnEggs = scanner.nextInt();
		mainMenuOptions(mainList, foodChoiceEggs, foodChoiceEggs, foodChoiceEggs, foodChoiceEggs,
				foodChoiceEggs, foodChoiceEggs, foodChoiceEggs, foodChoiceEggs, foodListALsorted, null, null, null,
				null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null, medicalTS, null,
				null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
				addRemoveOrReturnEggs);
	} else {
		System.out.println("Please choose a valid option");
		addRemoveOrReturnEggs = scanner.nextInt();
		eggsWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
				scanner, shoppingList, foodChoiceEggs, addRemoveOrReturnEggs);
	}
	}


	private static void minceWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, Food foodChoiceMince,
			int addRemoveOrReturnMince) throws InterruptedException {
		while (addRemoveOrReturnMince == 1) {
			foodIncrementationOfItemToList(shoppingList, foodChoiceMince);
			out.println(
					"Mince added to Basket\nEnter 1 to add another Mince\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnMince = scanner.nextInt();
		}
		if (addRemoveOrReturnMince == 2) {
		out.println(foodListALsorted);
		int newChoice = scanner.nextInt();
		foodChoiceSwitchMethod(mainList, foodChoiceMince, foodChoiceMince, foodChoiceMince, foodChoiceMince,
				foodChoiceMince, foodChoiceMince, foodChoiceMince, foodChoiceMince, foodListALsorted, clothesTS,
				toiletriesTS, medicalTS, furnitureTS, otherTS, scanner, shoppingList, newChoice);
	} else if (addRemoveOrReturnMince == 3) {
		out.println(mainList);
		int newChoice = scanner.nextInt();
		mainMenuOptions(mainList, foodChoiceMince, foodChoiceMince, foodChoiceMince, foodChoiceMince,
				foodChoiceMince, foodChoiceMince, foodChoiceMince, foodChoiceMince, foodListALsorted, null, null, null,
				null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null, medicalTS, null,
				null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
				newChoice);
	} else if (addRemoveOrReturnMince == 4) {
		finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
				otherTS, scanner, addRemoveOrReturnMince, shoppingList);
	} else if (addRemoveOrReturnMince == 5) {
		foodDerementationOfItemToList(shoppingList, foodChoiceMince);
		System.out.println(mainList);
		addRemoveOrReturnMince = scanner.nextInt();
		mainMenuOptions(mainList, foodChoiceMince, foodChoiceMince, foodChoiceMince, foodChoiceMince,
				foodChoiceMince, foodChoiceMince, foodChoiceMince, foodChoiceMince, foodListALsorted, null, null, null,
				null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null, medicalTS, null,
				null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
				addRemoveOrReturnMince);
	} else {
		System.out.println("Please choose a valid option");
		addRemoveOrReturnMince = scanner.nextInt();
		minceWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
				scanner, shoppingList, foodChoiceMince, addRemoveOrReturnMince);
}
	}

	private static void pastaWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, Food foodChoicePasta,
			int addRemoveOrReturnPasta) throws InterruptedException {
		while (addRemoveOrReturnPasta == 1) {
			foodIncrementationOfItemToList(shoppingList, foodChoicePasta);
			out.println(
					"Pasta added to Basket\nEnter 1 to add another Pasta\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnPasta = scanner.nextInt();
		}
		if (addRemoveOrReturnPasta == 2) {
		out.println(foodListALsorted);
		int newChoice = scanner.nextInt();
		foodChoiceSwitchMethod(mainList, foodChoicePasta, foodChoicePasta, foodChoicePasta, foodChoicePasta,
				foodChoicePasta, foodChoicePasta, foodChoicePasta, foodChoicePasta, foodListALsorted, clothesTS,
				toiletriesTS, medicalTS, furnitureTS, otherTS, scanner, shoppingList, newChoice);
	} else if (addRemoveOrReturnPasta == 3) {
		out.println(mainList);
		int newChoice = scanner.nextInt();
		mainMenuOptions(mainList, foodChoicePasta, foodChoicePasta, foodChoicePasta, foodChoicePasta,
				foodChoicePasta, foodChoicePasta, foodChoicePasta, foodChoicePasta, foodListALsorted, null, null, null,
				null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null, medicalTS, null,
				null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
				newChoice);
	} else if (addRemoveOrReturnPasta == 4) {
		finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
				otherTS, scanner, addRemoveOrReturnPasta, shoppingList);
	} else if (addRemoveOrReturnPasta == 5) {
		foodDerementationOfItemToList(shoppingList, foodChoicePasta);
		System.out.println(mainList);
		addRemoveOrReturnPasta = scanner.nextInt();
		mainMenuOptions(mainList, foodChoicePasta, foodChoicePasta, foodChoicePasta, foodChoicePasta,
				foodChoicePasta, foodChoicePasta, foodChoicePasta, foodChoicePasta, foodListALsorted, null, null, null,
				null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null, medicalTS, null,
				null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
				addRemoveOrReturnPasta);
	} else {
		System.out.println("Please choose a valid option");
		addRemoveOrReturnPasta = scanner.nextInt();
		pastaWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
				scanner, shoppingList, foodChoicePasta, addRemoveOrReturnPasta);
}
	}

	private static void soupWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, Food foodChoiceSoup,
			int addRemoveOrReturnSoup) throws InterruptedException {
		while (addRemoveOrReturnSoup == 1) {
			foodIncrementationOfItemToList(shoppingList, foodChoiceSoup);
			out.println(
					"Soup added to Basket\nEnter 1 to add another Soup\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnSoup = scanner.nextInt();
		}
		if (addRemoveOrReturnSoup == 2) {
		out.println(foodListALsorted);
		int newChoice = scanner.nextInt();
		foodChoiceSwitchMethod(mainList, foodChoiceSoup, foodChoiceSoup, foodChoiceSoup, foodChoiceSoup,
				foodChoiceSoup, foodChoiceSoup, foodChoiceSoup, foodChoiceSoup, foodListALsorted, clothesTS,
				toiletriesTS, medicalTS, furnitureTS, otherTS, scanner, shoppingList, newChoice);
	} else if (addRemoveOrReturnSoup == 3) {
		out.println(mainList);
		int newChoice = scanner.nextInt();
		mainMenuOptions(mainList, foodChoiceSoup, foodChoiceSoup, foodChoiceSoup, foodChoiceSoup,
				foodChoiceSoup, foodChoiceSoup, foodChoiceSoup, foodChoiceSoup, foodListALsorted, null, null, null,
				null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null, medicalTS, null,
				null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
				newChoice);
	} else if (addRemoveOrReturnSoup == 4) {
		finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
				otherTS, scanner, addRemoveOrReturnSoup, shoppingList);
	} else if (addRemoveOrReturnSoup == 5) {
		foodDerementationOfItemToList(shoppingList, foodChoiceSoup);
		System.out.println(mainList);
		addRemoveOrReturnSoup = scanner.nextInt();
		mainMenuOptions(mainList, foodChoiceSoup, foodChoiceSoup, foodChoiceSoup, foodChoiceSoup,
				foodChoiceSoup, foodChoiceSoup, foodChoiceSoup, foodChoiceSoup, foodListALsorted, null, null, null,
				null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null, medicalTS, null,
				null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
				addRemoveOrReturnSoup);
	} else {
		System.out.println("Please choose a valid option");
		addRemoveOrReturnSoup = scanner.nextInt();
		soupWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
				scanner, shoppingList, foodChoiceSoup, addRemoveOrReturnSoup);
}
	}

	private static void appleWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, Food foodChoiceApples,
			int addRemoveOrReturnApple) throws InterruptedException {
		while (addRemoveOrReturnApple == 1) {
			foodIncrementationOfItemToList(shoppingList, foodChoiceApples);
			out.println(
					"Apples added to Basket\nEnter 1 to add another Apples\nEnter 2 to return to Food list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnApple = scanner.nextInt();
		}
		if (addRemoveOrReturnApple == 2) {
			out.println(foodListALsorted);
			int newChoice = scanner.nextInt();
			foodChoiceSwitchMethod(mainList, foodChoiceApples, foodChoiceApples, foodChoiceApples,
					foodChoiceApples, foodChoiceApples, foodChoiceApples, foodChoiceApples, foodChoiceApples,
					foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS, scanner, shoppingList,
					newChoice);
		} else if (addRemoveOrReturnApple == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, foodChoiceApples, foodChoiceApples, foodChoiceApples, foodChoiceApples,
					foodChoiceApples, foodChoiceApples, foodChoiceApples, foodChoiceApples, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList,
					scanner, newChoice);
		} else if (addRemoveOrReturnApple == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnApple, shoppingList);
		} else if (addRemoveOrReturnApple == 5) {
			foodDerementationOfItemToList(shoppingList, foodChoiceApples);
			System.out.println(mainList);
			addRemoveOrReturnApple = scanner.nextInt();
			mainMenuOptions(mainList, foodChoiceApples, foodChoiceApples, foodChoiceApples, foodChoiceApples,
					foodChoiceApples, foodChoiceApples, foodChoiceApples, foodChoiceApples, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList,
					scanner, addRemoveOrReturnApple);
		} else {
			System.out.println("Please choose a valid option");
			addRemoveOrReturnApple = scanner.nextInt();
			appleWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, foodChoiceApples, addRemoveOrReturnApple);
		}
	}

	private static void clothesChoiceSwitchMethod(String mainList, Clothes tshirt, Clothes trousers, Clothes underwear,
			Clothes shoes, Clothes socks, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, int specificItemChoice)
			throws InterruptedException {
		switch (specificItemChoice) {
		case 201:
			Clothes clothesChoiceTshirt = tshirt;
			clothesIncrementationOfItemToList(shoppingList, clothesChoiceTshirt);
			out.println(
					"T-shirt added to Basket\nEnter 1 to add another T-shirt\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnTshirt = scanner.nextInt();
			tshirtWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, clothesChoiceTshirt, addRemoveOrReturnTshirt);
			break;
		case 202:
			Clothes clothesChoiceTrousers = trousers;
			clothesIncrementationOfItemToList(shoppingList, clothesChoiceTrousers);
			out.println(
					"Trousers added to Basket\nEnter 1 to add another pair of Trousers\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnTrousers = scanner.nextInt();
			trousersWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, clothesChoiceTrousers, addRemoveOrReturnTrousers);
			break;
		case 203:
			Clothes clothesChoiceUnderwear = underwear;
			clothesIncrementationOfItemToList(shoppingList, clothesChoiceUnderwear);
			out.println(
					"Underwear added to Basket\nEnter 1 to add another pair of underwear\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnUnderwear = scanner.nextInt();
			underwearWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, clothesChoiceUnderwear, addRemoveOrReturnUnderwear);
			break;
		case 204:
			Clothes clothesChoiceShoes = shoes;
			clothesIncrementationOfItemToList(shoppingList, clothesChoiceShoes);
			out.println(
					"Shoes added to Basket\nEnter 1 to add another pair of Shoes\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnShoes = scanner.nextInt();
			shoesWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, clothesChoiceShoes, addRemoveOrReturnShoes);
			break;
		case 205:
			Clothes clothesChoiceSocks = socks;
			clothesIncrementationOfItemToList(shoppingList, clothesChoiceSocks);
			out.println(
					"Socks added to Basket\nEnter 1 to add another pair of Scoks\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnSocks = scanner.nextInt();
			socksWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, clothesChoiceSocks, addRemoveOrReturnSocks);
			break;
		default:
			out.println(
					"You have not selected an valid option, please select an option from the list or enter '0' to exit.");
			int choice1 = scanner.nextInt();
			switch (choice1) {
			case 0:
				out.println("Thank you, please shop with us again.");
				System.exit(1);
				break;
			default:
				clothesChoiceSwitchMethod(mainList, tshirt, trousers, underwear, shoes, socks, foodListALsorted,
						clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS, scanner, shoppingList,
						choice1);
			}
			break;
		}
	}

	private static void tshirtWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, Clothes clothesChoiceTshirt,
			int addRemoveOrReturnTshirt) throws InterruptedException {
		while (addRemoveOrReturnTshirt == 1) {
			clothesIncrementationOfItemToList(shoppingList, clothesChoiceTshirt);
			out.println(
					"T-shirt added to Basket\nEnter 1 to add another T-shirt\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnTshirt = scanner.nextInt();
		}
		if (addRemoveOrReturnTshirt == 2) {
			out.println(clothesTS);
			int newChoice = scanner.nextInt();
			clothesChoiceSwitchMethod(mainList, clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt,
					clothesChoiceTshirt, clothesChoiceTshirt, foodListALsorted, clothesTS, toiletriesTS, medicalTS,
					furnitureTS, otherTS, scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnTshirt == 3) {
			System.out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted,
					clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt,
					clothesChoiceTshirt, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList,
					scanner, newChoice);
		} else if (addRemoveOrReturnTshirt == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnTshirt, shoppingList);
		} else if (addRemoveOrReturnTshirt == 5) {
			clothesDerementationOfItemToList(shoppingList, clothesChoiceTshirt);
			System.out.println(mainList);
			addRemoveOrReturnTshirt = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted,
					clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt,
					clothesChoiceTshirt, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList,
					scanner, addRemoveOrReturnTshirt);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnTshirt = scanner.nextInt();
			tshirtWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, clothesChoiceTshirt, addRemoveOrReturnTshirt);
		}
	}

	private static void trousersWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, Clothes clothesChoiceTshirt,
			int addRemoveOrReturnTrousers) throws InterruptedException {
		while (addRemoveOrReturnTrousers == 1) {
			clothesIncrementationOfItemToList(shoppingList, clothesChoiceTshirt);
			out.println(
					"Trousers added to Basket\nEnter 1 to add another pair of Trousers\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnTrousers = scanner.nextInt();
		}
		if (addRemoveOrReturnTrousers == 2) {
			out.println(clothesTS);
			int newChoice = scanner.nextInt();
			clothesChoiceSwitchMethod(mainList, clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt,
					clothesChoiceTshirt, clothesChoiceTshirt, foodListALsorted, clothesTS, toiletriesTS, medicalTS,
					furnitureTS, otherTS, scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnTrousers == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted,
					clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt,
					clothesChoiceTshirt, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList,
					scanner, newChoice);
		} else if (addRemoveOrReturnTrousers == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnTrousers, shoppingList);
		} else if (addRemoveOrReturnTrousers == 5) {
			clothesDerementationOfItemToList(shoppingList, clothesChoiceTshirt);
			System.out.println(mainList);
			addRemoveOrReturnTrousers = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted,
					clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt,
					clothesChoiceTshirt, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList,
					scanner, addRemoveOrReturnTrousers);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnTrousers = scanner.nextInt();
			trousersWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, clothesChoiceTshirt, addRemoveOrReturnTrousers);
		}
	}

	private static void underwearWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, Clothes clothesChoiceTshirt,
			int addRemoveOrReturnUnderwear) throws InterruptedException {
		while (addRemoveOrReturnUnderwear == 1) {
			clothesIncrementationOfItemToList(shoppingList, clothesChoiceTshirt);
			out.println(
					"Underwear added to Basket\nEnter 1 to add another pair of Underwear\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnUnderwear = scanner.nextInt();
		}
		if (addRemoveOrReturnUnderwear == 2) {
			out.println(clothesTS);
			int newChoice = scanner.nextInt();
			clothesChoiceSwitchMethod(mainList, clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt,
					clothesChoiceTshirt, clothesChoiceTshirt, foodListALsorted, clothesTS, toiletriesTS, medicalTS,
					furnitureTS, otherTS, scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnUnderwear == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted,
					clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt,
					clothesChoiceTshirt, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList,
					scanner, newChoice);
		} else if (addRemoveOrReturnUnderwear == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnUnderwear, shoppingList);
		} else if (addRemoveOrReturnUnderwear == 5) {
			clothesDerementationOfItemToList(shoppingList, clothesChoiceTshirt);
			System.out.println(mainList);
			addRemoveOrReturnUnderwear = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted,
					clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt,
					clothesChoiceTshirt, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList,
					scanner, addRemoveOrReturnUnderwear);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnUnderwear = scanner.nextInt();
			underwearWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, clothesChoiceTshirt, addRemoveOrReturnUnderwear);
		}
	}

	private static void shoesWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, Clothes clothesChoiceTshirt,
			int addRemoveOrReturnShoes) throws InterruptedException {
		while (addRemoveOrReturnShoes == 1) {
			clothesIncrementationOfItemToList(shoppingList, clothesChoiceTshirt);
			out.println(
					"Shoes added to Basket\nEnter 1 to add another pair of Shoes\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnShoes = scanner.nextInt();
		}
		if (addRemoveOrReturnShoes == 2) {
			out.println(clothesTS);
			int newChoice = scanner.nextInt();
			clothesChoiceSwitchMethod(mainList, clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt,
					clothesChoiceTshirt, clothesChoiceTshirt, foodListALsorted, clothesTS, toiletriesTS, medicalTS,
					furnitureTS, otherTS, scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnShoes == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted,
					clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt,
					clothesChoiceTshirt, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList,
					scanner, newChoice);
		} else if (addRemoveOrReturnShoes == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnShoes, shoppingList);
		} else if (addRemoveOrReturnShoes == 5) {
			clothesDerementationOfItemToList(shoppingList, clothesChoiceTshirt);
			System.out.println(mainList);
			addRemoveOrReturnShoes = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted,
					clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt,
					clothesChoiceTshirt, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList,
					scanner, addRemoveOrReturnShoes);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnShoes = scanner.nextInt();
			shoesWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, clothesChoiceTshirt, addRemoveOrReturnShoes);
		}
	}

	private static void socksWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, Clothes clothesChoiceTshirt,
			int addRemoveOrReturnSocks) throws InterruptedException {
		while (addRemoveOrReturnSocks == 1) {
			clothesIncrementationOfItemToList(shoppingList, clothesChoiceTshirt);
			out.println(
					"Socks added to Basket\nEnter 1 to add another pair of Socks\nEnter 2 to return to Clothes list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnSocks = scanner.nextInt();
		}
		if (addRemoveOrReturnSocks == 2) {
			out.println(clothesTS);
			int newChoice = scanner.nextInt();
			clothesChoiceSwitchMethod(mainList, clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt,
					clothesChoiceTshirt, clothesChoiceTshirt, foodListALsorted, clothesTS, toiletriesTS, medicalTS,
					furnitureTS, otherTS, scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnSocks == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted,
					clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt,
					clothesChoiceTshirt, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList,
					scanner, newChoice);
		} else if (addRemoveOrReturnSocks == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnSocks, shoppingList);
		} else if (addRemoveOrReturnSocks == 5) {
			clothesDerementationOfItemToList(shoppingList, clothesChoiceTshirt);
			System.out.println(mainList);
			addRemoveOrReturnSocks = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted,
					clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt, clothesChoiceTshirt,
					clothesChoiceTshirt, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList,
					scanner, addRemoveOrReturnSocks);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnSocks = scanner.nextInt();
			socksWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, clothesChoiceTshirt, addRemoveOrReturnSocks);
		}
	}

	private static void toiletriesChoiceSwitchMethod(String mainList, Toiletries toothpaste, Toiletries soap,
			Toiletries toiletpaper, Toiletries deodorant, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, int specificItemChoice)
			throws InterruptedException {
		switch (specificItemChoice) {
		case 301:
			Toiletries toiletriesChoiceToothpaste = toothpaste;
			toiletriesIncrementationOfItemToList(shoppingList, toiletriesChoiceToothpaste);
			out.println(
					"Toothpaste added to Basket\nEnter 1 to add another Toothpaste\nEnter 2 to return to Toiletries list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnToothpaste = scanner.nextInt();
			toothpasteWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, toiletriesChoiceToothpaste, addRemoveOrReturnToothpaste);
			break;
		case 302:
			Toiletries toiletriesChoiceSoap = soap;
			toiletriesIncrementationOfItemToList(shoppingList, toiletriesChoiceSoap);
			out.println(
					"Soap added to Basket\nEnter 1 to add another pair of Soap\nEnter 2 to return to Toiletries list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnSoap = scanner.nextInt();
			soapWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, toiletriesChoiceSoap, addRemoveOrReturnSoap);
			break;
		case 303:
			Toiletries toiletriesChoiceToiletpaper = toiletpaper;
			toiletriesIncrementationOfItemToList(shoppingList, toiletriesChoiceToiletpaper);
			out.println(
					"Toiletpaper added to Basket\nEnter 1 to add another Toiletpaper\nEnter 2 to return to Toiletries list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnToiletpaper = scanner.nextInt();
			toiletpaperWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, toiletriesChoiceToiletpaper, addRemoveOrReturnToiletpaper);
			break;
		case 304:
			Toiletries toiletriesChoiceDeodorant = deodorant;
			toiletriesIncrementationOfItemToList(shoppingList, toiletriesChoiceDeodorant);
			out.println(
					"Deodorant added to Basket\nEnter 1 to add another Deodorant\nEnter 2 to return to Toiletries list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnDeodorant = scanner.nextInt();
			deodorantWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, toiletriesChoiceDeodorant, addRemoveOrReturnDeodorant);
			break;
		default:
			out.println(
					"You have not selected an valid option, please select an option from the list or enter '0' to exit.");
			int choice1 = scanner.nextInt();
			switch (choice1) {
			case 0:
				out.println("Thank you, please shop with us again.");
				System.exit(1);
				break;
			default:
				toiletriesChoiceSwitchMethod(mainList, toothpaste, soap, toiletpaper, deodorant,
						foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS, scanner,
						shoppingList, choice1);
			}
			break;
		}
	}

	private static void toothpasteWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList,
			Toiletries toiletriesChoicetoothpaste, int addRemoveOrReturntoothpaste) throws InterruptedException {
		while (addRemoveOrReturntoothpaste == 1) {
			toiletriesIncrementationOfItemToList(shoppingList, toiletriesChoicetoothpaste);
			out.println(
					"Toothpaste added to Basket\nEnter 1 to add another Toothpaste\nEnter 2 to return to Toiletries list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturntoothpaste = scanner.nextInt();
		}
		if (addRemoveOrReturntoothpaste == 2) {
			out.println(toiletriesTS);
			int newChoice = scanner.nextInt();
			toiletriesChoiceSwitchMethod(mainList, toiletriesChoicetoothpaste, toiletriesChoicetoothpaste,
					toiletriesChoicetoothpaste, toiletriesChoicetoothpaste, foodListALsorted, clothesTS, toiletriesTS,
					medicalTS, furnitureTS, otherTS, scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturntoothpaste == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, toiletriesChoicetoothpaste, toiletriesChoicetoothpaste,
					toiletriesChoicetoothpaste, toiletriesChoicetoothpaste, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList,
					scanner, newChoice);
		} else if (addRemoveOrReturntoothpaste == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturntoothpaste, shoppingList);
		} else if (addRemoveOrReturntoothpaste == 5) {
			toiletriesDerementationOfItemToList(shoppingList, toiletriesChoicetoothpaste);
			System.out.println(mainList);
			addRemoveOrReturntoothpaste = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, toiletriesChoicetoothpaste, toiletriesChoicetoothpaste,
					toiletriesChoicetoothpaste, toiletriesChoicetoothpaste, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList,
					scanner, addRemoveOrReturntoothpaste);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturntoothpaste = scanner.nextInt();
			toothpasteWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, toiletriesChoicetoothpaste, addRemoveOrReturntoothpaste);
		}
	}

	private static void soapWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, Toiletries toiletriesChoiceSoap,
			int addRemoveOrReturnSoap) throws InterruptedException {
		while (addRemoveOrReturnSoap == 1) {
			toiletriesIncrementationOfItemToList(shoppingList, toiletriesChoiceSoap);
			out.println(
					"Soap added to Basket\nEnter 1 to add another Soap\nEnter 2 to return to Toiletries list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnSoap = scanner.nextInt();
		}
		if (addRemoveOrReturnSoap == 2) {
			out.println(toiletriesTS);
			int newChoice = scanner.nextInt();
			toiletriesChoiceSwitchMethod(mainList, toiletriesChoiceSoap, toiletriesChoiceSoap,
					toiletriesChoiceSoap, toiletriesChoiceSoap, foodListALsorted, clothesTS, toiletriesTS, medicalTS,
					furnitureTS, otherTS, scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnSoap == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, toiletriesChoiceSoap, toiletriesChoiceSoap, toiletriesChoiceSoap,
					toiletriesChoiceSoap, toiletriesTS, null, null, null, null, medicalTS, null, null, null, null,
					furnitureTS, null, null, null, null, otherTS, shoppingList, scanner, newChoice);
		} else if (addRemoveOrReturnSoap == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnSoap, shoppingList);
		} else if (addRemoveOrReturnSoap == 5) {
			toiletriesDerementationOfItemToList(shoppingList, toiletriesChoiceSoap);
			System.out.println(mainList);
			addRemoveOrReturnSoap = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, toiletriesChoiceSoap, toiletriesChoiceSoap, toiletriesChoiceSoap,
					toiletriesChoiceSoap, toiletriesTS, null, null, null, null, medicalTS, null, null, null, null,
					furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
					addRemoveOrReturnSoap);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnSoap = scanner.nextInt();
			toothpasteWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, toiletriesChoiceSoap, addRemoveOrReturnSoap);
		}
	}

	private static void toiletpaperWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList,
			Toiletries toiletriesChoiceToiletpaper, int addRemoveOrReturnToiletpaper) throws InterruptedException {
		while (addRemoveOrReturnToiletpaper == 1) {
			toiletriesIncrementationOfItemToList(shoppingList, toiletriesChoiceToiletpaper);
			out.println(
					"Toiletpaper added to Basket\nEnter 1 to add another Toiletpaper\nEnter 2 to return to Toiletries list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnToiletpaper = scanner.nextInt();
		}
		if (addRemoveOrReturnToiletpaper == 2) {
			out.println(toiletriesTS);
			int newChoice = scanner.nextInt();
			toiletriesChoiceSwitchMethod(mainList, toiletriesChoiceToiletpaper, toiletriesChoiceToiletpaper,
					toiletriesChoiceToiletpaper, toiletriesChoiceToiletpaper, foodListALsorted, clothesTS, toiletriesTS,
					medicalTS, furnitureTS, otherTS, scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnToiletpaper == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, toiletriesChoiceToiletpaper, toiletriesChoiceToiletpaper,
					toiletriesChoiceToiletpaper, toiletriesChoiceToiletpaper, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList,
					scanner, newChoice);
		} else if (addRemoveOrReturnToiletpaper == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnToiletpaper, shoppingList);
		} else if (addRemoveOrReturnToiletpaper == 5) {
			toiletriesDerementationOfItemToList(shoppingList, toiletriesChoiceToiletpaper);
			System.out.println(mainList);
			addRemoveOrReturnToiletpaper = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, toiletriesChoiceToiletpaper, toiletriesChoiceToiletpaper,
					toiletriesChoiceToiletpaper, toiletriesChoiceToiletpaper, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList,
					scanner, addRemoveOrReturnToiletpaper);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnToiletpaper = scanner.nextInt();
			toothpasteWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, toiletriesChoiceToiletpaper, addRemoveOrReturnToiletpaper);
		}
	}

	private static void deodorantWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList,
			Toiletries toiletriesChoiceDeodrant, int addRemoveOrReturnDeodrant) throws InterruptedException {
		while (addRemoveOrReturnDeodrant == 1) {
			toiletriesIncrementationOfItemToList(shoppingList, toiletriesChoiceDeodrant);
			out.println(
					"Deodrant added to Basket\nEnter 1 to add another Deodrant\nEnter 2 to return to Toiletries list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnDeodrant = scanner.nextInt();
		}
		if (addRemoveOrReturnDeodrant == 2) {
			out.println(toiletriesTS);
			int newChoice = scanner.nextInt();
			toiletriesChoiceSwitchMethod(mainList, toiletriesChoiceDeodrant, toiletriesChoiceDeodrant,
					toiletriesChoiceDeodrant, toiletriesChoiceDeodrant, foodListALsorted, clothesTS, toiletriesTS,
					medicalTS, furnitureTS, otherTS, scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnDeodrant == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, toiletriesChoiceDeodrant, toiletriesChoiceDeodrant,
					toiletriesChoiceDeodrant, toiletriesChoiceDeodrant, toiletriesTS, null, null, null, null, medicalTS,
					null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
					newChoice);
		} else if (addRemoveOrReturnDeodrant == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnDeodrant, shoppingList);
		} else if (addRemoveOrReturnDeodrant == 5) {
			toiletriesDerementationOfItemToList(shoppingList, toiletriesChoiceDeodrant);
			System.out.println(mainList);
			addRemoveOrReturnDeodrant = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, toiletriesChoiceDeodrant, toiletriesChoiceDeodrant,
					toiletriesChoiceDeodrant, toiletriesChoiceDeodrant, toiletriesTS, null, null, null, null, medicalTS,
					null, null, null, null, furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
					addRemoveOrReturnDeodrant);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnDeodrant = scanner.nextInt();
			toothpasteWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, toiletriesChoiceDeodrant, addRemoveOrReturnDeodrant);
		}
	}

	private static void medicalChoiceSwitchMethod(String mainList, Medical paracetamol, Medical antihistamines,
			Medical condoms, Medical coldAndFlu, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, int specificItemChoice)
			throws InterruptedException {
		switch (specificItemChoice) {
		case 401:
			Medical medicalChoiceParacetamol = paracetamol;
			medicalIncrementationOfItemToList(shoppingList, medicalChoiceParacetamol);
			out.println(
					"Paracetamol added to Basket\nEnter 1 to add another box of Paracetamol\nEnter 2 to return to Medical list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnParacetamol = scanner.nextInt();
			paracetamolWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, medicalChoiceParacetamol, addRemoveOrReturnParacetamol);
			break;
		case 402:
			Medical medicalChoiceAntihistamines = antihistamines;
			medicalIncrementationOfItemToList(shoppingList, medicalChoiceAntihistamines);
			out.println(
					"Antihistamines added to Basket\nEnter 1 to add another box of Antihistamines\nEnter 2 to return to Medical list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnAntihistamines = scanner.nextInt();
			antihistaminesWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, medicalChoiceAntihistamines, addRemoveOrReturnAntihistamines);
			break;
		case 403:
			Medical medicalChoiceCondoms = condoms;
			medicalIncrementationOfItemToList(shoppingList, medicalChoiceCondoms);
			out.println(
					"Condoms added to Basket\nEnter 1 to add another packet of Condoms\nEnter 2 to return to Medical list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnCondoms = scanner.nextInt();
			condomsWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, medicalChoiceCondoms, addRemoveOrReturnCondoms);
			break;
		case 404:
			Medical medicalChoiceColdAndFlu = coldAndFlu;
			medicalIncrementationOfItemToList(shoppingList, medicalChoiceColdAndFlu);
			out.println(
					"Cold & Flu added to Basket\nEnter 1 to add another packet of Cold & Flu\nEnter 2 to return to Medical list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnColdAndFlu = scanner.nextInt();
			coldAndFluWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, medicalChoiceColdAndFlu, addRemoveOrReturnColdAndFlu);
			break;
		default:
			out.println(
					"You have not selected an valid option, please select an option from the list or enter '0' to exit.");
			int choice1 = scanner.nextInt();
			switch (choice1) {
			case 0:
				out.println("Thank you, please shop with us again.");
				System.exit(1);
				break;
			default:
				medicalChoiceSwitchMethod(mainList, paracetamol, antihistamines, condoms, coldAndFlu,
						foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS, scanner,
						shoppingList, choice1);
			}
			break;
		}
	}

	private static void paracetamolWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList,
			Medical medicalChoiceParacetamol, int addRemoveOrReturnParacetamol) throws InterruptedException {
		while (addRemoveOrReturnParacetamol == 1) {
			medicalIncrementationOfItemToList(shoppingList, medicalChoiceParacetamol);
			out.println(
					"Paracetamol added to Basket\nEnter 1 to add another Paracetamol\nEnter 2 to return to Medical list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnParacetamol = scanner.nextInt();
		}
		if (addRemoveOrReturnParacetamol == 2) {
			out.println(medicalTS);
			int newChoice = scanner.nextInt();
			medicalChoiceSwitchMethod(mainList, medicalChoiceParacetamol, medicalChoiceParacetamol,
					medicalChoiceParacetamol, medicalChoiceParacetamol, foodListALsorted, clothesTS, toiletriesTS,
					medicalTS, furnitureTS, otherTS, scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnParacetamol == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, medicalChoiceParacetamol,
					medicalChoiceParacetamol, medicalChoiceParacetamol, medicalChoiceParacetamol, medicalTS, null, null,
					null, null, furnitureTS, null, null, null, null, otherTS, shoppingList, scanner, newChoice);
		} else if (addRemoveOrReturnParacetamol == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnParacetamol, shoppingList);
		} else if (addRemoveOrReturnParacetamol == 5) {
			medicalDerementationOfItemToList(shoppingList, medicalChoiceParacetamol);
			System.out.println(mainList);
			addRemoveOrReturnParacetamol = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, medicalChoiceParacetamol,
					medicalChoiceParacetamol, medicalChoiceParacetamol, medicalChoiceParacetamol, medicalTS, null, null,
					null, null, furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
					addRemoveOrReturnParacetamol);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnParacetamol = scanner.nextInt();
			paracetamolWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, medicalChoiceParacetamol, addRemoveOrReturnParacetamol);
		}
	}

	private static void antihistaminesWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList,
			Medical medicalChoiceAntihistamines, int addRemoveOrReturnAntihistamines) throws InterruptedException {
		while (addRemoveOrReturnAntihistamines == 1) {
			medicalIncrementationOfItemToList(shoppingList, medicalChoiceAntihistamines);
			out.println(
					"Antihistamines added to Basket\nEnter 1 to add another packet of Antihistamines\nEnter 2 to return to Medical list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnAntihistamines = scanner.nextInt();
		}
		if (addRemoveOrReturnAntihistamines == 2) {
			out.println(medicalTS);
			int newChoice = scanner.nextInt();
			medicalChoiceSwitchMethod(mainList, medicalChoiceAntihistamines, medicalChoiceAntihistamines,
					medicalChoiceAntihistamines, medicalChoiceAntihistamines, foodListALsorted, clothesTS, toiletriesTS,
					medicalTS, furnitureTS, otherTS, scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnAntihistamines == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS,
					medicalChoiceAntihistamines, medicalChoiceAntihistamines, medicalChoiceAntihistamines,
					medicalChoiceAntihistamines, medicalTS, null, null, null, null, furnitureTS, null, null, null, null,
					otherTS, shoppingList, scanner, newChoice);
		} else if (addRemoveOrReturnAntihistamines == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnAntihistamines, shoppingList);
		} else if (addRemoveOrReturnAntihistamines == 5) {
			medicalDerementationOfItemToList(shoppingList, medicalChoiceAntihistamines);
			System.out.println(mainList);
			addRemoveOrReturnAntihistamines = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS,
					medicalChoiceAntihistamines, medicalChoiceAntihistamines, medicalChoiceAntihistamines,
					medicalChoiceAntihistamines, medicalTS, null, null, null, null, furnitureTS, null, null, null, null,
					otherTS, shoppingList, scanner, addRemoveOrReturnAntihistamines);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnAntihistamines = scanner.nextInt();
			antihistaminesWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS,
					furnitureTS, otherTS, scanner, shoppingList, medicalChoiceAntihistamines,
					addRemoveOrReturnAntihistamines);
		}
	}

	private static void condomsWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList,
			Medical medicalChoiceCondoms, int addRemoveOrReturnCondoms) throws InterruptedException {
		while (addRemoveOrReturnCondoms == 1) {
			medicalIncrementationOfItemToList(shoppingList, medicalChoiceCondoms);
			out.println(
					"Condoms added to Basket\nEnter 1 to add another packet of Condoms\nEnter 2 to return to Medical list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnCondoms = scanner.nextInt();
		}
		if (addRemoveOrReturnCondoms == 2) {
			out.println(medicalTS);
			int newChoice = scanner.nextInt();
			medicalChoiceSwitchMethod(mainList, medicalChoiceCondoms, medicalChoiceCondoms,
					medicalChoiceCondoms, medicalChoiceCondoms, foodListALsorted, clothesTS, toiletriesTS, medicalTS,
					furnitureTS, otherTS, scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnCondoms == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, medicalChoiceCondoms,
					medicalChoiceCondoms, medicalChoiceCondoms, medicalChoiceCondoms, medicalTS, null, null, null, null,
					furnitureTS, null, null, null, null, otherTS, shoppingList, scanner, newChoice);
		} else if (addRemoveOrReturnCondoms == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnCondoms, shoppingList);
		} else if (addRemoveOrReturnCondoms == 5) {
			medicalDerementationOfItemToList(shoppingList, medicalChoiceCondoms);
			System.out.println(mainList);
			addRemoveOrReturnCondoms = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, medicalChoiceCondoms,
					medicalChoiceCondoms, medicalChoiceCondoms, medicalChoiceCondoms, medicalTS, null, null, null, null,
					furnitureTS, null, null, null, null, otherTS, shoppingList, scanner, addRemoveOrReturnCondoms);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnCondoms = scanner.nextInt();
			condomsWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, medicalChoiceCondoms, addRemoveOrReturnCondoms);
		}
	}

	private static void coldAndFluWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList,
			Medical medicalChoiceColdAndFlu, int addRemoveOrReturnColdAndFlu) throws InterruptedException {
		while (addRemoveOrReturnColdAndFlu == 1) {
			medicalIncrementationOfItemToList(shoppingList, medicalChoiceColdAndFlu);
			out.println(
					"Cold & Flu added to Basket\nEnter 1 to add another packet of Cold & Flu\nEnter 2 to return to Medical list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnColdAndFlu = scanner.nextInt();
		}
		if (addRemoveOrReturnColdAndFlu == 2) {
			out.println(medicalTS);
			int newChoice = scanner.nextInt();
			medicalChoiceSwitchMethod(mainList, medicalChoiceColdAndFlu, medicalChoiceColdAndFlu,
					medicalChoiceColdAndFlu, medicalChoiceColdAndFlu, foodListALsorted, clothesTS, toiletriesTS,
					medicalTS, furnitureTS, otherTS, scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnColdAndFlu == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, medicalChoiceColdAndFlu,
					medicalChoiceColdAndFlu, medicalChoiceColdAndFlu, medicalChoiceColdAndFlu, medicalTS, null, null,
					null, null, furnitureTS, null, null, null, null, otherTS, shoppingList, scanner, newChoice);
		} else if (addRemoveOrReturnColdAndFlu == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnColdAndFlu, shoppingList);
		} else if (addRemoveOrReturnColdAndFlu == 5) {
			medicalDerementationOfItemToList(shoppingList, medicalChoiceColdAndFlu);
			System.out.println(mainList);
			addRemoveOrReturnColdAndFlu = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, medicalChoiceColdAndFlu,
					medicalChoiceColdAndFlu, medicalChoiceColdAndFlu, medicalChoiceColdAndFlu, medicalTS, null, null,
					null, null, furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
					addRemoveOrReturnColdAndFlu);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnColdAndFlu = scanner.nextInt();
			coldAndFluWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, medicalChoiceColdAndFlu, addRemoveOrReturnColdAndFlu);
		}
	}

	private static void furnitureChoiceSwitchMethod(String mainList, Furniture couch, Furniture table,
			Furniture kitchen, Furniture lamps, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, int specificItemChoice)
			throws InterruptedException {
		switch (specificItemChoice) {
		case 501:
			Furniture furnitureChoiceCouch = couch;
			furnitureIncrementationOfItemToList(shoppingList, furnitureChoiceCouch);
			out.println(
					"Couch added to Basket\nEnter 1 to add another Couch\nEnter 2 to return to Furniture list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnCouch = scanner.nextInt();
			couchWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, furnitureChoiceCouch, addRemoveOrReturnCouch);
			break;
		case 502:
			Furniture furnitureChoiceTable = table;
			furnitureIncrementationOfItemToList(shoppingList, furnitureChoiceTable);
			out.println(
					"Table added to Basket\nEnter 1 to add another Table\nEnter 2 to return to Furniture list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnTable = scanner.nextInt();
			tableWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, furnitureChoiceTable, addRemoveOrReturnTable);
			break;
		case 503:
			Furniture furnitureChoiceKitchen = kitchen;
			furnitureIncrementationOfItemToList(shoppingList, furnitureChoiceKitchen);
			out.println(
					"Kitchen added to Basket\nEnter 1 to add another Kitchen\nEnter 2 to return to Furniture list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnKitchen = scanner.nextInt();
			kitchenWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, furnitureChoiceKitchen, addRemoveOrReturnKitchen);
			break;
		case 504:
			Furniture furnitureChoiceLamps = lamps;
			furnitureIncrementationOfItemToList(shoppingList, furnitureChoiceLamps);
			out.println(
					"Lamp added to Basket\nEnter 1 to add another Lamp\nEnter 2 to return to Furniture list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnLamps = scanner.nextInt();
			lampsWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, furnitureChoiceLamps, addRemoveOrReturnLamps);
			break;
		default:
			out.println(
					"You have not selected an valid option, please select an option from the list or enter '0' to exit.");
			int choice1 = scanner.nextInt();
			switch (choice1) {
			case 0:
				out.println("Thank you, please shop with us again.");
				System.exit(1);
				break;
			default:
				furnitureChoiceSwitchMethod(mainList, couch, table, kitchen, lamps, foodListALsorted, clothesTS,
						toiletriesTS, medicalTS, furnitureTS, otherTS, scanner, shoppingList, choice1);
			}
			break;
		}
	}

	private static void couchWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, Furniture furnitureChoiceCouch,
			int addRemoveOrReturnCouch) throws InterruptedException {
		while (addRemoveOrReturnCouch == 1) {
			furnitureIncrementationOfItemToList(shoppingList, furnitureChoiceCouch);
			out.println(
					"Couch added to Basket\nEnter 1 to add another Couch\nEnter 2 to return to Furniture list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnCouch = scanner.nextInt();
		}
		if (addRemoveOrReturnCouch == 2) {
			out.println(furnitureTS);
			int newChoice = scanner.nextInt();
			furnitureChoiceSwitchMethod(mainList, furnitureChoiceCouch, furnitureChoiceCouch,
					furnitureChoiceCouch, furnitureChoiceCouch, foodListALsorted, clothesTS, toiletriesTS, medicalTS,
					furnitureTS, otherTS, scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnCouch == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, furnitureChoiceCouch, furnitureChoiceCouch, furnitureChoiceCouch, furnitureChoiceCouch,
					furnitureTS, null, null, null, null, otherTS, shoppingList, scanner, newChoice);
		} else if (addRemoveOrReturnCouch == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnCouch, shoppingList);
		} else if (addRemoveOrReturnCouch == 5) {
			furnitureDerementationOfItemToList(shoppingList, furnitureChoiceCouch);
			System.out.println(mainList);
			addRemoveOrReturnCouch = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, furnitureChoiceCouch, furnitureChoiceCouch, furnitureChoiceCouch, furnitureChoiceCouch,
					furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
					addRemoveOrReturnCouch);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnCouch = scanner.nextInt();
			couchWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, furnitureChoiceCouch, addRemoveOrReturnCouch);
		}
	}

	private static void tableWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList,
			Furniture furnitureChoiceTable, int addRemoveOrReturnTable) throws InterruptedException {
		while (addRemoveOrReturnTable == 1) {
			furnitureIncrementationOfItemToList(shoppingList, furnitureChoiceTable);
			out.println(
					"Table added to Basket\nEnter 1 to add another Table\nEnter 2 to return to Furniture list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnTable = scanner.nextInt();
		}
		if (addRemoveOrReturnTable == 2) {
			out.println(furnitureTS);
			int newChoice = scanner.nextInt();
			furnitureChoiceSwitchMethod(mainList, furnitureChoiceTable, furnitureChoiceTable,
					furnitureChoiceTable, furnitureChoiceTable, foodListALsorted, clothesTS, toiletriesTS, medicalTS,
					furnitureTS, otherTS, scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnTable == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, furnitureChoiceTable, furnitureChoiceTable, furnitureChoiceTable, furnitureChoiceTable,
					furnitureTS, null, null, null, null, otherTS, shoppingList, scanner, newChoice);
		} else if (addRemoveOrReturnTable == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnTable, shoppingList);
		} else if (addRemoveOrReturnTable == 5) {
			furnitureDerementationOfItemToList(shoppingList, furnitureChoiceTable);
			System.out.println(mainList);
			addRemoveOrReturnTable = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, furnitureChoiceTable, furnitureChoiceTable, furnitureChoiceTable, furnitureChoiceTable,
					furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
					addRemoveOrReturnTable);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnTable = scanner.nextInt();
			tableWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS,
					furnitureTS, otherTS, scanner, shoppingList, furnitureChoiceTable, addRemoveOrReturnTable);
		}
	}

	private static void kitchenWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, Furniture furnitureChoiceKitchen,
			int addRemoveOrReturnKitchen) throws InterruptedException {
		while (addRemoveOrReturnKitchen == 1) {
			furnitureIncrementationOfItemToList(shoppingList, furnitureChoiceKitchen);
			out.println(
					"Kitchen added to Basket\nEnter 1 to add another kitchen\nEnter 2 to return to Furniture list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnKitchen = scanner.nextInt();
		}
		if (addRemoveOrReturnKitchen == 2) {
			out.println(furnitureTS);
			int newChoice = scanner.nextInt();
			furnitureChoiceSwitchMethod(mainList, furnitureChoiceKitchen, furnitureChoiceKitchen,
					furnitureChoiceKitchen, furnitureChoiceKitchen, foodListALsorted, clothesTS, toiletriesTS,
					medicalTS, furnitureTS, otherTS, scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnKitchen == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, furnitureChoiceKitchen, furnitureChoiceKitchen, furnitureChoiceKitchen,
					furnitureChoiceKitchen, furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
					newChoice);
		} else if (addRemoveOrReturnKitchen == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnKitchen, shoppingList);
		} else if (addRemoveOrReturnKitchen == 5) {
			furnitureDerementationOfItemToList(shoppingList, furnitureChoiceKitchen);
			System.out.println(mainList);
			addRemoveOrReturnKitchen = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, furnitureChoiceKitchen, furnitureChoiceKitchen, furnitureChoiceKitchen,
					furnitureChoiceKitchen, furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
					addRemoveOrReturnKitchen);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnKitchen = scanner.nextInt();
			kitchenWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, furnitureChoiceKitchen, addRemoveOrReturnKitchen);
		}
	}

	private static void lampsWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, Furniture furnitureChoiceLamps,
			int addRemoveOrReturnLamps) throws InterruptedException {
		while (addRemoveOrReturnLamps == 1) {
			furnitureIncrementationOfItemToList(shoppingList, furnitureChoiceLamps);
			out.println(
					"Lamp added to Basket\nEnter 1 to add another Lamp\nEnter 2 to return to Furniture list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnLamps = scanner.nextInt();
		}
		if (addRemoveOrReturnLamps == 2) {
			out.println(furnitureTS);
			int newChoice = scanner.nextInt();
			furnitureChoiceSwitchMethod(mainList, furnitureChoiceLamps, furnitureChoiceLamps,
					furnitureChoiceLamps, furnitureChoiceLamps, foodListALsorted, clothesTS, toiletriesTS, medicalTS,
					furnitureTS, otherTS, scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnLamps == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, furnitureChoiceLamps, furnitureChoiceLamps, furnitureChoiceLamps, furnitureChoiceLamps,
					furnitureTS, null, null, null, null, otherTS, shoppingList, scanner, newChoice);
		} else if (addRemoveOrReturnLamps == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnLamps, shoppingList);
		} else if (addRemoveOrReturnLamps == 5) {
			furnitureDerementationOfItemToList(shoppingList, furnitureChoiceLamps);
			System.out.println(mainList);
			addRemoveOrReturnLamps = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, furnitureChoiceLamps, furnitureChoiceLamps, furnitureChoiceLamps, furnitureChoiceLamps,
					furnitureTS, null, null, null, null, otherTS, shoppingList, scanner,
					addRemoveOrReturnLamps);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnLamps = scanner.nextInt();
			lampsWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, furnitureChoiceLamps, addRemoveOrReturnLamps);
		}
	}

	private static void otherChoiceSwitchMethod(String mainList, Other flowers, Other petFood, Other toys, Other cards,
			String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, int specificItemChoice)
			throws InterruptedException {
		switch (specificItemChoice) {
		case 601:
			Other otherChoiceFlowers = flowers;
			otherIncrementationOfItemToList(shoppingList, otherChoiceFlowers);
			out.println(
					"Flowers added to Basket\nEnter 1 to add another bouquet of Flowers\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnFlowers = scanner.nextInt();
			flowersWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, otherChoiceFlowers, addRemoveOrReturnFlowers);
			break;
		case 602:
			Other otherChoicePetFood = petFood;
			otherIncrementationOfItemToList(shoppingList, otherChoicePetFood);
			out.println(
					"Pet Food added to Basket\nEnter 1 to add another box of PetFood\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnPetFood = scanner.nextInt();
			petFoodWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, otherChoicePetFood, addRemoveOrReturnPetFood);
			break;
		case 603:
			Other otherChoiceToys = toys;
			otherIncrementationOfItemToList(shoppingList, otherChoiceToys);
			out.println(
					"Toy added to Basket\nEnter 1 to add another Toy\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnToys = scanner.nextInt();
			toysWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, otherChoiceToys, addRemoveOrReturnToys);
			break;
		case 604:
			Other otherChoiceCards = cards;
			otherIncrementationOfItemToList(shoppingList, otherChoiceCards);
			out.println(
					"Card added to Basket\nEnter 1 to add another Card\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			int addRemoveOrReturnCards = scanner.nextInt();
			cardsWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, otherChoiceCards, addRemoveOrReturnCards);
			break;
		default:
			out.println(
					"You have not selected an valid option, please select an option from the list or enter '0' to exit.");
			int choice1 = scanner.nextInt();
			switch (choice1) {
			case 0:
				out.println("Thank you, please shop with us again.");
				System.exit(1);
				break;
			default:
				otherChoiceSwitchMethod(mainList, flowers, petFood, toys, cards,
						foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS, scanner,
						shoppingList, choice1);
			}
			break;
		}
	}

	private static void flowersWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, Other otherChoiceFlowers,
			int addRemoveOrReturnFlowers) throws InterruptedException {
		while (addRemoveOrReturnFlowers == 1) {
			otherIncrementationOfItemToList(shoppingList, otherChoiceFlowers);
			out.println(
					"Flowers added to Basket\nEnter 1 to add another bouquet of Flowers\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnFlowers = scanner.nextInt();
		}
		if (addRemoveOrReturnFlowers == 2) {
			out.println(otherTS);
			int newChoice = scanner.nextInt();
			otherChoiceSwitchMethod(mainList, otherChoiceFlowers, otherChoiceFlowers, otherChoiceFlowers,
					otherChoiceFlowers, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnFlowers == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, otherChoiceFlowers, otherChoiceFlowers,
					otherChoiceFlowers, otherChoiceFlowers, otherTS, shoppingList, scanner, newChoice);
		} else if (addRemoveOrReturnFlowers == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnFlowers, shoppingList);
		} else if (addRemoveOrReturnFlowers == 5) {
			otherDerementationOfItemToList(shoppingList, otherChoiceFlowers);
			System.out.println(mainList);
			addRemoveOrReturnFlowers = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, otherChoiceFlowers, otherChoiceFlowers,
					otherChoiceFlowers, otherChoiceFlowers, otherTS, shoppingList, scanner,
					addRemoveOrReturnFlowers);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnFlowers = scanner.nextInt();
			flowersWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, otherChoiceFlowers, addRemoveOrReturnFlowers);
		}
	}

	private static void petFoodWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList,
			Other otherChoicePetFood, int addRemoveOrReturnPetFood) throws InterruptedException {
		while (addRemoveOrReturnPetFood == 1) {
			otherIncrementationOfItemToList(shoppingList, otherChoicePetFood);
			out.println(
					"Pet Food added to Basket\nEnter 1 to add another box of pet Food\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnPetFood = scanner.nextInt();
		}
		if (addRemoveOrReturnPetFood == 2) {
			out.println(otherTS);
			int newChoice = scanner.nextInt();
			otherChoiceSwitchMethod(mainList, otherChoicePetFood, otherChoicePetFood, otherChoicePetFood,
					otherChoicePetFood, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnPetFood == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, otherChoicePetFood, otherChoicePetFood,
					otherChoicePetFood, otherChoicePetFood, otherTS, shoppingList, scanner, newChoice);
		} else if (addRemoveOrReturnPetFood == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnPetFood, shoppingList);
		} else if (addRemoveOrReturnPetFood == 5) {
			otherDerementationOfItemToList(shoppingList, otherChoicePetFood);
			System.out.println(mainList);
			addRemoveOrReturnPetFood = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, otherChoicePetFood, otherChoicePetFood,
					otherChoicePetFood, otherChoicePetFood, otherTS, shoppingList, scanner,
					addRemoveOrReturnPetFood);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnPetFood = scanner.nextInt();
			petFoodWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, otherChoicePetFood, addRemoveOrReturnPetFood);
		}
	}

	private static void toysWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, Other otherChoiceToys,
			int addRemoveOrReturnToys) throws InterruptedException {
		while (addRemoveOrReturnToys == 1) {
			otherIncrementationOfItemToList(shoppingList, otherChoiceToys);
			out.println(
					"Toy added to Basket\nEnter 1 to add another Toy\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnToys = scanner.nextInt();
		}
		if (addRemoveOrReturnToys == 2) {
			out.println(otherTS);
			int newChoice = scanner.nextInt();
			otherChoiceSwitchMethod(mainList, otherChoiceToys, otherChoiceToys, otherChoiceToys,
					otherChoiceToys, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnToys == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, otherChoiceToys, otherChoiceToys, otherChoiceToys,
					otherChoiceToys, otherTS, shoppingList, scanner, newChoice);
		} else if (addRemoveOrReturnToys == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnToys, shoppingList);
		} else if (addRemoveOrReturnToys == 5) {
			otherDerementationOfItemToList(shoppingList, otherChoiceToys);
			System.out.println(mainList);
			addRemoveOrReturnToys = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, otherChoiceToys, otherChoiceToys, otherChoiceToys,
					otherChoiceToys, otherTS, shoppingList, scanner,
					addRemoveOrReturnToys);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnToys = scanner.nextInt();
			toysWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, otherChoiceToys, addRemoveOrReturnToys);
		}
	}

	private static void cardsWhileIfLoop(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, Map<Item, Integer> shoppingList, Other OtherChoiceCards,
			int addRemoveOrReturnCards) throws InterruptedException {
		while (addRemoveOrReturnCards == 1) {
			otherIncrementationOfItemToList(shoppingList, OtherChoiceCards);
			out.println(
					"Card added to Basket\nEnter 1 to add another Card\nEnter 2 to return to Other list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnCards = scanner.nextInt();
		}
		if (addRemoveOrReturnCards == 2) {
			out.println(otherTS);
			int newChoice = scanner.nextInt();
			otherChoiceSwitchMethod(mainList, OtherChoiceCards, OtherChoiceCards, OtherChoiceCards,
					OtherChoiceCards, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS, otherTS,
					scanner, shoppingList, newChoice);
		} else if (addRemoveOrReturnCards == 3) {
			out.println(mainList);
			int newChoice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, OtherChoiceCards, OtherChoiceCards,
					OtherChoiceCards, OtherChoiceCards, otherTS, shoppingList, scanner, newChoice);
		} else if (addRemoveOrReturnCards == 4) {
			finalPaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, addRemoveOrReturnCards, shoppingList);
		} else if (addRemoveOrReturnCards == 5) {
			otherDerementationOfItemToList(shoppingList, OtherChoiceCards);
			System.out.println(mainList);
			addRemoveOrReturnCards = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null,
					null, null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, OtherChoiceCards, OtherChoiceCards,
					OtherChoiceCards, OtherChoiceCards, otherTS, shoppingList, scanner,
					addRemoveOrReturnCards);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			addRemoveOrReturnCards = scanner.nextInt();
			cardsWhileIfLoop(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, shoppingList, OtherChoiceCards, addRemoveOrReturnCards);
		}
	}

	public static void foodIncrementationOfItemToList(Map<Item, Integer> shoppingList, Food foodChoice) {
		if (shoppingList.containsKey(foodChoice) == false) {
			shoppingList.put(foodChoice, 1);
		} else {
			int numberOfItems = shoppingList.get(foodChoice).intValue();
			numberOfItems++;
			shoppingList.put(foodChoice, numberOfItems);
		}
	}

	public static void foodDerementationOfItemToList(Map<Item, Integer> shoppingList, Food foodChoice) {
		if (shoppingList.containsKey(foodChoice) == true) {
			int numberOfItems = shoppingList.get(foodChoice).intValue();
			numberOfItems--;
			shoppingList.put(foodChoice, numberOfItems);
			System.out.println("Item removed from basket");
		} else {
			System.out.println("This item is not in the basket");
		}
	}

	public static void clothesIncrementationOfItemToList(Map<Item, Integer> shoppingList, Clothes clothesChoice) {
		if (shoppingList.containsKey(clothesChoice) == false) {
			shoppingList.put(clothesChoice, 1);
		} else {
			int numberOfItems = shoppingList.get(clothesChoice).intValue();
			numberOfItems++;
			shoppingList.put(clothesChoice, numberOfItems);
		}
	}

	public static void clothesDerementationOfItemToList(Map<Item, Integer> shoppingList, Clothes clothesChoice) {
		if (shoppingList.containsKey(clothesChoice) == true) {
			int numberOfItems = shoppingList.get(clothesChoice).intValue();
			numberOfItems--;
			shoppingList.put(clothesChoice, numberOfItems);
			System.out.println("Item removed from basket");
		} else {
			System.out.println("This item is not in the basket");
		}
	}

	private static void toiletriesIncrementationOfItemToList(Map<Item, Integer> shoppingList,
			Toiletries toiletriesChoice) {
		if (shoppingList.containsKey(toiletriesChoice) == false) {
			shoppingList.put(toiletriesChoice, 1);
		} else {
			int numberOfItems = shoppingList.get(toiletriesChoice).intValue();
			numberOfItems++;
			shoppingList.put(toiletriesChoice, numberOfItems);
		}
	}

	private static void toiletriesDerementationOfItemToList(Map<Item, Integer> shoppingList,
			Toiletries toiletriesChoice) {
		if (shoppingList.containsKey(toiletriesChoice) == true) {
			int numberOfItems = shoppingList.get(toiletriesChoice).intValue();
			numberOfItems--;
			shoppingList.put(toiletriesChoice, numberOfItems);
			System.out.println("Item removed from basket");
		} else {
			System.out.println("This item is not in the basket");
		}
	}

	private static void medicalIncrementationOfItemToList(Map<Item, Integer> shoppingList, Medical medicalChoice) {
		if (shoppingList.containsKey(medicalChoice) == false) {
			shoppingList.put(medicalChoice, 1);
		} else {
			int numberOfItems = shoppingList.get(medicalChoice).intValue();
			numberOfItems++;
			shoppingList.put(medicalChoice, numberOfItems);
		}
	}

	private static void medicalDerementationOfItemToList(Map<Item, Integer> shoppingList, Medical medicalChoice) {
		if (shoppingList.containsKey(medicalChoice) == true) {
			int numberOfItems = shoppingList.get(medicalChoice).intValue();
			numberOfItems--;
			shoppingList.put(medicalChoice, numberOfItems);
			System.out.println("Item removed from basket");
		} else {
			System.out.println("This item is not in the basket");
		}
	}

	private static void furnitureIncrementationOfItemToList(Map<Item, Integer> shoppingList,
			Furniture furnitureChoice) {
		if (shoppingList.containsKey(furnitureChoice) == false) {
			shoppingList.put(furnitureChoice, 1);
		} else {
			int numberOfItems = shoppingList.get(furnitureChoice).intValue();
			numberOfItems++;
			shoppingList.put(furnitureChoice, numberOfItems);
		}
	}

	private static void furnitureDerementationOfItemToList(Map<Item, Integer> shoppingList, Furniture furnitureChoice) {
		if (shoppingList.containsKey(furnitureChoice) == true) {
			int numberOfItems = shoppingList.get(furnitureChoice).intValue();
			numberOfItems--;
			shoppingList.put(furnitureChoice, numberOfItems);
			System.out.println("Item removed from basket");
		} else {
			System.out.println("This item is not in the basket");
		}
	}

	private static void otherIncrementationOfItemToList(Map<Item, Integer> shoppingList, Other otherChoice) {
		if (shoppingList.containsKey(otherChoice) == false) {
			shoppingList.put(otherChoice, 1);
		} else {
			int numberOfItems = shoppingList.get(otherChoice).intValue();
			numberOfItems++;
			shoppingList.put(otherChoice, numberOfItems);
		}
	}

	private static void otherDerementationOfItemToList(Map<Item, Integer> shoppingList, Other otherChoice) {
		if (shoppingList.containsKey(otherChoice) == true) {
			int numberOfItems = shoppingList.get(otherChoice).intValue();
			numberOfItems--;
			shoppingList.put(otherChoice, numberOfItems);
			System.out.println("Item removed from basket");
		} else {
			System.out.println("This item is not in the basket");
		}
	}

	private static void totalPriceCalc(Map<Item, Integer> shoppingList) {
		BigDecimal totalPrice = new BigDecimal(0);
		for (Map.Entry<Item, Integer> shoppingListCollection : shoppingList.entrySet()) {
			BigDecimal itemPrice = shoppingListCollection.getKey().getPrice();
			BigDecimal numberOfItemBD = new BigDecimal(shoppingListCollection.getValue());
			BigDecimal multipliedPrice = itemPrice.multiply(numberOfItemBD);
			totalPrice = totalPrice.add(multipliedPrice);
		}
		System.out.println("£" + totalPrice);// potential for functional programming 227
	}

	private static void finalPaymentMethod(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
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

	private static void repeatFinalpaymentMethod(String mainList, String foodListALsorted, TreeSet<Clothes> clothesTS,
			TreeSet<Toiletries> toiletriesTS, TreeSet<Medical> medicalTS, TreeSet<Furniture> furnitureTS,
			TreeSet<Other> otherTS, Scanner scanner, int choice) throws InterruptedException {
		String confirmChoice = scanner.next();
		if (confirmChoice.equals("y") || confirmChoice.equals("Y")) {
			System.out.println("Purchase complete. Thank you, please shop with us again.");
		} else if (confirmChoice.equals("n") || confirmChoice.equals("N")) {
			System.out.println(mainList);
			choice = scanner.nextInt();
			mainMenuOptions(mainList, null, null, null, null, null, null, null, null, foodListALsorted, null, null,
					null, null, null, clothesTS, null, null, null, null, toiletriesTS, null, null, null, null,
					medicalTS, null, null, null, null, furnitureTS, null, null, null, null, otherTS, null, scanner,
					choice);
		} else {
			System.out.println("You have not selected a valid option, please try again");
			confirmChoice = scanner.next();
			repeatFinalpaymentMethod(mainList, foodListALsorted, clothesTS, toiletriesTS, medicalTS, furnitureTS,
					otherTS, scanner, choice);
		}
	}

		// JOANNAAAAA Why can't i do the below? Wanted to have all of the sets in a set
		// so could then just call the 'master' set.
		// Is it because the sets within are of different types? i.e. food/ clothing
		// etc? If so, would turning them all into Generics help?

		// Set<Set<Item>> fullItemSet = new HashSet<Set<Item>>();
		// fullItemSet.add(foodSet, clothesSet, toiletriesSet, medicalSet, furnitureSet,
		// otherSet);

		// Tried to have the last scanner as a "Y" or "N" but it wouldn't work, was
		// acting as if i hadn't entered the correct option...

		// Always have a proceed to checkout option / view basket + continue shopping
		// If the amount doesn't match exactly, try again
		// Once completed finish

}
