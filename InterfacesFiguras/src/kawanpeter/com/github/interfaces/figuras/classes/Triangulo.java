package kawanpeter.com.github.interfaces.figuras.classes;

public class Triangulo implements FiguraGeometrica {
	
	private Float lado1;
	private Float lado2;
	private Float lado3;
	
	private Float altura;
	private Float base;
	
	@Override
	public Float CalcularArea() {
		Float area = this.base * this.altura;
		return area/2;
	}

	@Override
	public Float CalcularPerimetro() {
		Float area = this.lado1 + this.lado2 + this.lado3;
		return area;
	}
			
	// Getters and Setters
	
	public Float getLado1() {
		return lado1;
	}
	public void setLado1(Float lado1) {
		this.lado1 = lado1;
	}
	public Float getLado2() {
		return lado2;
	}
	public void setLado2(Float lado2) {
		this.lado2 = lado2;
	}
	public Float getLado3() {
		return lado3;
	}
	public void setLado3(Float lado3) {
		this.lado3 = lado3;
	}
	public Float getAltura() {
		return altura;
	}
	public void setHeight(Float altura) {
		this.altura = altura;
	}
	public Float getBase() {
		return base;
	}
	public void setBase(Float base) {
		this.base = base;
	}
	
	}
