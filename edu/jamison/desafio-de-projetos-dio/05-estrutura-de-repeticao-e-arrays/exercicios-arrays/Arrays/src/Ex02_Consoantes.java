import java.util.Scanner;

public class Ex02_Consoantes {

	public static void main(String[] args) {

		/*
		Faça um Programa que leia um vetor de 6 caracteres,
		e diga quantas consoantes foram lidas.
		Imprima as consoantes.
		*/
		
		
		Scanner teclado = new Scanner (System.in);
		
		String[] consoantes = new String[6];
		
		int quantiConsoantes = 0;
		
		int i = 0;
		
		do {
			System.out.println("Digite uma letra: ");
			String letra = teclado.next();
			
			if( !(letra.equalsIgnoreCase("a") |
				letra.equalsIgnoreCase("e") |
				letra.equalsIgnoreCase("i") |
				letra.equalsIgnoreCase("o") |
				letra.equalsIgnoreCase("u"))) {
				
				consoantes[i] = letra;
				quantiConsoantes++;
			} 
			
			i++;
			
		} while(i < consoantes.length);
		
		
		
		for (String consoante : consoantes) {
			
			if(consoante != null)
				System.out.println(consoante + " ");
		}
		
		System.out.println("Quantidade de consoantes: " + quantiConsoantes);
        System.out.println(consoantes.length);
	}

}
