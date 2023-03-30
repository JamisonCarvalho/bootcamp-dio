
public class OperadoresUnarios {

	public static void main(String[] args) {

		// Mesmo com o sinal de NEGAÇÃO, ele não transforma o número em NEGATIVO
		int numero = 5;
		System.out.println(- numero);
		System.out.println(numero);
		
		// Para transformar o número negativo teremos que fazer o seguinte
		//Nesse exemplo abaixo, trasnformamos o número em negativo.
		numero = - numero;
		System.out.println(numero);
		
		// Para voltar a ser um número positivo, temos que multiplicar por -1, como no exemplo abaixo.
		numero = numero * -1;
		System.out.println(numero);
		
	}

}
