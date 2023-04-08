package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {

		Set<Carro> hashSetCarros = new HashSet<>();
	
		hashSetCarros.add(new Carro("Ford"));
		hashSetCarros.add(new Carro("Tesla"));
		hashSetCarros.add(new Carro("BMW"));
		hashSetCarros.add(new Carro("Fiat"));
		hashSetCarros.add(new Carro("Zip"));
		hashSetCarros.add(new Carro("Peugeot"));
	
		System.out.println(hashSetCarros);
		
		Set<Carro> treeSetCarros = new TreeSet<>();
		
		treeSetCarros.add(new Carro("Ford"));
		treeSetCarros.add(new Carro("Tesla"));
		treeSetCarros.add(new Carro("BMW"));
		treeSetCarros.add(new Carro("Fiat"));
		treeSetCarros.add(new Carro("Zip"));
		treeSetCarros.add(new Carro("Peugeot"));
		
		System.out.println(treeSetCarros);
		
	}

}
