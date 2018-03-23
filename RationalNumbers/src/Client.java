
public class Client {
	
	public static void main(String[] args) {
	
	RationalNumber fraction1 = new RationalNumber();
	RationalNumber fraction2 = new RationalNumber(4, 1);
	RationalNumber fraction3 = new RationalNumber(1, 2);
	
	RationalNumber fraction4 = new RationalNumber(1, 2);
	RationalNumber fraction5 = new RationalNumber(2, 3);
	
	System.out.println(fraction1.toString());
	System.out.println(fraction2.toString());
	System.out.println(fraction3.toString());
	
	//fraction1.addFraction(fraction3);
	//System.out.println(fraction3);
	
	System.out.println(fraction4.addFraction(fraction5));
	System.out.println(fraction5.subtractFraction(fraction4));
	System.out.println(fraction4.subtractFraction(fraction5));
	System.out.println(fraction4.multiplyFraction(fraction5));
	System.out.println(fraction4.divideFraction(fraction5));
	
	}

}
