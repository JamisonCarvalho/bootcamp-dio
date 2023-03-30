import java.util.Scanner;

public class SmartTv {

	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public void aumentarVolume() {
		volume++;
		System.out.println("Aumentando o volume para: " + volume);
	}
	
	public void diminuirVolume() {
		volume--;
		System.out.println("Diminuindo o volume para: " + volume);
	}
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public void aumentarCanal() {
		canal++;
		System.out.println("Aumentando o canal para: " + canal);
	}
	
	public void diminuirCanal() {
		canal--;
		System.out.println("Diminuindo o canal para: " + canal);
	}
	
	public void mudarCanal(int novoCanal){
		Scanner controle = new Scanner(System.in);
		System.out.println("Digite o canal desejado: ");
		novoCanal = controle.nextInt();
		canal = novoCanal;
		System.out.println("Mudando de canal para: " + canal);
	}
}
