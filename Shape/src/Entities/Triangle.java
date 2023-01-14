package Entities;

public class Triangle extends AbstractShape {
	
	private Double base;
	private Double height;
	
	public Triangle() {
		super();
	}
	
	public Triangle(Double base, Double height) {
		this.base = base;
		this.height = height;
	}
	
	public Triangle(Color color, Double base, Double height) {
		super(color);
		this.base = base;
		this.height = height;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return (base * height) / 2;
	}

	@Override
	public double perimetro() {
		return base + base + base;
	}
	
	public String toString() {
		return String.format("Forma: Triangle, Color: %s, Area: %.2f, Perimetro: %.2f", super.getColor(), area(), perimetro());
	}
}
