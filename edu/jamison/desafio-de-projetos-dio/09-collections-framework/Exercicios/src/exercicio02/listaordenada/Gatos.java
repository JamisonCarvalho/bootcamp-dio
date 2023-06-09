package exercicio02.listaordenada;
import java.lang.Comparable;

public class Gatos implements Comparable<Gatos> {
		public  String nome;
		public Integer idade;
		public  String cor;
		
		public Gatos(String nome, Integer idade, String cor) {
			super();
			this.nome = nome;
			this.idade = idade;
			this.cor = cor;
		}

		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public Integer getIdade() {
			return idade;
		}
		
		public void setIdade(Integer idade) {
			this.idade = idade;
		}
		
		public String getCor() {
			return cor;
		}
		
		public void setCor(String cor) {
			this.cor = cor;
		}

		@Override
		public String toString() {
			return " Nome=" + nome + ", Idade=" + idade + ", cor=" + cor;
		}

		@Override
		public int compareTo(Gatos gato) {
			return this.getNome().compareToIgnoreCase(gato.getNome());
		}

	}
