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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((expirationDate == null) ? 0 : expirationDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (expirationDate == null) {
			if (other.expirationDate != null)
				return false;
		} else if (!expirationDate.equals(other.expirationDate))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}

}
