import java.util.Scanner;

public class Ex02_Nota {

	public static void main(String[] args) {
		
		/*
		Faça um programa que peça uma nota, entre zero e dez.
		Mostre uma mensagem caso o valor seja inválido
		e continue pedindo
		até que o usuário informe um valor válido.
		*/
		
		Scanner teclado = new Scanner (System.in);
		
		int nota;
		
		System.out.println("Digite o valor da nota: ");
		nota = teclado.nextInt();
		
		while(nota < 0 | nota > 10) {
			System.out.println("Nota inválida! Digite novamente: ");
			nota = teclado.nextInt();
		}
	}

}
