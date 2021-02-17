package checkOutSystem.items;

import java.math.BigDecimal;

public class Furniture extends Item {

	private int id;
	private String name;
	private BigDecimal price;
	private String designer;

	public Furniture(int id, String name, BigDecimal price, String designer) {
		super(id, name, price);
		this.id = id;
		this.name = name;
		this.price = price;
		this.designer = designer;

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

	public String getDesigner() {
		return designer;
	}

	public void setDesigner(String designer) {
		this.designer = designer;
	}

	public String toString() {
		return String.format(super.toString() + "\n");
	}
}
