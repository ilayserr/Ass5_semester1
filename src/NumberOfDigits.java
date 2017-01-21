/*
Assignment number : 5.1
File Name : NumberOfDigits.java
Name : Ilay Serr
Email : ilay92@gmail.com
*/

public class NumberOfDigits {
	
	/**
	 * call the recursive function and prints the number of digits
	 * 
	 * @param args - gets a number
	 */
	
	public static void main (String[]args) {	
		int n = Integer.parseInt(args[0]);
		System.out.println(numberOfDigits(n));
	}
//----------------------------------------------------------------------------	
	/**
	 * the function count the number of digits in a recursive way.
	 * 
	 * @param n - the number given
	 * @return the number of digits the number have.
	 */
	
	public static int numberOfDigits (int n) {
		if ((n < 10) && (n > -10)) return 1;
		return (numberOfDigits (n / 10) + 1);
	}
}
