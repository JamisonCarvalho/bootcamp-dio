package primeiro_programa_java.calculadora;
import java.util.*;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		double a,b;
				
		System.out.println("Digite o primeiro número: ");
		a = teclado.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		b = teclado.nextDouble();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao (a,b);
		double divisao = divisao (a,b);
		System.out.println("");
		System.out.println("----------RESULTADOS----------");

		System.out.println("O resultado da soma entre esses dois números é de " + soma);
		System.out.println();
		System.out.println("O resultado da subtração entre esses dois números é de " + subtracao);
		System.out.println();
		System.out.println("O resultado da divisao entre esses dois números é de " + divisao);
		System.out.println();
		System.out.println("O resultado da multiplicação entre esses dois números é de " + multiplicacao);
	}

	public static double soma (double a, double b) {
		return a + b;
	}
	
	public static double subtracao (double a, double b) {
		return a - b;
	}
	
	public static double multiplicacao (double a, double b) {
		return a * b;
	}
	
	public static double divisao (double a, double b) {
		return a / b;
	}
}
