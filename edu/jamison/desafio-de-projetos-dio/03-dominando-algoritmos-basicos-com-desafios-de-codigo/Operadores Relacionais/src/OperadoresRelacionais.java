
public class OperadoresRelacionais {

	public static void main(String[] args) {

		int numero1 = 1;
		int numero2 = 2;

		// == Relacional de IGUALDADE
		boolean simNao = numero1 == numero2;	
			System.out.println("numero1 é igual o numero2? " + simNao);
		
		// != Relacional de DIFERENÇA
		boolean simNao1 = numero1 != numero2;	
			System.out.println("numero1 é igual o numero2? " + simNao1);
		
		// > Relacional de MAIOR QUE
		boolean simNao3 = numero1 > numero2;	
			System.out.println("numero1 é igual o numero2? " + simNao3);
		
		// >= Relacional de MAIOR OU IGUAL QUE
		boolean simNao4 = numero1 > numero2;	
			System.out.println("numero1 é igual o numero2? " + simNao4);

		// < Relacional de MENOR QUE
		boolean simNao5 = numero1 > numero2;	
			System.out.println("numero1 é igual o numero2? " + simNao5);			

		// <= Relacional de MENOR OU IGUAL QUE
		boolean simNao6 = numero1 > numero2;	
			System.out.println("numero1 é igual o numero2? " + simNao6);	
			
		System.out.println();
		System.out.println("----- SÓ PARA SEPARAR OS EXEMPLOS -----");
		System.out.println();
		// Comparando conteúdos
		/* String nome1 = "Jamison";
		String nome2 = "Jamison";
		System.out.println(nome1 == nome2);
		*/
		
		// Nesse caso daria FALSE, para fazer essa comparação precisariamos usar a função equals
		String nome1 = "Jamison";
		String nome2 = new String ("Jamison");
		System.out.println(nome1 == nome2);
		System.out.println();

		// Comparando usando EQUALS é ideial para comparar OBJETOS
		System.out.println(nome1.contentEquals(nome2));
		
				
		
	}

}
