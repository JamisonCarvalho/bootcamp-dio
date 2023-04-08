package listaCirculares;

public class Principal {

	public static void main(String[] args) {

		ListaCircular<String> minhaLista = new ListaCircular<>();
		
		minhaLista.add("L0");
		System.out.println(minhaLista);
		
		minhaLista.remove(0);
		System.out.println(minhaLista);
		
		minhaLista.add("L1");
		minhaLista.add("L2");
		minhaLista.add("L3");
		System.out.println(minhaLista);
		
		
		/*
		System.out.println(minhaLista.get(0));
		System.out.println(minhaLista.get(1));
		System.out.println(minhaLista.get(2));
		System.out.println(minhaLista.get(3));
		System.out.println(minhaLista.get(4));
		*/
		
		for(int i = 0; i < 10; i++) {
			System.out.println(minhaLista.get(i));
		}
	}

}
