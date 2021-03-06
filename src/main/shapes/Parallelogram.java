package main.shapes;

/** Class Parallelogram. Extends Shape2D. */
public class Parallelogram extends Shape2D {
	private double a, b, angle; // lengths of two sides and the angle
	// You may *not* add any other instance variables to this class

	/**
	 * Constructor for class Parallelogram
	 * @param a length of side 1
	 * @param b length of side 2
	 * @param angle smallest between two sides (in radians)
	 */
	public Parallelogram(double a, double b, double angle) {
		// FILL IN CODE

	}

	/** Overrides perimeter method of class Shape2D.
	 *  Returns the perimeter of the parallelogram: 2 * (a + b)
	 * @return perimeter
	 */
	@Override
	public double perimeter() {
		// FILL IN CODE

		return 0; //change
	}

	/** Overrides the area method of Shape2D.
	 *  Returns the area of the parallelogram a*b*sin(angle)
	 * @return area
	 */
	@Override
	public double area() {
		// FILL IN CODE

		return 0; // change
	}

}
