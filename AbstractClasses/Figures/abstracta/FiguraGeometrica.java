package abstracta;

public abstract class FiguraGeometrica {
	private String color;

	public Figura(String color) {
		this.color = color;
	}
	
	public abstract double calcularArea();

	public String getColor() {
		return color;
	}		
}

