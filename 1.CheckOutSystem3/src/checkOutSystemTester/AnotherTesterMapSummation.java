package checkOutSystemTester;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

import checkOutSystem.items.Food;

public class AnotherTesterMapSummation {

	public static void main(String[] args) {

		LocalDate foodExpiryDate = LocalDate.now();
		Food soup = new Food(107, "Soup", BigDecimal.valueOf(0.89), foodExpiryDate.plusYears(2));
		Food cereal = new Food(103, "Cereal", BigDecimal.valueOf(1.15), foodExpiryDate.plusDays(31));
		Food eggs = new Food(104, "Eggs", BigDecimal.valueOf(1.15), foodExpiryDate.plusDays(7));
		Food pasta = new Food(106, "Pasta", BigDecimal.valueOf(2.19), foodExpiryDate.plusYears(5));
		Food bread = new Food(101, "Bread", new BigDecimal("0.99"), foodExpiryDate.plusDays(6));
		Food milk = new Food(102, "Milk", BigDecimal.valueOf(0.91), foodExpiryDate.plusDays(9));

		Map<Food, Integer> shoppingListTester = new TreeMap<>();
		shoppingListTester.put(bread, 1);
		shoppingListTester.put(soup, 4);
		shoppingListTester.put(eggs, 6);
		shoppingListTester.put(pasta, 2);
		shoppingListTester.put(cereal, 2);
		shoppingListTester.put(milk, 1);

		// System.out.println(shoppingListTester);
		// System.out.println(shoppingListTester.values());
		BigDecimal totalPrice = new BigDecimal(0);
		for (Map.Entry<Food, Integer> shoppingListCollection : shoppingListTester.entrySet()) {
			BigDecimal itemPrice = shoppingListCollection.getKey().getPrice();
			BigDecimal numberOfItemBD = new BigDecimal(shoppingListCollection.getValue());
			BigDecimal multipliedPrice = itemPrice.multiply(numberOfItemBD);
			totalPrice = totalPrice.add(multipliedPrice);
		}
		System.out.println("£" + totalPrice);
	}
}
