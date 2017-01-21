/*
Assignment number : 5.4
File Name : Sierpinski.java
Name : Ilay Serr
Email : ilay92@gmail.com
*/

public class Sierpinski {
	
	/**
	 * calls the sierpinski function with the requested number of runs.
	 * 
	 * @param args - the number of requested runs.
	 */
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		sierpinski (n);
	}

//----------------------------------------------------------------------------	
	/**
	 * the wrapping function. 
	 * checks if the input is legal. return if not. 
	 * draw the first triangle.
	 * 
	 * @param n - the number of requested runs
	 */
	
	public static void sierpinski(int n) {
		if (n <= 0) return;
		StdDraw.line(0.0, 0.0, 1.0, 0.0);
		StdDraw.line(0.0, 0.0, 0.5, Math.sqrt(3.0) / 2.0);
		StdDraw.line(1.0, 0.0, 0.5, Math.sqrt(3.0) / 2.0);
		sierpinski (n - 1, 0.0, 0.0, 1.0, 0.0, 0.5, (Math.sqrt(3.0) / 2.0));
	}
//----------------------------------------------------------------------------	
	/**
	 * divide the triangle to 4 .
	 * and call the recursive function for three of them.
	 * uses the formula given - in an other way ((x1 + x2) / 2).
	 * 
	 * @param n - the number of runs
	 * @param x1 - the first x coordinate
	 * @param y1 - the first y coordinate
	 * @param x2 - the second x coordinate
	 * @param y2 - the second y coordinate
	 * @param x3 - the third x coordinate
	 * @param y3 - the third y coordinate
	 */
	
	public static void sierpinski(int n, double x1, double y1, double x2,
										 double y2, double x3, double y3) {
		if (n == 0) {
			return;
		}
		
		// draw the 3 lines.
		StdDraw.line((x1 + x2) / 2, (y1 + y2) / 2, 
					 (x1 + x3) / 2, (y1 + y3) / 2);
		StdDraw.line((x1 + x2) / 2, (y1 + y2) / 2,
					 (x2 + x3) / 2, (y2 + y3) / 2);
		StdDraw.line((x1 + x3) / 2, (y1 + y3) / 2, 
					 (x2 + x3) / 2, (y2 + y3) / 2);
		
		// call the three other triangles in a recursive way.
		sierpinski (n - 1, ((x1 + x3) / 2), ((y1 + y3) / 2), 
						   ((x2 + x3) / 2), ((y2 + y3) / 2), x3, y3);
		sierpinski (n - 1, ((x1 + x2) / 2), ((y1 + y2) / 2),
						   x2, y2, ((x2 + x3) / 2), ((y2 + y3) / 2));
		sierpinski (n - 1, x1, y1, ((x1 + x2) / 2), ((y1 + y2) / 2),
						   ((x1 + x3) / 2), ((y1 + y3) / 2));
	}

}

