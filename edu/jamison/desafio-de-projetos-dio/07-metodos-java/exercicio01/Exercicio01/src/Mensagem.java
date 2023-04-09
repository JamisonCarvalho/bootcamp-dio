
public class Mensagem {

	/*
	 * A partir da hora do dia, informe a mensagem adequada: bom dia, boa tarde, boa noite
	 */
	

	public static void obterMensagem(int hora) {
		
		switch (hora) {
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
				System.out.println("BOM DIA!");
				break;
				
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
				System.out.println("BOA TARDE!");
				break;
				
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 0:
			case 1:
			case 2:
			case 3:
			case 04:
				System.out.println("BOA NOITE!");
				break;
			default:
			System.out.println("Hora inválida!");
			break;
		}
		
		
		
	}
	
}
