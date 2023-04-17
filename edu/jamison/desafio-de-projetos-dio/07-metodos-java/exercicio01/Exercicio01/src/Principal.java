
public class Principal {
	public static void main(String[] args) {

		Calcule minhaCalculadora = new Calcule();
		Mensagem mensagem = new Mensagem();
		Emprestimo emprestimo = new Emprestimo();
		
		
		System.out.println("--- EXERCÍCIO MÉTODO (CALCULADORA) ---");
		minhaCalculadora.somar(10, 60);
		
		minhaCalculadora.subtrair(50, 20);
		
		minhaCalculadora.dividir(30, 2);
		
		minhaCalculadora.multiplicar(35, 6);
		
		System.out.println("\n--- EXERCÍCIO MÉTODO (MENSAGEM) ---");
		mensagem.obterMensagem(05);
		mensagem.obterMensagem(17);
		mensagem.obterMensagem(21);
		mensagem.obterMensagem(32);

		
		System.out.println("\n--- EXERCÍCIO MÉTODO (EMPRESTIMO) ---");
		emprestimo.calcular(1300.50, emprestimo.getDuasParcelas());
		emprestimo.calcular(1500.50, emprestimo.getTresParcelas());
		emprestimo.calcular(1300.50, 4);
	}

}
