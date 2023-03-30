
public class Usuario {

	public static void main(String[] args) throws Exception{
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("Status da TV ao ser ligada");
		System.out.println();
		System.out.println("A TV está ligada? " + smartTv.ligada);
		System.out.println("Canal atual: " + smartTv.canal);
		System.out.println("Volume atual: " + smartTv.volume);
		
		System.out.println();
		System.out.println("Status da TV ao Fazer alterações:");
		System.out.println();
		smartTv.ligar();
		System.out.println("A TV está ligada? " + smartTv.ligada);
		System.out.println();
		System.out.println("Status da TV ao fazer alterações no VOLUME: ");
		System.out.println();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		System.out.println("Volume atual: " + smartTv.volume);
		
		System.out.println();
		smartTv.diminuirVolume();
		System.out.println("Volume atual: " + smartTv.volume);
		
		System.out.println();
		System.out.println("Status da TV ao fazer alterações no CANAL: ");
		System.out.println();
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		System.out.println();
		smartTv.diminuirCanal();
		System.out.println("Canal atual: " + smartTv.canal);
		System.out.println();
		smartTv.mudarCanal(smartTv.canal);
		System.out.println("Canal atual: " + smartTv.canal);
	}

}
