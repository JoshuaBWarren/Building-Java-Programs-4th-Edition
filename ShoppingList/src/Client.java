import java.util.ArrayList;
import java.util.Arrays;

public class Client {
	
	public static void main(String[] args) {
		
		ArrayList<ItemOrder> list1 = new ArrayList<ItemOrder>();
		

		
		Item soap = new Item("Soap", 1.50);
		Item towel = new Item("Towel", 3.25);
		
		//System.out.println(soap.getName());
		//System.out.println(soap.getPrice());
		//System.out.println(soap);
		
		ItemOrder order1 = new ItemOrder(soap, 2);
		ItemOrder order2 = new ItemOrder(towel, 2);
		
		//System.out.println(order1.getProduct().getName());
		//System.out.println(order1.getQuantity());
		
		list1.add(order1);
		
		ShoppingCart order = new ShoppingCart(list1);
		
		System.out.println(order);
		
		list1.add(order2);
		
		System.out.println(order);
		
		//System.out.println(order.getTotalOrder());
		
	}

}
