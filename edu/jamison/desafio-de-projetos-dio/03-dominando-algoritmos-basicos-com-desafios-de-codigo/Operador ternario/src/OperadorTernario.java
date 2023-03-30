
public class OperadorTernario {

	public static void main(String[] args) {

		int a, b;

		a = 5;
		b = 6;
		
		/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
		String resultado = "";
		if(a==b)
		   resultado = "verdadeiro";
		else
		   resultado = "falso";
		
		System.out.println(resultado);
		*/
		
		// MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
		String resultado = (a==b) ? "verdadeiro" : "false";
		// A primeira operação sempre tem que ser uma expressão boleana
		System.out.println(resultado);
		
	}

}
