package exercicio05.stream;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;

	/*
	 * Dadas as seguintes informações de id e conato, crie um dicionário e ordene este dicionário exibindo (Nome id - Nome contato);
	 * 
	 * id = 1 - Contato = nome: Tiana, numero: 2222;
	 * id = 4 - Contato = nome: Brenda, numero: 5555;
	 * id = 3 - Contato = nome: Jamison, numero: 1111;
	 */

public class RefatoracaoOrdenacaoMap {

	public static void main(String[] args) {
		
		System.out.println("--- ORDEM ALEATÓRIA ---");
		
		Map<Integer, Contato> agenda = new HashMap() {{
			put(1, new Contato("Tiana", 2222));
			put(4, new Contato("Brenda", 5555));
			put(3, new Contato("Jamison", 1111));
		}};
		
		System.out.println(agenda);
		
		for(Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}
		
		System.out.println("\n--- ORDEM DE INSERÇÃO ---");
		Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
			put(1, new Contato("Tiana", 2222));
			put(4, new Contato("Brenda", 5555));
			put(3, new Contato("Jamison", 1111));
		}};

		System.out.println(agenda1);
		
		for(Map.Entry<Integer, Contato> entry: agenda1.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}
		
		System.out.println("\n--- ORDEM DE ID ---");
		Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
		System.out.println(agenda2);
		for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}
		

        System.out.println("--\tOrdem número telefone\t--");
        /*
         * 	@Override
        	public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        		return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
        	}
        	
        });
        
        
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {

			@Override
			public Integer apply(Entry<Integer, Contato> cont) {
				return cont.getValue().getNumero();
			}
		}));*/

        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));
        
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }

        System.out.println("--\tOrdem nome contato\t--");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new ComparatorOrdemNomeContato());
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
    }
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
