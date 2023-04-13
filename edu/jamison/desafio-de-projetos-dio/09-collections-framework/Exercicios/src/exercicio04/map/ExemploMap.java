package exercicio04.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
	 * Dada os modelos dos carros e seus repectivos consumos na estranda, faça:
	 * 
	 * Modelo = gol - consumo = 14,4 km/l
	 * Modelo = uno - consumo = 15,6 km/l
	 * Modelo = mobi - consumo = 16,1 km/l
	 * Modelo = hb20 - consumo = 14,5 km/l
	 * Modelo = kwid - consumo = 15,6 km/l
	 * 
	 */
public class ExemploMap {

	public static void main(String[] args) {

		Map<String, Double> carrosPopulares = new HashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};		
		
		System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
		System.out.println(carrosPopulares);
		
		System.out.println("\n Substitua o consumo do gol por 15,2 km/l: ");
		carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares);
		
		System.out.println("\n Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));
		
		System.out.println("\n Exiba o consumo do uno: " + carrosPopulares.get("uno"));
		
		System.out.println("\n Exiba os modelos: ");
		Set<String> modelos = carrosPopulares.keySet();
		System.out.println(modelos);
		
		System.out.println("\n Exiba os consumos dos carros: ");
		Collection<Double> consumos = carrosPopulares.values();
		System.err.println(consumos);
		
	}

}
