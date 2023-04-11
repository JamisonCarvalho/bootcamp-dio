package exercicio03;

public class Calculadora implements OperacaoMatematica {

	@Override
	public void somar(double n1, double n2) {
		System.out.println("SOMAR: " + (n1 + n2));
	}

	@Override
	public void subtrair(double n1, double n2) {
		System.out.println("SUBTRAIR: " + (n1 - n2));
		
	}

	@Override
	public void multiplicar(double n1, double n2) {
		System.out.println("MULTIPLICAR: " + (n1 * n2));
		
	}

	@Override
	public void dividir(double n1, double n2) {
		System.out.println("DIVIDIR: " + (n1 / n2));
		
	}

	
	
}
