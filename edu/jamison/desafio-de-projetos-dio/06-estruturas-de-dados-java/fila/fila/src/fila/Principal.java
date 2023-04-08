package fila;

public class Principal {

	public static void main(String[] args) {

		
		Fila<String> minhaFila = new Fila<>();
		
		
		/* System.out.println("----- TESTES ANTES DA REFATURAÇÃO -----\n");
		minhaFila.enqueue(new No("primeiro"));
		minhaFila.enqueue(new No("segundo"));
		minhaFila.enqueue(new No("terceiro"));
		minhaFila.enqueue(new No("quarto")); */
		System.out.println(minhaFila);
		
		System.out.println("==========");
		
		System.out.println(minhaFila.dequeue());
		System.out.println(minhaFila);
		
		System.out.println("==========");
		//minhaFila.enqueue(new No("ultimo")); 
		System.out.println(minhaFila);
		
		System.out.println("==========");
		System.out.println(minhaFila.first());
		System.out.println(minhaFila);
		
		
		System.out.println("\n\n\n----- TESTES DEPOIS DA REFATURAÇÃO -----\n");
		minhaFila.enqueue("primeiro");
		minhaFila.enqueue("segundo");
		minhaFila.enqueue("terceiro");
		minhaFila.enqueue("quarto");
		System.out.println(minhaFila);
		
		System.out.println("==========");
		
		System.out.println(minhaFila.dequeue());
		System.out.println(minhaFila);
		
		System.out.println("==========");
		minhaFila.enqueue("ultimo");
		System.out.println(minhaFila);
		
		System.out.println("==========");
		System.out.println(minhaFila.first());
		System.out.println(minhaFila);
	}

}
