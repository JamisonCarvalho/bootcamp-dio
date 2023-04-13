package exercicio03.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
	 * Dadas as seguintesinfofrmações sobre minhas series favoritas, 
	 * crie um conjunto e ordene estre conjunto exibindo:
	 * (NOme - Gênero - Tempo de episodio);
	 * 
	 * Série 1 - Nome: Modern Family, Gênero: Comedia, Tempo Episódioa: 25m
	 * Série 2 - Nome: Rick and Morty, Gênero: Animação, Tempo Episódioa: 20m
	 * Série 1 - Nome: Aneis de poder, Gênero: Fantasia, Tempo Episódioa: 60m
	 *  
	 */


public class Exemplo02 {

	public static void main(String[] args) {

		Set<Series> minhasSeries = new HashSet<>();
		Set<Series> minhasSeries1 = new LinkedHashSet<>();
		Set<Series> minhasSeries2 = new TreeSet<>(minhasSeries1);
		Set<Series> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
		
		System.out.println("-- ORDEM ALEATÓRIA --");
		minhasSeries.add(new Series("Modern Family", "Comedia", 20));
		minhasSeries.add(new Series("Rick and Morty", "Animação", 20));
		minhasSeries.add(new Series("Aneis de Poder", "Fantasia", 60));
		
		for (Series series : minhasSeries) System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpi());

		System.out.println("\n-- ORDEM DE INSERÇÃO --");
		minhasSeries1.add(new Series("Modern Family", "Comedia", 20));
		minhasSeries1.add(new Series("Rick and Morty", "Animação", 20));
		minhasSeries1.add(new Series("Aneis de Poder", "Fantasia", 60));
		
		for (Series series : minhasSeries1) System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpi());
		
		System.out.println("\n-- ORDEM NATURAL (TEMPO DE EPISODIO) --");
		minhasSeries2.add(new Series("Modern Family", "Comedia", 20));
		minhasSeries2.add(new Series("Rick and Morty", "Animação", 20));
		minhasSeries2.add(new Series("Aneis de Poder", "Fantasia", 60));
		for (Series series : minhasSeries2) System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpi());
		
		System.out.println("\n-- ORDEM NATURAL Nome/gênero/Tempo de Episódio --");
		minhasSeries3.addAll(minhasSeries);
		for (Series series : minhasSeries3) System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpi());
		
		System.out.println("\n-- ORDEM POR GÊNERO --");
		
		System.out.println("\n-- ORDEM POR TEMPO DE EPISÓDIO --");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
