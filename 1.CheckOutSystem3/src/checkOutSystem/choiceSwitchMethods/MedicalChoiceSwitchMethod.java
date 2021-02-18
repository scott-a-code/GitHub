package checkOutSystem.choiceSwitchMethods;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.TreeMap;

import checkOutSystem.ifMethods.MedicalIfMethods;
import checkOutSystem.items.Item;
import checkOutSystem.items.Medical;
import checkOutSystem.listCreators.MedicalListCreator;
import checkOutSystem.mapScannerComparatorPaymentmethods.IncrementorDecrementorMethods;
import checkOutSystem.mapScannerComparatorPaymentmethods.ScannerClass;

public class MedicalChoiceSwitchMethod {

	public static void medicalChoiceSwitchMethod(TreeMap<Item, Integer> shoppingList) throws InterruptedException {
		try {
		int specificItemChoice = ScannerClass.scanner.nextInt();
		switch (specificItemChoice) {
		case 401:
			Medical medicalChoiceParacetamol = MedicalListCreator.getParacetamol();
			IncrementorDecrementorMethods.medicalIncrementationOfItemToList(shoppingList, medicalChoiceParacetamol);
			out.println(
					"Paracetamol added to Basket\nEnter 1 to add another box of Paracetamol\nEnter 2 to return to Medical list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			MedicalIfMethods.paracetamolWhileIfLoop(shoppingList);
			break;
		case 402:
			Medical medicalChoiceAntihistamines = MedicalListCreator.getAntihistamines();
			IncrementorDecrementorMethods.medicalIncrementationOfItemToList(shoppingList, medicalChoiceAntihistamines);
			out.println(
					"Antihistamines added to Basket\nEnter 1 to add another box of Antihistamines\nEnter 2 to return to Medical list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			MedicalIfMethods.antihistaminesWhileIfLoop(shoppingList);
		case 403:
			Medical medicalChoiceCondoms = MedicalListCreator.getCondoms();
			IncrementorDecrementorMethods.medicalIncrementationOfItemToList(shoppingList, medicalChoiceCondoms);
			out.println(
					"Condoms added to Basket\nEnter 1 to add another packet of Condoms\nEnter 2 to return to Medical list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			MedicalIfMethods.condomsWhileIfLoop(shoppingList);
		case 404:
			Medical medicalChoiceColdAndFlu = MedicalListCreator.getColdAndFlu();
			IncrementorDecrementorMethods.medicalIncrementationOfItemToList(shoppingList, medicalChoiceColdAndFlu);
			out.println(
					"Cold & Flu added to Basket\nEnter 1 to add another packet of Cold & Flu\nEnter 2 to return to Medical list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			MedicalIfMethods.coldAndFluWhileIfLoop(shoppingList);

		default:
			out.println(
					"You have not selected an valid option, please select an option from the list or enter '0' to exit.");
			int choice1 = ScannerClass.scanner.nextInt();
			switch (choice1) {
			case 0:
				out.println("Thank you, please shop with us again.");
				System.exit(1);
				break;
			default:
				MedicalChoiceSwitchMethod.medicalChoiceSwitchMethod(shoppingList, choice1);
			}
			break;
		}
	} catch (InputMismatchException e) {
	}
}

	// overloaded method
	public static void medicalChoiceSwitchMethod(TreeMap<Item, Integer> shoppingList, int choice1)
			throws InterruptedException {
		try {
		switch (choice1) {
		case 401:
			Medical medicalChoiceParacetamol = MedicalListCreator.getParacetamol();
			IncrementorDecrementorMethods.medicalIncrementationOfItemToList(shoppingList, medicalChoiceParacetamol);
			out.println(
					"Paracetamol added to Basket\nEnter 1 to add another box of Paracetamol\nEnter 2 to return to Medical list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			MedicalIfMethods.paracetamolWhileIfLoop(shoppingList);
			break;
		case 402:
			Medical medicalChoiceAntihistamines = MedicalListCreator.getAntihistamines();
			IncrementorDecrementorMethods.medicalIncrementationOfItemToList(shoppingList, medicalChoiceAntihistamines);
			out.println(
					"Antihistamines added to Basket\nEnter 1 to add another box of Antihistamines\nEnter 2 to return to Medical list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			MedicalIfMethods.antihistaminesWhileIfLoop(shoppingList);
		case 403:
			Medical medicalChoiceCondoms = MedicalListCreator.getCondoms();
			IncrementorDecrementorMethods.medicalIncrementationOfItemToList(shoppingList, medicalChoiceCondoms);
			out.println(
					"Condoms added to Basket\nEnter 1 to add another packet of Condoms\nEnter 2 to return to Medical list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			MedicalIfMethods.condomsWhileIfLoop(shoppingList);
		case 404:
			Medical medicalChoiceColdAndFlu = MedicalListCreator.getColdAndFlu();
			IncrementorDecrementorMethods.medicalIncrementationOfItemToList(shoppingList, medicalChoiceColdAndFlu);
			out.println(
					"Cold & Flu added to Basket\nEnter 1 to add another packet of Cold & Flu\nEnter 2 to return to Medical list\nEnter 3 to return to the General item list\nEnter 4 to procced to checkout\nEnter 5 to remove item");
			MedicalIfMethods.coldAndFluWhileIfLoop(shoppingList);

		default:
			out.println(
					"You have not selected an valid option, please select an option from the list or enter '0' to exit.");
			choice1 = ScannerClass.scanner.nextInt();
			switch (choice1) {
			case 0:
				out.println("Thank you, please shop with us again.");
				System.exit(1);
				break;
			default:
				MedicalChoiceSwitchMethod.medicalChoiceSwitchMethod(shoppingList, choice1);
			}
			break;
		}
	} catch (InputMismatchException e) {
	}
	}
}