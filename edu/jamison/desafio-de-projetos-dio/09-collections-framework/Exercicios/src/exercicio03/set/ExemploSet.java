package exercicio03.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
 * 
 * Dada uma lista com 7 notas de um aluno [7,8.5,9.3,5,7,0,3.6] faça:
 * 
 */


public class ExemploSet {

	public static void main(String[] args) {

		System.out.println("Crie um conjunto e adicione as notas:");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas);
		
		System.out.println(""); 
		System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));
		
		System.out.println("");
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		System.out.println("");
		System.out.println("Remova a nota 0: ");
		notas.remove(0d);
		System.out.println(notas);
	}

}
