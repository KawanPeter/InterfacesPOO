package kawanpeter.com.github.interfaces.figuras.classes;

import kawanpeter.com.github.interfaces.figuras.classes.FiguraGeometrica;

public class Retangulo extends Quadrilatero implements FiguraGeometrica {

	public Retangulo(float base, float altura) {
		setBase(base);
		setAltura(altura);
	}
	
	@Override
	public void setBase(Float base) {
		if (getAltura() != null && getAltura().equals(base)) {
			throw new RuntimeException("A base não pode ser igual a altura!");
		}
		this.base = base;
	}
	
	@Override
	public void setAltura(Float altura) {
		if (getBase() != null && getBase().equals(altura)) {
			throw new RuntimeException("A base não pode ser igual a altura!");
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