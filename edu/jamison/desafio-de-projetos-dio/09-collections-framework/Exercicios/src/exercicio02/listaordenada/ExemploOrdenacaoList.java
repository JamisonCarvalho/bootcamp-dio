package exercicio02.listaordenada;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Dadas as seguintes informações sobre meus gatos, crie uma lista e ordene esta lista exibindo:
 * (nome - idade - cor)
 * 
 * Gato 1 = nome: Loki, idade: 18, cor: laranja
 * Gato 2 = nome: Atreus, idade: 6, cor: branco
 * Gato 3 = nome: Loki, idade: 15, cor: preto
 */

public class ExemploOrdenacaoList {
	

	public static void main(String[] args) {
		
		List<Gatos> meusGatos = new ArrayList<>();
		meusGatos.add(new Gatos("Loki", 18,"laranja"));
		meusGatos.add(new Gatos("Atreus", 6,"branco"));
		meusGatos.add(new Gatos("Loki", 12,"preto"));
		
		System.out.println(meusGatos);
		
		System.out.println("\n--- ORDEM DE INSERÇÃO ---");
		System.out.println(meusGatos);
		
		System.out.println("\n--- ORDEM ALEATÓRIA ---");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("\n--- ORDEM NATURAL (NOME) ---");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);

		System.out.println("\n--- ORDEM POR IDADE ---");
		meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);
		
		System.out.println("\n--- ORDEM POR COR ---");
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);
		
		System.out.println("\n--- ORDEM POR NOME/COR/IDADE ---");
		meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
	}

}
