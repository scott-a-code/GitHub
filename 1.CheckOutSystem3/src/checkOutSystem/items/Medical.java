package checkOutSystem.items;

import java.math.BigDecimal;

public class Medical extends Item {

	private int id;
	private String name;
	private BigDecimal price;
	private String manufacturer;

	public Medical(int id, String name, BigDecimal price, String manufacturer) {
		super(id, name, price);
		this.id = id;
		this.name = name;
		this.price = price;
		this.manufacturer = manufacturer;
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

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String toString() {
		return String.format(super.toString() + "\n");
	}
}
