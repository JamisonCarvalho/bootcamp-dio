
public class OperadoresAritmeticosAtribuição {

	public static void main(String[] args) {

		// Operador de "+" quando usado em String "junta" as palavras
		String nomeCompleto = "LINGUAGEM" + "JAVA";
		
		System.out.println(nomeCompleto);
		
		String concatenacao ="?"; 

		// Primeiro ele soma depois faz a concatenação com o "texto" 1
		concatenacao = 1+1+1+"1";
			System.out.println(concatenacao);
		
		// Depois que ele detecta um caracter, ele não faz mais a multiplicação
		concatenacao = 1+"1"+1+1;
			System.out.println(concatenacao);
		
		concatenacao = 1+"1"+1+"1";
			System.out.println(concatenacao);
		
		concatenacao = "1"+1+1+1;
			System.out.println(concatenacao);
		
		// Primeiro ele faz a multiplicação que está em evidência, dps a concatenação do "texto" 1
		concatenacao = "1"+(1+1+1);
			System.out.println(concatenacao);
	}

}
