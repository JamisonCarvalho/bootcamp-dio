
public class Calcule {

	/*
	 * Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.
	 */
	
	/**
	 * Faz a soma de 2 números e imprimi seu resultado
	 * @param n1
	 * @param n2
	 */
	public static void  somar (double n1, double n2) {
		double resultado = n1 + n2;
		
		System.out.println("A soma de " + n1 + " + " + n2 + " = " + resultado);
	}
	
	/**
	 * Faz a subtração de 2 números e imprimi seu resultado
	 * @param n1
	 * @param n2
	 */
	public static void subtrair (double n1, double n2) {
		double resultado = n1 - n2;
		System.out.println("A subtração de " + n1 + " - " + n2 + " = " + resultado);
	}

	/**
	 * Faz a multiplicação de 2 números e imprimi seu resultado
	 * @param n1
	 * @param n2
	 */
	public static void multiplicar (double n1, double n2) {
		double resultado = n1 * n2;
		System.out.println("A multiplicação de " + n1 + " x " + n2 + " = " + resultado);
	}

	/**
	 * Faz a divisão de 2 números e imprimi seu resultado
	 * @param n1
	 * @param n2
	 */
	public static void dividir (double n1, double n2) {
		double resultado = n1 / n2;
		System.out.println("A divisão de " + n1 + " / " + n2 + " = " + resultado);
	}
	
}
