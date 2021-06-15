package kawanpeter.com.github.interfaces.figuras.classes;

import kawanpeter.com.github.interfaces.figuras.classes.FiguraGeometrica;

public class Circulo implements FiguraGeometrica{
	
	private Float diametro;

	public Circulo(Float diametro) {
		setDiametro(diametro);
	}

	public Float getDiametro() {
		return diametro;
	}

	public void setDiametro(Float diametro) {
		this.diametro = diametro;
	}
	
	public Float getRaio() {
		return getDiametro() / 2;
	}

	@Override
	public Float calcularArea() {
		return (float) (Math.PI * Math.pow(getRaio(), 2));
	}

	@Override
	public Float calcularPerimetro() {
		return (float) (2*Math.PI) * getRaio();
	}

}
