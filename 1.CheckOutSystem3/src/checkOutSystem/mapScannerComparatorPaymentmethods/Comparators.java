package checkOutSystem.mapScannerComparatorPaymentmethods;

import java.util.Comparator;

import checkOutSystem.items.Item;

	class PriceComparator implements Comparator<Item> {

		@Override
		public int compare(Item item1, Item item2) {
			return item1.getPrice().compareTo(item2.getPrice());
		}
	}

	class IdComparator implements Comparator<Item> {

		@Override
		public int compare(Item item1, Item item2) {
			return Integer.compare(item1.getId(), item2.getId());
		}
	}

	class nameComparator implements Comparator<Item> {

		@Override
		public int compare(Item item1, Item item2) {
			return item1.getName().compareTo(item2.getName());
		}
	}

	public class Comparators {
	}
