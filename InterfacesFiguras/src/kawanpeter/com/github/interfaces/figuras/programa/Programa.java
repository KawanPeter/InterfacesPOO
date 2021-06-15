package kawanpeter.com.github.interfaces.figuras.programa;

import kawanpeter.com.github.interfaces.figuras.classes.FiguraGeometrica;
import kawanpeter.com.github.interfaces.figuras.classes.*;


public class Programa {

	public static void main(String[] args) {
		
		// programando orietando a interfaces FiguraGeometricaInterface
		FiguraGeometrica figuraGeometrica = new Retangulo(4.5f, 4.5f);
		System.out.println("Área: " + figuraGeometrica.calcularArea());
		System.out.println("Perimetro: " + figuraGeometrica.calcularPerimetro());

	}

}