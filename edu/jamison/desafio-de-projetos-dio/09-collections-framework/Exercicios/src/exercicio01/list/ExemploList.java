package exercicio01.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {

		// Dada uma lista com 7 notas de um aluno [7,8.5, 9.3, 5, 7, 0, 3.6], faça:
		
		
		System.out.println("Crie uma lista e adicione as sete notas: ");
		List<Double> notas = new ArrayList<>();
		notas.add(7d);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5d);
		notas.add(7d);
		notas.add(0d);
		notas.add(3.6);
		System.out.println(notas);
		System.out.println("");
		
		System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
		System.out.println("");
		
		System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
		notas.add(4,8d);
		System.out.println("Lista após a adição da nota 8.0: " + notas);
		
		System.out.println("");
		System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
		notas.set(notas.indexOf(5d), 6d);
		System.out.println("Lista após a substituição das notas: " + notas);
		
		System.out.println("");
		System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
		
		System.out.println("");
		System.out.println("Exiba todas as notas na ordem em que foram informados: ");
		System.out.println(notas);
		
		System.out.println("");
		System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
		
		System.out.println("");
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		
		System.out.println("");
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		System.out.println("");
		
		Iterator iterator = (Iterator) notas.iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			Double next = (Double) iterator.next();
			soma += next;
		}
		
		System.out.println("Exiba a soma dos valores: "  + soma);
		
		System.out.println("");
		System.out.println("Exiba a média das notas: " + (soma/notas.size()));
		
		System.out.println("");
		System.out.println("Remova a nota 0: ");
		notas.remove(0d);
		System.err.println(notas);
		
		System.out.println("");
		System.out.println("Remova a nota na posição 0: ");
		notas.remove(0);
		System.err.println(notas);
		
		System.out.println("");
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7) iterator1.remove();
		}
		System.err.println(notas);
		
		System.out.println("");
		System.out.println("Aoague toda a lista");
		notas.clear();
		System.out.println(notas);
		
		System.out.println("");
		System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
	
	}

}
