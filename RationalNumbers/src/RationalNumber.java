/*
 * Create a class called RationalNumber that represents a fraction with
 * an integer numerator and an integer denominator.
 * 
 * The class will need:
 * 
 * Getters/Setters
 * add, subtract, multiply, divide, and reduce methods
 * toString that prints in this format: 1/4 = "1 / 4"
 */
public class RationalNumber {
	
	private int numerator;
	private int denominator;
	
	public RationalNumber(int numerator, int denominator) {
		this.numerator = numerator;
		if(denominator == 0) {
			throw new IllegalArgumentException("The denominator cannot be zero.");
		} else {
			this.denominator = denominator;
		}
	}
	
	/*
	 * Create a RationalNumber equal to 0 / 1.
	 */
	public RationalNumber() {
		this(0, 1);
	}

	/*
	 * Get the Numerator.
	 */
	public int getNumerator() {
		return numerator;
	}

	/*
	 * Get the Denominator
	 */
	public int getdenominator() {
		return denominator;
	}

	/*
	 * Set the Denominator
	 */
	public void setdenominator(int denominator) {
		this.denominator = denominator;
	}
	
	/*
	 * Set the Numerator
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	/*
	 * Prints out the RationalNumber object into string format:
	 * 
	 * Example: (2,3) = "2 / 3" and (4,1) = 4
	 */
	public String toString() {
		if(this.getdenominator() == 1) {
			return "" + this.getNumerator();
		}
		return "" + this.getNumerator() + " / " + this.getdenominator();
	}
	
	/*
	 * Adds a RationalNumber to another RationalNumber.
	 */
	public RationalNumber addFraction(RationalNumber fraction) {
		int numerator1 = this.getNumerator();
		int numerator2 = fraction.getNumerator();

		int denominator1 = this.getdenominator();
		int denominator2 = fraction.getdenominator();
		int bottom = this.getdenominator() * fraction.getdenominator();
		
		int numerator3 = numerator1 * denominator2;
		int numerator4 = numerator2 * denominator1;
		
		int top = numerator3 + numerator4;
		
		RationalNumber answer = new RationalNumber(top, bottom);
		
		return answer.reduce();
	}
	
	/*
	 * Subtracts a RationalNumber from a RationalNumber.
	 */
	public RationalNumber subtractFraction(RationalNumber fraction) {
		int numerator1 = this.getNumerator();
		int numerator2 = fraction.getNumerator();

		int denominator1 = this.getdenominator();
		int denominator2 = fraction.getdenominator();
		int bottom = this.getdenominator() * fraction.getdenominator();
		
		int numerator3 = numerator1 * denominator2;
		int numerator4 = numerator2 * denominator1;
		
		int top = numerator3 - numerator4;
		
		RationalNumber answer = new RationalNumber(top, bottom);
		
		return answer.reduce();
	}
	
	/*
	 * Multiplies a RationalNumber with a RationalNumber.
	 */
	public RationalNumber multiplyFraction(RationalNumber fraction) {
		int top = this.getNumerator() * fraction.getNumerator();
		int bottom = this.getdenominator() * fraction.getdenominator();
		
		RationalNumber answer = new RationalNumber(top, bottom);
		
		return answer.reduce();
	}
	
	/*
	 * Divides a RationalNumber by a RationalNumber.
	 */
	public RationalNumber divideFraction(RationalNumber fraction) {
		int numerator1 = this.getNumerator();
		int denominator1 = this.getdenominator();

		RationalNumber temp = fraction.reciprocal();

		int top = numerator1 * temp.getNumerator();
		int bottom = denominator1 * temp.getdenominator();
		
		RationalNumber answer = new RationalNumber(top, bottom);
		
		return answer.reduce();

	}
	
	/*
	 * Creates a reciprocal of another RationalNumber.
	 * 
	 * Example: (2,3) = (3,2)
	 */
	private RationalNumber reciprocal() {
		return new RationalNumber(this.denominator, this.numerator);
	}
	
	/*
	 * Reduces a fraction to its lowest possible.
	 */
	public RationalNumber reduce() {
		int gcf = gcd(this.numerator, this.denominator);
		
		this.setNumerator(this.numerator / gcf);
		this.setdenominator(this.denominator / gcf);
		
		return new RationalNumber(numerator, denominator);
	}
	
	/*
	 * Finds the greatest common factor of a RationalNumber.
	 */
	private int gcd(int input1, int input2) {
		if(input2 == 0) {
			return input1;
		} else {
			return gcd(input2, input1 % input2);
		}
	}
	

}
