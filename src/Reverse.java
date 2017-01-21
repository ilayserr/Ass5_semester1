/*
Assignment number : 5.2
File Name : Reverse.java
Name : Ilay Serr
Email : ilay92@gmail.com
*/

public class Reverse {
	
	/**
	 * calls the reverse function - that prints the string given backwards.
	 * 
	 * @param args - gets a string
	 */

	public static void main (String[]args) {
		String s = args[0];
		if (s.length() != 0) reverse(s);
	}

//----------------------------------------------------------------------------	
	
	/**
	 * the function prints the string given backwards in a recursive way
	 * 
	 * @param s - the string given
	 */
	
	public static void reverse (String s) {
		if (s.length() == 1) {
			System.out.print(s.charAt(0));
			return;
		}
		reverse (s.substring(1));
		System.out.print(s.charAt(0));
	}
	
}
