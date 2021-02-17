package checkOutSystem.ifMethods;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.TreeMap;

import checkOutSystem.MainMenuOptionsMethod;
import checkOutSystem.choiceSwitchMethods.MedicalChoiceSwitchMethod;
import checkOutSystem.items.Furniture;
import checkOutSystem.items.Item;
import checkOutSystem.listCreators.FurnitureListCreator;
import checkOutSystem.listCreators.MedicalListCreator;
import checkOutSystem.mapScannerComparatorPaymentmethods.IncrementorDecrementorMethods;
import checkOutSystem.mapScannerComparatorPaymentmethods.MapShoppingList;
import checkOutSystem.mapScannerComparatorPaymentmethods.PriceCalcAndPayment;
import checkOutSystem.mapScannerComparatorPaymentmethods.ScannerClass;

public class FurnitureIfMethods {

	public static void couchWhileIfLoop() throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		try {
		int addRemoveOrReturnCouch = ScannerClass.scanner.nextInt();
		Furniture furnitureChoiceCouch = FurnitureListCreator.getCouch();
		while (addRemoveOrReturnCouch == 1) {
			IncrementorDecrementorMethods.furnitureIncrementationOfItemToList(shoppingList, furnitureChoiceCouch);
			out.println(
					"Couch added to Basket\nEnter 1 to add another Couch\nEnter 2 to return to Furniture list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnCouch = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnCouch == 2) {
			out.println(MedicalListCreator.create());
			MedicalChoiceSwitchMethod.medicalChoiceSwitchMethod();
		} else if (addRemoveOrReturnCouch == 3) {
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else if (addRemoveOrReturnCouch == 4) {
			PriceCalcAndPayment.finalPaymentMethod();
		} else if (addRemoveOrReturnCouch == 5) {
			IncrementorDecrementorMethods.furnitureDerementationOfItemToList(shoppingList, furnitureChoiceCouch);
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("Invalid input, please choose a valid option");
			FurnitureIfMethods.couchWhileIfLoop();
		}
	} catch (InputMismatchException e) {
	}
	}

	public static void tableWhileIfLoop() throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		try {
		int addRemoveOrReturntable = ScannerClass.scanner.nextInt();
		Furniture furnitureChoicetable = FurnitureListCreator.getTable();
		while (addRemoveOrReturntable == 1) {
			IncrementorDecrementorMethods.furnitureIncrementationOfItemToList(shoppingList, furnitureChoicetable);
			out.println(
					"Table added to Basket\nEnter 1 to add another Table\nEnter 2 to return to Furniture list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturntable = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturntable == 2) {
			out.println(MedicalListCreator.create());
			MedicalChoiceSwitchMethod.medicalChoiceSwitchMethod();
		} else if (addRemoveOrReturntable == 3) {
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else if (addRemoveOrReturntable == 4) {
			PriceCalcAndPayment.finalPaymentMethod();
		} else if (addRemoveOrReturntable == 5) {
			IncrementorDecrementorMethods.furnitureDerementationOfItemToList(shoppingList, furnitureChoicetable);
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("Invalid input, please choose a valid option");
			FurnitureIfMethods.tableWhileIfLoop();
		}
	} catch (InputMismatchException e) {
	}
	}

	public static void kitchenWhileIfLoop() throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		try {
		int addRemoveOrReturnKitchen = ScannerClass.scanner.nextInt();
		Furniture furnitureChoiceKitchen = FurnitureListCreator.getKitchen();
		while (addRemoveOrReturnKitchen == 1) {
			IncrementorDecrementorMethods.furnitureIncrementationOfItemToList(shoppingList, furnitureChoiceKitchen);
			out.println(
					"Kitchen added to Basket\nEnter 1 to add another Kitchen\nEnter 2 to return to Furniture list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnKitchen = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnKitchen == 2) {
			out.println(MedicalListCreator.create());
			MedicalChoiceSwitchMethod.medicalChoiceSwitchMethod();
		} else if (addRemoveOrReturnKitchen == 3) {
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else if (addRemoveOrReturnKitchen == 4) {
			PriceCalcAndPayment.finalPaymentMethod();
		} else if (addRemoveOrReturnKitchen == 5) {
			IncrementorDecrementorMethods.furnitureDerementationOfItemToList(shoppingList, furnitureChoiceKitchen);
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("Invalid input, please choose a valid option");
			FurnitureIfMethods.kitchenWhileIfLoop();
		}
	} catch (InputMismatchException e) {
	}
	}

	public static void lampWhileIfLoop() throws InterruptedException {
		MapShoppingList shopList = new MapShoppingList();
		TreeMap<Item, Integer> shoppingList = shopList.getShoppingList();
		try {
		int addRemoveOrReturnLamp = ScannerClass.scanner.nextInt();
		Furniture furnitureChoiceLamp = FurnitureListCreator.getLamp();
		while (addRemoveOrReturnLamp == 1) {
			IncrementorDecrementorMethods.furnitureIncrementationOfItemToList(shoppingList, furnitureChoiceLamp);
			out.println(
					"Lamp added to Basket\nEnter 1 to add another Lamp\nEnter 2 to return to Furniture list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnLamp = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnLamp == 2) {
			out.println(MedicalListCreator.create());
			MedicalChoiceSwitchMethod.medicalChoiceSwitchMethod();
		} else if (addRemoveOrReturnLamp == 3) {
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else if (addRemoveOrReturnLamp == 4) {
			PriceCalcAndPayment.finalPaymentMethod();
		} else if (addRemoveOrReturnLamp == 5) {
			IncrementorDecrementorMethods.furnitureDerementationOfItemToList(shoppingList, furnitureChoiceLamp);
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions();
		} else {
			System.out.println("Invalid input, please choose a valid option");
			FurnitureIfMethods.lampWhileIfLoop();
		}
	} catch (InputMismatchException e) {
	}
	}

}
