package kawanpeter.com.github.interfaces.figuras.programa;

import kawanpeter.com.github.interfaces.figuras.classes.Quadrado;

public class TesteQuadrado {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado(4.7f, 4.7f);
		System.out.println("Área: " + quadrado.calcularArea());
		System.out.println("Perimetro: " + quadrado.calcularPerimetro());
		
		// testar modificar um lado do quadrado
		quadrado.setBase(5.3f);
		System.out.println("Área: " + quadrado.calcularArea());
		System.out.println("Perimetro: " + quadrado.calcularPerimetro());
	}

}

