package studio7;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle (double length, double width)
	{
		this.length=length;
		this.width=width;
	}
	public double area () {
		return (this.length*this.width); // Area equals length times width
	}


	public boolean isSquare() {
		return (this.length==this.width); // A square is a rectangle with four sides of equal length, so width and length must be equal
	}
	public boolean areaIsSmaller (Rectangle other) {
		return (this.area()<other.area()); // Checks if the area is smaller than a given area
	}
	public void print () {
		System.out.println("Length: " + length); //
		System.out.println("Width: " + width);
		System.out.println("Area: " + area());
		if (isSquare()) {
			System.out.println("This is a square!");
		}
		else
		{
			System.out.println("This is not a square!");
		}
	}
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(4.0, 3.0);
		Rectangle r2 = new Rectangle (5.0,5.0);
		r1.print();
		r2.print();
		if (r1.areaIsSmaller(r2))
		{
		System.out.println ("Rectangle 1 is smaller than Rectangle 2.");	
		}
		else
		{
			System.out.println ("Rectangle 1 is not smaller than Rectangle 2.");	
		}
	}


}

