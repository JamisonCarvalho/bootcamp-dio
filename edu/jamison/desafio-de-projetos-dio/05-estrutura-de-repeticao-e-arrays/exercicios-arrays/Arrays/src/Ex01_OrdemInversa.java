
public class Ex01_OrdemInversa {

	public static void main(String[] args) {

		/*
		Crie um vetor de 6 números inteiros
		e mostre-os na ordem inversa.
		*/
		
		int[] vetor = {-5, -6, 15, 50, 8, 4};
		
		System.out.println("Vetor: ");
		int i = 0;
		
		while(i < (vetor.length)) {
			System.out.println(vetor[i] + " ");
			i++;
		}
		
		System.out.println("\nVetor: ");
		for (i = (vetor.length - 1); i >= 0; i--) {
			System.out.println(vetor[i] + " ");
		}
	}

}
