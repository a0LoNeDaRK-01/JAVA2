package oopWithNLayeredApp.entities;

public class Product {
	
	private int id;
	
	private String Name;
	
	private double	unitPrice;

	public Product() {
		super();
	}

	public Product(int id, String name, double unitPrice) {
		super();
		this.id = id;
		Name = name;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	

}
