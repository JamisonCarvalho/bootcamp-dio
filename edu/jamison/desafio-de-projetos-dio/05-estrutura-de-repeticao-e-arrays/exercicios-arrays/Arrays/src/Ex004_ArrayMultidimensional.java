import java.util.Random;

public class Ex004_ArrayMultidimensional {

	/*
		Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
	 */
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[][] matriz = new int[4][4];
		
		for (int l = 0; l < matriz.length; l++) {
			
			for(int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = random.nextInt(9);
			}
			
			
		}
		
		System.out.println("Matriz: ");
		for (int[] linha : matriz) {
			for (int coluna : linha) {
				System.out.print(coluna + " ");
			}
			
			System.out.println();
		}
		
	}	

}
