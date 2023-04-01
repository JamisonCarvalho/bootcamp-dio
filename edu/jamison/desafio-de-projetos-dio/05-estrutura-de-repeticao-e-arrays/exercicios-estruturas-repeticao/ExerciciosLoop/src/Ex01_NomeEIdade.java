import java.util.Scanner;


public class Ex01_NomeEIdade {

	public static void main(String[] args) {
		/*
		Faça um programa que leia conjuntos de dois valores,
		o primeiro representando o nome do aluno e o segundo representando a sua idade.
		(Pare o programa inserindo o valor 0 no campo nome)
		*/
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		int idade;
		

		while(true) {
			System.out.println("Digite seu nome: ");
			nome = teclado.next();
			if (nome.equals("0")) break; 
			
			System.out.println("Digite sua idade: ");
			idade = teclado.nextInt();
		}
		
	}

}
