package CISC181.Week3.Package2;

public class Rectangle extends Shape implements iShape {
	private int width;
	private int height;

	// constructor
	Rectangle(int newx, int newy, int newwidth, int newheight) {
		super(newx, newy);
		setWidth(newwidth);
		setHeight(newheight);
	}

	// accessors for the width & height
	int getWidth() {
		return width;
	}

	int getHeight() {
		return height;
	}

	void setWidth(int newwidth) {
		width = newwidth;
	}

	void setHeight(int newheight) {
		height = newheight;
	}

	// draw the rectangle
	public void draw() {
		System.out.println("Drawing a Rectangle at:(" + getX() + ", " + getY()
				+ "), width " + getWidth() + ", height " + getHeight());
	}

	// @Override
	public double COMPUTEAREA() {

		int a = 1;

		if (a == 1) {
			return 0;
		} else {
			return 1;
		}
		// return width * height;
	}
}