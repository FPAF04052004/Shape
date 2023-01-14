package Entities;

public class Circle extends AbstractShape {
	
private Double radius;

	public Circle() {
		super();
	}

	public Circle(Double radius) {
		this.radius = radius;
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double perimetro() {
		return 2 * Math.PI * radius;
	}

	public String toString() {
		return String.format("Forma: Circle, Color: %s, Area: %.2f, Perimetro: %.2f", super.getColor(), area(), perimetro());
	}
	
}
