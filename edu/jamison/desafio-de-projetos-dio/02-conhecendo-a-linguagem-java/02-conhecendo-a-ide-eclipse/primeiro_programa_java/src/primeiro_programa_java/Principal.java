package primeiro_programa_java;
import primeiro_programa_java.Gato;

public class Principal {

	public static void main(String[] args) {
		
		// Fugindo da maldição do Hello World kkkj'
		// System.out.println("Hello World!");
		
		Gato gato = new Gato();
		Livros livro = new Livros();
		
		System.out.println(gato);
		System.out.println(livro);
	}

}

class Livros {
	private String nome;
	private String autor;
}