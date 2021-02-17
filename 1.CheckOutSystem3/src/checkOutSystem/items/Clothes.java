package checkOutSystem.items;

import java.math.BigDecimal;

public class Clothes extends Item {

	private int id;
	private String name;
	private BigDecimal price;
	private String make;

	public Clothes(int id, String name, BigDecimal price) {
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

	public void setMake(String make) {
		this.make = make;
	}

	public String getMake() {
		return make;
	}

	public String toString() {
		return super.toString() + "\n";
	}
}
