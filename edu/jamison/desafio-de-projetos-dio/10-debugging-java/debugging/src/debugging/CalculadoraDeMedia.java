package debugging;

import java.util.Scanner;

public class CalculadoraDeMedia {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] alunos = {"Tiana", "Brenda", "Jamison", "Loki"};
		
		double media = calculadoraMediaDaTurma(alunos, scan);
		
		System.out.printf("Média da turda %.1f", media);
	}

	
	static double calculadoraMediaDaTurma(String [] alunos, Scanner scanner) {
		
		double soma = 0;
		
		for(String aluno : alunos) {
			System.out.printf("Nota do aluno %s: ", aluno);
			double nota = scanner.nextDouble();
			soma += nota;
		}
		
		return soma / alunos.length;
	}
}
