
public class Principal {

	public static void main(String[] args) {

		double areaQuadrado = Quadrilatero.area(3);
		System.out.println("Área do quadrado: " + areaQuadrado);
		
		double areaRetangulo = Quadrilatero.area(5,5);
		System.out.println("Área do quadrado: " + areaRetangulo);

		double areaTrapezio = Quadrilatero.area(7, 8, 9);
		System.out.println("Área do quadrado: " + areaTrapezio);
	}

}
