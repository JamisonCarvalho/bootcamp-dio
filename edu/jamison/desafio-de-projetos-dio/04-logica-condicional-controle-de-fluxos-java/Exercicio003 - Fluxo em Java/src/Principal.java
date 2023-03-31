
public class Principal {

	public static void main(String[] args) {
		
		ifFerias();
		
		switchSemana();
		
		
	}
	/**
	 * Conforme digitado o dia da semana, aparecerá o número correspondente
	 * 
	 * Exemplo:
	 * Domingo = 1
	 * Segunda = 2
	 * Terça = 3
	 * Quarta = 4
	 * Quinta = 5
	 * Sexta = 6
	 * Sábado = 7
	 **/
	private static void switchSemana() {
		String dia = "Domingo";
			
		switch (dia) {
		case "Domingo":
			System.out.println("1");
		break;
		
		case "Segunda":
			System.out.println("2");
		break;
		
		case "Terça":
			System.out.println("3");
		break;
		
		case "Quarta":
			System.out.println("4");
		break;
		
		case "Quinta":
			System.out.println("5");
		break;
		
		case "Sexta":
			System.out.println("6");
		break;
		
		case "Sabado":
			System.out.println("7");
		break;
		
		default:
			System.out.println("Dia inválido");
		break;
		
		}
	}

	/**
	 * Mostra o mês dependendo do número digitado e diz se é o mês das férias ou não.
	 * 1 - Janeiro
	 * 2 - Fevereiro
	 * 3 - Março
	 * 4 - Abril
	 * 5 - Maio
	 * 6 - Junho
	 * 7 - JUlho
	 * 8 - Agosto
	 * 9 - Setembro
	 * 10 - Outubro
	 * 11 - Novembro
	 * 12 - Dezembro
	 * 
	 * Os Meses de férias são:
	 * 1 - Janeiro
	 * 7 - Julho
	 * 12 - Dezembro
	 */
	private static void ifFerias() {
		int mes = 5;
		
		if(mes == 1) {
			System.out.println("Janeiro");
		} else if(mes == 2) {
			System.out.println("Fevereiro");
		} else if (mes == 3) {
			System.out.println("Março");
		} else if (mes == 4) {
			System.out.println("Abril");
		} else if (mes == 5) {
			System.out.println("Maio");
		} else if (mes == 6) {
			System.out.println("Junho");
		} else if (mes == 7) {
			System.out.println("Julho");
		} else if (mes == 8) {
			System.out.println("Agosto");
		} else if (mes == 9) {
			System.out.println("Setembro");
		} else if (mes == 10) {
			System.out.println("Outubro");
		} else if (mes == 11) {
			System.out.println("Novembro");
		} else if (mes == 12) {
			System.out.println("Dezembro");
		} else {
			System.out.println("Mês inválido");
		}
		
		if (mes == 1 || mes == 7 || mes == 12) {
			System.out.println("Ferias");
		} else {
			System.out.println("Not férias my friend! haha");
		}
		
		}
	
		
	}

