import java.util.Scanner;


public class Ex06_Fatorial {

	public static void main(String[] args) {

		/*
		Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
		Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
		*/
		
		Scanner teclado = new Scanner(System.in);
		
		int multiplicacao = 1;
		int fatorial;
		int i;
		
		System.out.println("Digite o número desejado para ser FATORADO: ");
		fatorial = teclado.nextInt();
		
		for(i = fatorial; i >= 1 ; i--)
			multiplicacao *= i;
	
		System.out.println(fatorial + "!" + "= " + multiplicacao);
		
		
	}
	

}
