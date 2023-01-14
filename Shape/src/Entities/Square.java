package Entities;

public class Square extends AbstractShape{
	
	private Double base;

	public Square() {
		super();
	}
	
	public Square(Double base) {
		this.base = base;
	}
	
	public Square(Color color, Double base) {
		super(color);
		this.base = base;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	@Override
	public double area() {
		return Math.pow(base, 2);
	}

	@Override
	public double perimetro() {
		return base + base + base + base;
	}
	
	public String toString() {
		return String.format("Forma: Square, Color: %s, Area: %.2f, Perimetro: %.2f", super.getColor(), area(), perimetro());
	}
}
