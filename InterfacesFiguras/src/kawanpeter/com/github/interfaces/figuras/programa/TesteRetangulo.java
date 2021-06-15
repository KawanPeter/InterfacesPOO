package kawanpeter.com.github.interfaces.figuras.programa;

import kawanpeter.com.github.interfaces.figuras.classes.Retangulo;

public class TesteRetangulo {

	public static void main(String[] args) {
		
		Retangulo retangulo = new Retangulo(5.2f, 8f);
		System.out.println("�rea: " + retangulo.calcularArea());
		System.out.println("Perimetro: " + retangulo.calcularPerimetro());
		
		// teste de mudan�a de altura
		retangulo.setAltura(5.2f);
		System.out.println("�rea: " + retangulo.calcularArea());
		System.out.println("Perimetro: " + retangulo.calcularPerimetro());
	}

}
