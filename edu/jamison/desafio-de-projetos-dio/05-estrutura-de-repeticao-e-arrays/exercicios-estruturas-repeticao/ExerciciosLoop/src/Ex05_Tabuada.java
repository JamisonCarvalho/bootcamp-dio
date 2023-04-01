import java.util.Scanner;


public class Ex05_Tabuada {

	public static void main(String[] args) {

		/*
		Desenvolva um gerador de tabuada,
		capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
		O usuário deve informar de qual numero ele deseja ver a tabuada.
		A saída deve ser conforme o exemplo abaixo:
		Tabuada de 5:
		5 X 1 = 5
		5 X 2 = 10
		...
		5 X 10 = 50
		*/
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int i;
		
		System.out.println("Digite o número de 1 a 10 da tabuada desejada: ");
		numero = teclado.nextInt();
		
		System.out.println();
		System.out.println("TABUADA DE " + numero);

		if (numero > 10) { 
			System.out.println("Número inválido");
		} else {
			for (i = 1; i <= 10; i++)
			
			System.out.println(numero + "x" + i + " = " + (numero * i));
		}
	}

}
