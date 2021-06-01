package kawanpeter.com.github.interfaces.figuras.programa;

import java.util.Scanner;
import kawanpeter.com.github.interfaces.figuras.classes.FiguraGeometrica;
import kawanpeter.com.github.interfaces.figuras.classes.Triangulo;
import kawanpeter.com.github.interfaces.figuras.classes.Quadrado;


public class Programa {

	public static void main(String[] args) {

		Triangulo tri = new Triangulo();
		
		System.out.println("Olá!");
		System.out.println("Escolha um:");
		System.out.println("1) Triangulo");
		System.out.println("2) Quadrado");
		System.out.println("3) Retangulo");
		System.out.println("4) Sair");
		
		Scanner scan = new Scanner(System.in);
		
		int op = scan.nextInt();
		
		switch(op) {
		case 1:
			Triangulo fig = new Triangulo();
			
			Float l1;
			Float l2;
			Float l3;
			
			Float base;
			Float altura;
			
			//System.out.println("A área do triangulo é: "+ fig.CalcularL2(5f, 23f));
			System.out.println("Insira os lados do triangulo:");
			System.out.println();
			
			System.out.println("Lado 1:");
			System.out.println();
			l1 = scan.nextFloat();
			tri.setLado1(l1);
			
			System.out.println("Lado 2:");
			System.out.println();
			l2 = scan.nextFloat();
			tri.setLado2(l2);
			
			System.out.println("Lado 3:");
			System.out.println();
			l3 = scan.nextFloat();
			tri.setLado3(l3);
			
			System.out.println("Insira a base:");
			System.out.println();
			base = scan.nextFloat();
			tri.setBase(base);
			
			System.out.println("Altura:");
			System.out.println();
			altura = scan.nextFloat();
			tri.setHeight(altura);
			
			System.out.println("Status do triangulo: ");
			System.out.println();
			System.out.println("Area: "+ tri.CalcularArea());
			System.out.println();
			System.out.println("Perimetro: "+ tri.CalcularPerimetro());
			break;
			
		case 2:
			
			Quadrado FigQuadrado = new Quadrado();
			
			Float la1;

			
			//System.out.println("A área do triangulo é: "+ fig.CalcularL2(5f, 23f));
			System.out.println("Insira o lado do quadrado:");
			System.out.println();
			
			System.out.println("Lado 1:");
			System.out.println();
			la1 = scan.nextFloat();
			FigQuadrado.setL1(la1);
			
			
			System.out.println("Status do Quadrado: ");
			System.out.println();
			System.out.println("Area: "+ FigQuadrado.CalcularArea());
			System.out.println();
			System.out.println("Perimetro: "+ FigQuadrado.CalcularPerimetro());
			
			break;
			
		case 3:
			break;
			
		case 4:
			break;
		}
		
	}

}