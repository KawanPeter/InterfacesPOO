package kawanpeter.com.github.interfaces.figuras.classes;

import kawanpeter.com.github.interfaces.figuras.classes.FiguraGeometrica;

public class Triangulo implements FiguraGeometrica {
	
	private Integer numeroLados = 3;
	private Float base;
	private Float altura;
	
	public Triangulo(Float base, Float altura) {
		setBase(base);
		setAltura(altura);
	}

	public Float getBase() {
		return base;
	}

	public void setBase(Float base) {
		this.base = base;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Integer getNumeroLados() {
		return numeroLados;
	}

	@Override
	public Float calcularArea() {
		return (getBase() * getAltura()) / 2;
	}

	@Override
	public Float calcularPerimetro() {
		return getAltura() * 2 + getBase(); 
	}

}
