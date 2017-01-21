/*
Assignment number : 5.3
File Name : Paths.java
Name : Ilay Serr
Email : ilay92@gmail.com
*/

public class Paths {
	
	/**
	 * prints the outcome of the recursive function 
	 * 
	 * @param args - gets the size of the grid
	 */
	
	public static void main (String [] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println(efficientPaths(n));
	}
//----------------------------------------------------------------------------
	/**
	 * the wrapping function.
	 * 
	 * @param n - the size of the grid
	 * @return - the number of possible paths.
	 */
	
	public static long efficientPaths(int n) {
		long [][] mem = new long [n + 1][n + 1];
		return (efficientPaths (n, mem, 0, 0));
	}
//----------------------------------------------------------------------------
	/**
	 * the function checks the number of possible paths in an efficient
	 * recursive way .
	 * 
	 * @param n - the size of the grid
	 * @param mem - the memoization array
	 * @param i - the row index
	 * @param j - the column index
	 * @return the number of possible outcomes
	 */
	
	public static long efficientPaths (int n, long [][] mem, int i, int j) {
		if ((j > n) || (j < i)) return 0;
		if ((i == n) && (j == n)) return 1;
		
		// if the index is empty , fill it up with the new value. 
		if (mem[i][j] == 0) mem[i][j] = (efficientPaths(n, mem, i + 1, j) 
									   + efficientPaths(n, mem, i, j + 1));
		return mem[i][j];	
	}
}


