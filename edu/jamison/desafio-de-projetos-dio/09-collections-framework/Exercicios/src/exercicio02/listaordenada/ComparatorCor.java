package exercicio02.listaordenada;

import java.util.Comparator;

public class ComparatorCor implements Comparator<Gatos> {

	public int compare(Gatos g1, Gatos g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
}
