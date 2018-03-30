
public class ItemOrder {
	
	private Item product;
	private int quantity;

	
	public ItemOrder(Item product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	/*
	 * Getter methods for class ItemOrder.
	 */
	public Item getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}
	
	/*
	 * Setter methods for class ItemOrder	
	 */
	public void setProduct(Item product) {
		this.product = product;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/*
	 * 
	 */
	public void bulkDiscount(ItemOrder input) {
		
		if(input.quantity > 1) {
			
		}
	}
	
	public String toString() {
		return "" + product + " " + quantity; 
	}

}
