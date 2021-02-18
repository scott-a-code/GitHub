package checkOutSystem.ifMethods;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.TreeMap;

import checkOutSystem.MainMenuOptionsMethod;
import checkOutSystem.choiceSwitchMethods.MedicalChoiceSwitchMethod;
import checkOutSystem.items.Item;
import checkOutSystem.items.Medical;
import checkOutSystem.listCreators.MedicalListCreator;
import checkOutSystem.mapScannerComparatorPaymentmethods.IncrementorDecrementorMethods;
import checkOutSystem.mapScannerComparatorPaymentmethods.PriceCalcAndPayment;
import checkOutSystem.mapScannerComparatorPaymentmethods.ScannerClass;

public class MedicalIfMethods {

	public static void paracetamolWhileIfLoop(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		try {
		int addRemoveOrReturnParacetamol = ScannerClass.scanner.nextInt();
		Medical medicalChoiceParacetamol = MedicalListCreator.getParacetamol();
		while (addRemoveOrReturnParacetamol == 1) {
			IncrementorDecrementorMethods.medicalIncrementationOfItemToList(shoppingList, medicalChoiceParacetamol);
			out.println(
					"Paracetamol added to Basket\nEnter 1 to add another box of Paracetamol\nEnter 2 to return to Medical list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnParacetamol = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnParacetamol == 2) {
			out.println(MedicalListCreator.create());
			MedicalChoiceSwitchMethod.medicalChoiceSwitchMethod(shoppingList);
		} else if (addRemoveOrReturnParacetamol == 3) {
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else if (addRemoveOrReturnParacetamol == 4) {
			PriceCalcAndPayment.finalPaymentMethod(shoppingList);
		} else if (addRemoveOrReturnParacetamol == 5) {
			IncrementorDecrementorMethods.medicalDerementationOfItemToList(shoppingList, medicalChoiceParacetamol);
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			MedicalIfMethods.paracetamolWhileIfLoop(shoppingList);
		}
	} catch (InputMismatchException e) {
	}
	}

	public static void antihistaminesWhileIfLoop(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		try {
		int addRemoveOrReturnAntihistamines = ScannerClass.scanner.nextInt();
		Medical medicalChoiceAntihistamines = MedicalListCreator.getAntihistamines();
		while (addRemoveOrReturnAntihistamines == 1) {
			IncrementorDecrementorMethods.medicalIncrementationOfItemToList(shoppingList, medicalChoiceAntihistamines);
			out.println(
					"Antihistamines added to Basket\nEnter 1 to add another box of Antihistamines\nEnter 2 to return to Medical list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnAntihistamines = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnAntihistamines == 2) {
			out.println(MedicalListCreator.create());
			MedicalChoiceSwitchMethod.medicalChoiceSwitchMethod(shoppingList);
		} else if (addRemoveOrReturnAntihistamines == 3) {
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else if (addRemoveOrReturnAntihistamines == 4) {
			PriceCalcAndPayment.finalPaymentMethod(shoppingList);
		} else if (addRemoveOrReturnAntihistamines == 5) {
			IncrementorDecrementorMethods.medicalDerementationOfItemToList(shoppingList, medicalChoiceAntihistamines);
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			MedicalIfMethods.antihistaminesWhileIfLoop(shoppingList);
		}
	} catch (InputMismatchException e) {
	}
	}

	public static void condomsWhileIfLoop(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		try {
		int addRemoveOrReturnCondoms = ScannerClass.scanner.nextInt();
		Medical medicalChoiceCondoms = MedicalListCreator.getCondoms();
		while (addRemoveOrReturnCondoms == 1) {
			IncrementorDecrementorMethods.medicalIncrementationOfItemToList(shoppingList, medicalChoiceCondoms);
			out.println(
					"Condoms added to Basket\nEnter 1 to add another packet of Condoms\nEnter 2 to return to Medical list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnCondoms = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnCondoms == 2) {
			out.println(MedicalListCreator.create());
			MedicalChoiceSwitchMethod.medicalChoiceSwitchMethod(shoppingList);
		} else if (addRemoveOrReturnCondoms == 3) {
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else if (addRemoveOrReturnCondoms == 4) {
			PriceCalcAndPayment.finalPaymentMethod(shoppingList);
		} else if (addRemoveOrReturnCondoms == 5) {
			IncrementorDecrementorMethods.medicalDerementationOfItemToList(shoppingList, medicalChoiceCondoms);
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			MedicalIfMethods.condomsWhileIfLoop(shoppingList);
		}
	} catch (InputMismatchException e) {
	}
	}

	public static void coldAndFluWhileIfLoop(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		try {
		int addRemoveOrReturnColdAndFlu = ScannerClass.scanner.nextInt();
		Medical medicalChoiceColdAndFlu = MedicalListCreator.getColdAndFlu();
		while (addRemoveOrReturnColdAndFlu == 1) {
			IncrementorDecrementorMethods.medicalIncrementationOfItemToList(shoppingList, medicalChoiceColdAndFlu);
			out.println(
					"Cold & Flu added to Basket\nEnter 1 to add another packet of Cold & Flu\nEnter 2 to return to Medical list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			addRemoveOrReturnColdAndFlu = ScannerClass.scanner.nextInt();
		}
		if (addRemoveOrReturnColdAndFlu == 2) {
			out.println(MedicalListCreator.create());
			MedicalChoiceSwitchMethod.medicalChoiceSwitchMethod(shoppingList);
		} else if (addRemoveOrReturnColdAndFlu == 3) {
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else if (addRemoveOrReturnColdAndFlu == 4) {
			PriceCalcAndPayment.finalPaymentMethod(shoppingList);
		} else if (addRemoveOrReturnColdAndFlu == 5) {
			IncrementorDecrementorMethods.medicalDerementationOfItemToList(shoppingList, medicalChoiceColdAndFlu);
			out.println(MedicalListCreator.create());
			MainMenuOptionsMethod.mainMenuOptions(shoppingList);
		} else {
			System.out.println("Invalid input, please choose a valid option");
			MedicalIfMethods.coldAndFluWhileIfLoop(shoppingList);
		}
	} catch (InputMismatchException e) {
	}
	}

}
