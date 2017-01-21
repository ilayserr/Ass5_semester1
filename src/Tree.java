/*
Assignment number : 5.5
File Name : Tree.java
Name : Ilay Serr
Email : ilay92@gmail.com
*/

public class Tree {
	
	/**
	 * calls the tree function with the requested number of runs
	 * 
	 * @param args - the requested number of runs.
	 */
	
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		tree(n);
	}
//----------------------------------------------------------------------------
	/**
	 * the wrapping function.
	 * checks if the input given is legal.
	 * set up the first square.
	 * 
	 * @param n - the requested number of runs.
	 */
	
	public static void tree(int n) {
		if (n <= 0) return;
		double [] x = {0.4, 0.4, 0.6, 0.6};
		double [] y = {0.0, 0.2, 0.2, 0.0};
		StdDraw.filledPolygon (x, y);
		tree (n - 1, x, y);
	}	
//----------------------------------------------------------------------------
	/**
	 * set up a new array with the coordinated of the new square.
	 * (twice - one time to the left square and one time to the right)
	 * draw the new squares and call again to the recursive function (if needed)
	 * 
	 * @param n - the requested number of runs.
	 * @param x - the x coordinated array
	 * @param y - the y coordinated array
	 */
	
	public static void tree(int n, double [] x, double [] y) {
		if (n == 0) return;
		
		// set up the middle of the verticale coordinates.
		double midX = (x[0] + x[2]) / 2;
		double midY = (y[0] + y[2]) / 2;
		
		//set up the middle coordinated (between x[1] and x[2]).
		double midXUp = ((x[1] + x[2]) / 2);
		double midYUp = ((y[1] + y[2]) / 2);
		
		// set up the new array with the new square coordinates and prints it.
		double [] x2 = {x[1], (2 * x[1] - midX), (2 * x[1] - x[0]),
												 (2 * midXUp - midX)};
		double [] y2 = {y[1], (2 * y[1] - midY), (2 * y[1] - y[0]), 
												 (2 * midYUp - midY)};
		StdDraw.filledPolygon (x2, y2);
		tree (n - 1, x2, y2);
		
		// set up and prints the other square.
		x2[0] = x[2];
		x2[1] = (2 * x[2] - midX);
		x2[2] = (2 * x[2] - x[3]);
		x2[3] = (2 * midXUp - midX);
		y2[0] = y[2];
		y2[1] = (2 * y[2] - midY);
		y2[2] = (2 * y[2] - y[3]);
		y2[3] =  (2 * midYUp - midY);
		StdDraw.filledPolygon (x2, y2);
		tree (n - 1, x2, y2);
	}
}


