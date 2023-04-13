package exercicio03.set;

import java.util.Objects;

public class Series implements Comparable<Series>{

	String nome;
	String genero;
	int tempoEpi;
	public Series(String nome, String genero, int tempoEpi) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoEpi = tempoEpi;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getTempoEpi() {
		return tempoEpi;
	}
	public void setTempoEpi(int tempoEpi) {
		this.tempoEpi = tempoEpi;
	}
	@Override
	public String toString() {
		return "Series [nome=" + nome + ", genero=" + genero + ", tempoEpi=" + tempoEpi + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpi);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Series other = (Series) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome) && tempoEpi == other.tempoEpi;
	}
	@Override
	public int compareTo(Series serie) {
		int tempoEpisodio = Integer.compare(this.getTempoEpi(), serie.getTempoEpi());
		if(tempoEpisodio != 0) return tempoEpisodio;
		int genero = this.getGenero().compareTo(serie.getGenero());
		
		return genero;
	}
	
	
	
}
