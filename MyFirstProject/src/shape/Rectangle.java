package shape;

public class Rectangle extends Shape implements Shapable {
	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String toString() {
		return length * width + " ";
	}
	
	
	//All methods has to be implement here from interfaces
	public double area() {
		return length * width;
	}

	public int test() {
		return 0;
	}

	public int test1() {
		return 0;
	}

	public String name() {
		return "Ankita";
	}



}
