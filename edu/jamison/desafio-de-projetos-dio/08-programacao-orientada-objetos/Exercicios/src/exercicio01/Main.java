package exercicio01;

import java.lang.invoke.StringConcatFactory;

public class Main {

	public static void main(String[] args) {

		Carro carro = new Carro();
		
		carro.setCor("Vemelho");
		carro.setCapacidadeTanque(41);
		carro.setModelo("Fusca");
		
		
		System.out.println("---- CARRO 1 ---");
		System.out.println("O modelo do nosso carro é " + carro.getModelo() + " ele tem a capacidade do tanque de " +  carro.getCapacidadeTanque() + "L e tem a cor " + carro.getCor() + ".");
		System.out.print("Gastamos R$");
		System.out.printf("%.2f", carro.tanqueCheio(5.04));
		System.out.print(" para encher o tanque.\n");
	
		Carro carro2 = new Carro("Cinza", "BMW", 66);
		System.out.println("\n---- CARRO 2 ---");
		System.out.println("O modelo do nosso carro é " + carro2.getModelo() + " ele tem a capacidade do tanque de " +  carro2.getCapacidadeTanque() + "L e tem a cor " + carro.getCor() + ".");
		System.out.print("Gastamos R$");
		System.out.printf("%.2f", carro2.tanqueCheio(5.04));
		System.out.print(" para encher o tanque.");
		
		
	}
	

}
