import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<ItemOrder> totalOrder;
	
	public ShoppingCart(ArrayList<ItemOrder> totalOrder) {
		this.totalOrder = totalOrder;
	}

	public ArrayList<ItemOrder> getTotalOrder() {
		return totalOrder;
	}

	public void setTotalOrder(ArrayList<ItemOrder> totalOrder) {
		this.totalOrder = totalOrder;
	}
	
	public String toString() {
		
		String answer = "";
		
		if(totalOrder.isEmpty()) {
			return "ok";
		} else if(totalOrder.size() == 1) {
			return answer + totalOrder.get(0).getProduct().getName() + " " + totalOrder.get(0).getQuantity();
		}
		
		for(int i = 0; i <= totalOrder.size(); i++) {
			answer = totalOrder.get(i).getProduct().getName() + " " + totalOrder.get(i).getQuantity();
		}
		return answer;
	}
	
	public double getTotalPrice() {
		
		double answer = 0.0;
				
		if(totalOrder.size() == 0) {
			return answer;
		}
		
		for(int i = 0; i <= totalOrder.size(); i++) {
			answer = totalOrder.get(i).getProduct().getPrice() + answer;
		}
		return answer;
	}
	
	
}
