package exceptionCustomizada;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada {
	
	public static void main(String[] args) {
		
		String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");
		
		imprimirArquivoNoConsole(nomeDoArquivo);
		System.out.println("\nCom exception ou não, o programa continua...");
		
	}

	

static void imprimirArquivoNoConsole(String nomeDoArquivo) {
	
	try {
		BufferedReader br = lerAquivo(nomeDoArquivo);
		String line = br.readLine();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		do {
			bw.write(line);
			bw.newLine();
			line = br.readLine();
		} while (line != null);
		bw.flush();
		br.close();
		
	} catch (ImpossivelAberturaDeArquivoException e){
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, e.getMessage());
		
	} catch (IOException ex) {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro não esperado, por favor fale com o suporte." + ex.getMessage());
		ex.printStackTrace();
	}
	
}


static BufferedReader lerAquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException{
	
		File file = new File(nomeDoArquivo);
		try {
			return new BufferedReader(new FileReader(nomeDoArquivo));
		} catch (FileNotFoundException e) {
			throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
		}

	}
}

class ImpossivelAberturaDeArquivoException extends Exception{
	
	private String nomeDoArquivo;
	private static String diretorio;
	
	public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String diretorio_) {
		super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
		this.nomeDoArquivo = nomeDoArquivo;
		this.diretorio = diretorio;
	}

	/*@Override
	public String toString() {
		return "ImpossivelAberturaDeArquivoException [nomeDoArquivo=" + nomeDoArquivo + ", diretorio=" + diretorio
				+ "]";
	}*/
	
}
