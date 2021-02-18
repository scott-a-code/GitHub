package checkOutSystem;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.TreeMap;

import checkOutSystem.choiceSwitchMethods.ClothesChoiceSwitchMethod;
import checkOutSystem.choiceSwitchMethods.FoodChoiceSwitchMethod;
import checkOutSystem.choiceSwitchMethods.FurnitureChoiceSwitchMethod;
import checkOutSystem.choiceSwitchMethods.MedicalChoiceSwitchMethod;
import checkOutSystem.choiceSwitchMethods.OtherChoiceSwitchMethod;
import checkOutSystem.choiceSwitchMethods.ToiletriesChoiceSwitchMethod;
import checkOutSystem.items.Item;
import checkOutSystem.listCreators.ClothesListCreator;
import checkOutSystem.listCreators.FoodListCreator;
import checkOutSystem.listCreators.FurnitureListCreator;
import checkOutSystem.listCreators.MedicalListCreator;
import checkOutSystem.listCreators.OtherListCreator;
import checkOutSystem.listCreators.ToiletriesListCreator;
import checkOutSystem.mapScannerComparatorPaymentmethods.MapShoppingList;
import checkOutSystem.mapScannerComparatorPaymentmethods.ScannerClass;

public class MainMenuOptionsMethod {
	
	static String mainList = "Food - 1 \nClothing - 2 \nToiletries - 3 \nMedical products - 4 \nFurniture - 5 \nOther - 6";

	public static void mainMenuOptions() throws InterruptedException {
		out.println(mainList);
		try {
		int choice = ScannerClass.scanner.nextInt();
		TreeMap<Item, Integer> shoppingList = new MapShoppingList().getShoppingList();
		switch (choice) {
		case 1:
			out.println(
					"You have selected Food(1) \nPlease enter the ID number of the item you wish to purchase from the following list:");
			Thread.sleep(1000);
			out.println(FoodListCreator.create());
			FoodChoiceSwitchMethod.foodChoiceSwitchMethod(shoppingList);
			break;
		case 2:
			out.println(
					"You have selected Clothing(2) \nPlease enter the ID number of the item you wish to purchase from the following list:");
			Thread.sleep(1000);
			out.println(ClothesListCreator.create());
			ClothesChoiceSwitchMethod.clothesChoiceSwitchMethod(shoppingList);
			break;
		case 3:
			out.println(
					"You have selected Toiletries(3) \nPlease enter the ID number of the item you wish to purchase from the following list:");
			Thread.sleep(1000);
			out.println(ToiletriesListCreator.create());
			ToiletriesChoiceSwitchMethod.toiletriesChoiceSwitchMethod(shoppingList);
			break;
		case 4:
			out.println(
					"You have selected Medical products(4) \nPlease enter the ID number of the item you wish to purchase from the following list:");
			Thread.sleep(1000);
			out.println(MedicalListCreator.create());
			MedicalChoiceSwitchMethod.medicalChoiceSwitchMethod(shoppingList);
			break;
		case 5:
			out.println(
					"You have selected Furniture(5) \nPlease enter the ID number of the item you wish to purchase from the following list:");
			Thread.sleep(1000);
			out.println(FurnitureListCreator.create());
			FurnitureChoiceSwitchMethod.furnitureChoiceSwitchMethod(shoppingList);
			break;
		case 6:
			out.println(
					"You have selected Other(6) \nPlease enter the ID number of the item you wish to purchase from the following list:");
			Thread.sleep(1000);
			out.println(OtherListCreator.create());
			OtherChoiceSwitchMethod.otherChoiceSwitchMethod(shoppingList);
			break;
		default:
			out.println(
					"You have not selected an valid option, please select an option from the list or enter '0' to exit");
			int choice1 = ScannerClass.scanner.nextInt();
			switch (choice1) {
			case 0:
				out.println("Thank you, please shop with us again.");
				System.exit(1);
				break;
			default:
				MainMenuOptionsMethod.mainMenuOptions(shoppingList, choice1);
			}
			break;
		}
	} catch (InputMismatchException e) {

	}
	}

	// overloaded method
	public static void mainMenuOptions(TreeMap<Item, Integer> shoppingList, int choice1) throws InterruptedException {
		switch (choice1) {
		case 1:
			out.println(
					"You have selected Food(1) \nPlease enter the ID number of the item you wish to purchase from the following list:");
			Thread.sleep(1000);
			out.println(FoodListCreator.create());
			FoodChoiceSwitchMethod.foodChoiceSwitchMethod(shoppingList);
			break;
		case 2:
			out.println(
					"You have selected Clothing(2) \nPlease enter the ID number of the item you wish to purchase from the following list:");
			Thread.sleep(1000);
			out.println(ClothesListCreator.create());
			ClothesChoiceSwitchMethod.clothesChoiceSwitchMethod(shoppingList);
			break;
		case 3:
			out.println(
					"You have selected Toiletries(3) \nPlease enter the ID number of the item you wish to purchase from the following list:");
			Thread.sleep(1000);
			out.println(ToiletriesListCreator.create());
			ToiletriesChoiceSwitchMethod.toiletriesChoiceSwitchMethod(shoppingList);
			break;
		case 4:
			out.println(
					"You have selected Medical products(4) \nPlease enter the ID number of the item you wish to purchase from the following list:");
			Thread.sleep(1000);
			out.println(MedicalListCreator.create());
			MedicalChoiceSwitchMethod.medicalChoiceSwitchMethod(shoppingList);
			break;
		case 5:
			out.println(
					"You have selected Furniture(5) \nPlease enter the ID number of the item you wish to purchase from the following list:");
			Thread.sleep(1000);
			out.println(FurnitureListCreator.create());
			FurnitureChoiceSwitchMethod.furnitureChoiceSwitchMethod(shoppingList);
			break;
		case 6:
			out.println(
					"You have selected Other(6) \nPlease enter the ID number of the item you wish to purchase from the following list:");
			Thread.sleep(1000);
			out.println(OtherListCreator.create());
			OtherChoiceSwitchMethod.otherChoiceSwitchMethod(shoppingList);
			break;
		default:
			out.println(
					"You have not selected an valid option, please select an option from the list or enter '0' to exit");
			choice1 = ScannerClass.scanner.nextInt();
			switch (choice1) {
			case 0:
				out.println("Thank you, please shop with us again.");
				System.exit(1);
				break;
			default:
				MainMenuOptionsMethod.mainMenuOptions(shoppingList, choice1);
			}
			break;
		}
	}
}
