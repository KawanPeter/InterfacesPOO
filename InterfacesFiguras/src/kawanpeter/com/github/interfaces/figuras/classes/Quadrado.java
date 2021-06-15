package kawanpeter.com.github.interfaces.figuras.classes;

import kawanpeter.com.github.interfaces.figuras.classes.FiguraGeometrica;

public class Quadrado extends Quadrilatero implements FiguraGeometrica {

	public Quadrado(Float base, Float altura) {
		setBase(base);
		setAltura(altura);
	}
	
	@Override
	public void setBase(Float base) {
		if (getAltura() != null && !getAltura().equals(base)) {
			throw new RuntimeException("A base não pode ser diferente a altura!");
		}
		this.base = base;
	}
	
	@Override
	public void setAltura(Float altura) {
		if (getBase() != null && !getBase().equals(altura)) {
			throw new RuntimeException("A base não pode ser diferente a altura!");
		}
		this.altura = altura;
	}

	@Override
	public Float calcularArea() {
		return getBase() * getAltura();
	}

	@Override
	public Float calcularPerimetro() {
		return (getBase() + getAltura()) * 2;
	}

}

