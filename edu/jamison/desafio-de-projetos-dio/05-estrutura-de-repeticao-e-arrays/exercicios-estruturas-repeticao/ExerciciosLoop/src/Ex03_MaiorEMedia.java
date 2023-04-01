import java.util.Scanner;


public class Ex03_MaiorEMedia {

	public static void main(String[] args) {

		/*
		Faça um programa que leia 5 números
		e informe o maior número
		e a média desses números.
		*/
		
		Scanner teclado = new Scanner(System.in);
				
		int numero;
		int maior = 0;
		int soma = 0;
		
		int i = 0;
		
		
		System.out.println("Usando o DO WHILE:");
		System.out.println();
		do {			
			System.out.println("Digite um número: ");
			numero = teclado.nextInt();
			
			soma = soma + numero;
			
			if (maior > numero)
				maior = numero;
			
			i++;
		} while (i < 5);
		
		System.out.println("A soma dos números digitados é igual a: " + soma);
		System.out.println("A média dos números digitados é igual a: " + (soma/5));
		
		System.out.println();
		System.out.println("Usando o FOR:");
		System.out.println();
		
		for(i = 0; i < 5 ; i++) {
			System.out.println("Digite um número: ");
			numero = teclado.nextInt();
			
			soma += numero;
			
			if (maior > numero)
				maior = numero;
		}
		
		System.out.println("A soma dos números digitados é igual a: " + soma);
		System.out.println("A média dos números digitados é igual a: " + (soma/5));
		
	}

}
