/*
 * Item Class
 * 
 * Represents a grocery item:
 * 
 * Price: double cost of the item.
 * Name: String name of the item.
 */
public class Item {

	private String name;
	private double price;
	
	
	/*
	 * Constructor for Item.
	 */
	public Item (String name, Double price) {
		this.name = name;
		this.price = price;
	}

	/*
	 * Getter methods for class Item.
	 */	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	/*
	 * Setting methods for class Item.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "" + name + " " + price;
	}
	
	
	
}
