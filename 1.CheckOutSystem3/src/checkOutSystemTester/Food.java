package checkOutSystemTester;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Food extends Item {

	private int id;
	private String name;
	private BigDecimal price;
	private BigDecimal weight;
	private LocalDate expirationDate;
	
	public Food(int id, String name, BigDecimal price, LocalDate expirationDate) {
		super(id, name, price);
		this.id = id;
		this.name = name;
		this.price = price;
		this.expirationDate = expirationDate;
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

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String toString() {
		return String.format(super.toString() + "Expiration Date (%s)\n", expirationDate);
	}

}
