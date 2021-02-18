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
import checkOutSystem.mapScannerComparatorPaymentmethods.PriceCalcAndPayment;
import checkOutSystem.mapScannerComparatorPaymentmethods.ScannerClass;

public class FurnitureIfMethods {

	public static void couchWhileIfLoop(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
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
			MedicalChoiceSwitchMethod.medicalChoiceSwitchMethod(shoppingList);
		} else if (addRemoveOrReturnCouch == 3) {
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else if (addRemoveOrReturnCouch == 4) {
			PriceCalcAndPayment.finalPaymentMethod(shoppingList);
		} else if (addRemoveOrReturnCouch == 5) {
			IncrementorDecrementorMethods.furnitureDerementationOfItemToList(shoppingList, furnitureChoiceCouch);
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			FurnitureIfMethods.couchWhileIfLoop(shoppingList);
		}
	} catch (InputMismatchException e) {
	}
	}

	public static void tableWhileIfLoop(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
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
			MedicalChoiceSwitchMethod.medicalChoiceSwitchMethod(shoppingList);
		} else if (addRemoveOrReturntable == 3) {
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else if (addRemoveOrReturntable == 4) {
			PriceCalcAndPayment.finalPaymentMethod(shoppingList);
		} else if (addRemoveOrReturntable == 5) {
			IncrementorDecrementorMethods.furnitureDerementationOfItemToList(shoppingList, furnitureChoicetable);
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			FurnitureIfMethods.tableWhileIfLoop(shoppingList);
		}
	} catch (InputMismatchException e) {
	}
	}

	public static void kitchenWhileIfLoop(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
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
			MedicalChoiceSwitchMethod.medicalChoiceSwitchMethod(shoppingList);
		} else if (addRemoveOrReturnKitchen == 3) {
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else if (addRemoveOrReturnKitchen == 4) {
			PriceCalcAndPayment.finalPaymentMethod(shoppingList);
		} else if (addRemoveOrReturnKitchen == 5) {
			IncrementorDecrementorMethods.furnitureDerementationOfItemToList(shoppingList, furnitureChoiceKitchen);
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			FurnitureIfMethods.kitchenWhileIfLoop(shoppingList);
		}
	} catch (InputMismatchException e) {
	}
	}

	public static void lampWhileIfLoop(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
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
			MedicalChoiceSwitchMethod.medicalChoiceSwitchMethod(shoppingList);
		} else if (addRemoveOrReturnLamp == 3) {
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else if (addRemoveOrReturnLamp == 4) {
			PriceCalcAndPayment.finalPaymentMethod(shoppingList);
		} else if (addRemoveOrReturnLamp == 5) {
			IncrementorDecrementorMethods.furnitureDerementationOfItemToList(shoppingList, furnitureChoiceLamp);
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			FurnitureIfMethods.lampWhileIfLoop(shoppingList);
		}
	} catch (InputMismatchException e) {
	}
	}

}
