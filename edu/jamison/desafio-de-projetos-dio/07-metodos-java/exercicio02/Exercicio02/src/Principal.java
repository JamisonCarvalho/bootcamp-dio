import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		//Quadrilatero area = new Quadrilatero();
		
		System.out.println("--- CALCULANDO A ÁREA DO QUADRADO ---");
		System.out.print("Digite o lado: ");
		double lado = teclado.nextDouble();
		Quadrilatero.area(lado);
		
		System.out.println("\n--- CALCULANDO A ÁREA DO RETANGULO ---");
		System.out.print("Digite o primeiro lado: ");
		double lado1 = teclado.nextDouble();
		System.out.print("Digite o segundo lado: ");
		double lado2 = teclado.nextDouble();
		Quadrilatero.area(lado1, lado2);
	
		System.out.println("\n--- CALCULANDO A ÁREA DO TRAPÉZIO ---");
		System.out.print("Digite a base maior: ");
		double baseMaior = teclado.nextDouble();
		System.out.print("Digite a base menor: ");
		double baseMenor = teclado.nextDouble();
		System.err.print("Digite a altura: ");
		double altura = teclado.nextDouble();
		Quadrilatero.area(baseMaior, baseMenor, altura);
	}

}
