package checkOutSystem;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class CheckOutSystemRunnerV4 {

	public static void main(String[] args) throws InterruptedException {

		out.println(
				"Welcome to your General Store, please search for the items you wish\nto purchase by entering the number of the corresponding category:");
		Thread.sleep(1000);

		// Map<Item, Integer> shoppingList = new TreeMap<>();
		Scanner scanner = new Scanner(in);

		MainMenuOptionsMethod.mainMenuOptions();

		scanner.close();
		System.exit(1);
	}
}
