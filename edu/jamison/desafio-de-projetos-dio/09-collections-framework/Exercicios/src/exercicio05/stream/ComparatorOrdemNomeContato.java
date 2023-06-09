package exercicio05.stream;

import java.util.Comparator;
import java.util.Map;

 	public class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {
	    @Override
	    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
	        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
	    }
}
