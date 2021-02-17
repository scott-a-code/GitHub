package checkOutSystem.items;

import java.math.BigDecimal;

public class Other extends Item {

	private int id;
	private String name;
	private BigDecimal price;

	public Other(int id, String name, BigDecimal price) {
		super(id, name, price);
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String toString() {
		return String.format(super.toString() + "\n");
	}
}
