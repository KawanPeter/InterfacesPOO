package kawanpeter.com.github.interfaces.figuras.programa;

import kawanpeter.com.github.interfaces.figuras.classes.Triangulo;

public class TesteTriangulo {

	public static void main(String[] args) {
		
		Triangulo triangulo = new Triangulo(5f, 8f);
		System.out.println("Área: " + triangulo.calcularArea());
		System.out.println("Perimetro: " + triangulo.calcularPerimetro());
		
	}

}
