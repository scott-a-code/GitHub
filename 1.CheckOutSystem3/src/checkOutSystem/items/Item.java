package checkOutSystem.items;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Item implements Comparable<Item> {

	private int id;
	private String name;
	private BigDecimal price;
	private BigDecimal weight;
	private LocalDate expirationDate;

	public Item(int id, String name, BigDecimal price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	@Override
	public int compareTo(Item that) {
		return Integer.compare(this.id, that.id);
	}

	public String toString() {
		StringBuilder dashSpace = new StringBuilder(" - ");
		StringBuilder currencySymbol = new StringBuilder("£");
		StringBuilder closeBracket = new StringBuilder(")");
		String price1 = price.toString();
		return "ID(" + id + closeBracket + dashSpace + name + dashSpace + currencySymbol + price1;
	}
}
