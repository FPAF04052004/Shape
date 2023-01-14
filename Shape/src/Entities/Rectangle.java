package Entities;

public class Rectangle extends AbstractShape {
	
	private Double weidth;
	private Double height;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Double weidth, Double height) {
		this.weidth = weidth;
		this.height = height;
	}
	
	public Rectangle(Color color, Double weidth, Double height) {
		super(color);
		this.weidth = weidth;
		this.height = height;
	}

	public Double getWeidth() {
		return weidth;
	}

	public void setWeidth(Double weidth) {
		this.weidth = weidth;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public double area() {
		return getHeight() * getWeidth();
	}

	public double perimetro() {
		return 2 * getHeight() + 2 * getWeidth();
	}

	public String toString() {
		return String.format("Forma: Rectangle, Color: %s, Area: %.2f, Perimetro: %.2f", super.getColor(), area(), perimetro());
	}
	
}
