package checkOutSystem;

import static java.lang.System.out;

import java.util.InputMismatchException;

public class CheckOutSystemRunnerV4 {

	public static void main(String[] args) throws InterruptedException {

		out.println(
				"Welcome to your General Store, please search for the items you wish\nto purchase by entering the number of the corresponding category:");
		Thread.sleep(1000);

		try {
		MainMenuOptionsMethod.mainMenuOptions();
		} catch (InputMismatchException e) {
			// no printing of stack trace as application is designed for end user.
		}
		System.exit(1);
	}
}
