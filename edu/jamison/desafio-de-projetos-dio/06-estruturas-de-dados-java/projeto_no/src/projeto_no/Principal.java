package projeto_no;

import java.io.NotActiveException;

public class Principal {

	public static void main(String[] args) {

		No<String> no1 = new No<>("Conteudo no1");
		
		No<String> no2 = new No<>("Conteudo no2");
		
		// Apontando a referência do no1 para o no2
		no1.setProximoNo(no2);
		
		// Apontando a referência do no2 para o no3
		No<String> no3 = new No<>("Conteudo no3");
		no2.setProximoNo(no3);
		
		// Apontando a referência do no3 para o no4
		No<String> no4 = new No<>("Conteudo no4");
		no3.setProximoNo(no4);
		
		// Apontando a referência do no4 para o null
		no4.setProximoNo(null);
		
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println(no2);

		System.out.println("---------------------");
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
	}

}
