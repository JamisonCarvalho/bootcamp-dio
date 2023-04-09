
public class Emprestimo {

	/*
	 * Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam. Defina arbritrariamente as 
	 * faixas que influenciam os valores.
	 */
	
	public static int getDuasParcelas() {
		return 2;
	}

	public static double getTaxaDuasParcelas() {
		return 0.35;
	}
	
	public static int getTresParcelas() {
		return 3;
	}
	

	public static double getTaxaTresParcelas() {
		return 0.5;
	}
	
	public static void calcular(double valor, int parcela) {
		
		if(parcela == 2) {
			double valorFinal = valor +(valor * getTaxaDuasParcelas());
			System.out.println("O valor final para " + getDuasParcelas() + " = " + "R$ " +  valorFinal);
			
		} else if (parcela == 3) {
			double valorFinal = valor +(valor * getTaxaTresParcelas());
			System.out.println("O valor final para " + getTresParcelas() + " = " + "R$ " + valorFinal);
			
		} else {
			System.out.println("Números de parcelas inválidos");
		}
		
	}

}
