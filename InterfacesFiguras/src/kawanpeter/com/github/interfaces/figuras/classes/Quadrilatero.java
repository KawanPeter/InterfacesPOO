package kawanpeter.com.github.interfaces.figuras.classes;

public abstract class Quadrilatero {
	protected Integer numeroLados = 4;
	protected Float base;
	protected Float altura;	
	protected Float lado1;
	protected Float lado2;
	protected Float lado3;
	protected Float lado4;

	public Float getBase() {
		return base;
	}

	public void setBase(Float base) {		
		this.base = base;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura){		
		this.altura = altura;
	}

	public Integer getNumeroLados() {
		return numeroLados;
	}

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

	public Float getLado4() {
		return lado4;
	}

	public void setLado4(Float lado4) {
		this.lado4 = lado4;
	}	
}
