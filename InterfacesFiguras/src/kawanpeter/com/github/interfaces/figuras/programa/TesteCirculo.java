package kawanpeter.com.github.interfaces.figuras.programa;

import kawanpeter.com.github.interfaces.figuras.classes.Circulo;

public class TesteCirculo {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo(5f);
		System.out.println("Área: " + circulo.calcularArea());
		System.out.println("Perimetro: " + circulo.calcularPerimetro());
	}

}
