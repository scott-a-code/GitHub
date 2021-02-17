package checkOutSystem.listCreators;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import checkOutSystem.items.Food;
import checkOutSystem.items.Item;

class IdComparator implements Comparator<Item> {

	@Override
	public int compare(Item item1, Item item2) {
		return Integer.compare(item1.getId(), item2.getId());
	}
}

public class FoodListCreator {

	static LocalDate foodExpiryDate = LocalDate.now();
	static Food soup = new Food(107, "Soup", BigDecimal.valueOf(0.89), foodExpiryDate.plusYears(2));
	static Food cereal = new Food(103, "Cereal", BigDecimal.valueOf(1.15), foodExpiryDate.plusDays(31));
	static Food eggs = new Food(104, "Eggs", BigDecimal.valueOf(1.15), foodExpiryDate.plusDays(7));
	static Food pasta = new Food(106, "Pasta", BigDecimal.valueOf(2.19), foodExpiryDate.plusYears(5));
	static Food bread = new Food(101, "Bread", new BigDecimal("0.99"), foodExpiryDate.plusDays(6));
	static Food mince = new Food(105, "Mince", BigDecimal.valueOf(5.49), foodExpiryDate.plusDays(9));
	static Food apple = new Food(108, "Apples", BigDecimal.valueOf(0.99), foodExpiryDate.plusDays(8));
	static Food milk = new Food(102, "Milk", BigDecimal.valueOf(0.91), foodExpiryDate.plusDays(9));
	static List<Food> foodList = List.of(soup, cereal, eggs, pasta, bread, mince, apple, milk);
	static ArrayList<Food> foodListAL = new ArrayList<>(foodList);

	public static String create() {
		Collections.sort(foodListAL, new IdComparator());
		String foodListALsorted = foodListAL.toString().replace("[", "").replace("]", "").replace(",", "");
		return foodListALsorted;
		
	}
	
	public static Food getSoup() {
		return soup;
	}
	
	public static Food getCereal() {
		return cereal;
	}

	public static Food getEggs() {
		return eggs;
	}

	public static Food getPasta() {
		return pasta;
	}

	public static Food getBread() {
		return bread;
	}

	public static Food getMince() {
		return mince;
	}

	public static Food getApple() {
		return apple;
	}

	public static Food getMilk() {
		return milk;
	}
}
