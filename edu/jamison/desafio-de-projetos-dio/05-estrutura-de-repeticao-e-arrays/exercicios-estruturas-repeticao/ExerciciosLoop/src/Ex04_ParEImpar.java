import java.util.Scanner;


public class Ex04_ParEImpar {

	public static void main(String[] args) {

		/*
		Faça um programa que peça N números inteiros,
		calcule e mostre a quantidade de números pares
		e a quantidade de números impares.
		*/

		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int  i = 1;
		int quantNumeros;
		int par = 0;
		int impar = 0;
		int somaPar = 0;
		int somaImpar = 0;
		
		System.out.println("Digite a quantidade de número desejados: ");
		quantNumeros = teclado.nextInt();
		
		do {
			System.out.println("Digite o " + i + "° numero: ");
			numero = teclado.nextInt();
			
			if ((numero % 2) != 0) {
				impar++;
				somaImpar += numero;
				
			} else {
				par++;
				somaPar += numero;
			}
			
			
			i++;
		} while (i <= quantNumeros);
		
		System.out.println();
		System.out.println("Foi digitado " + impar + " números Impar.");
		System.out.println("A soma dos números impar é: " + somaImpar);
		System.out.println();
		System.out.println("Foi digitado " + par + " números Par.");
		System.out.println("A soma dos números impar é: " + somaPar);
	}

}
