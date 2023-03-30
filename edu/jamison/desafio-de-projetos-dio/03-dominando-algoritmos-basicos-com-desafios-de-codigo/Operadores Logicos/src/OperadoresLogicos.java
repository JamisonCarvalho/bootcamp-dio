
public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		// Se a condicao1 E a condicao2 é verdadeira (as duas precisam ser verdadeiras para da trues)
		if (condicao1 && condicao2) {
			System.out.println("As duas condições são verdadeiras");
		} else {
			System.out.println("Pelos uma das condições é falsa");
		}
		
		// condicao1 OU condicao2 é verdade, uma das condições tem que ser verdadeira.
		if (condicao1 || condicao2) {
			System.out.println("Uma das condições é verdadeira");
		}
	}

}
