package listaCirculares;

public class ListaCircular<T> {

	private No<T> cabeca;
	private No<T> cauda;
	private int tamanhoLista;
	
	public ListaCircular() {
		this.cauda = null;
		this.cabeca = null;
		this.tamanhoLista = 0;
	}

	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		
		if(this.tamanhoLista == 0) {
			this.cabeca = novoNo;
			this.cauda = this.cabeca;
			this.cabeca.setNoProximo(cauda);
		} else {
			novoNo.setNoProximo(this.cauda);
			this.cabeca.setNoProximo(novoNo);
			this.cauda = novoNo;
		}
		
		this.tamanhoLista++;
	}
	
	public void remove(int index) {
		
		if(index >= this.tamanhoLista)
			throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista.");
		No<T> noAux = this.cauda;
		
		if(index == 0) {
			this.cauda = this.cauda.getNoProximo();
			this.cabeca.setNoProximo(this.cauda);  
		} else if(index == 1) {
			this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
		} else {
			for(int i = 0; i < index -1; i++) {
				noAux = noAux.getNoProximo();
			}
			noAux.setNoProximo(noAux.getNoProximo().getNoProximo());
		}
		
		this.tamanhoLista--;
	}
	
	private No<T> getNo(int index){
		if(this.isEmpty()) 
			throw new IndexOutOfBoundsException("A lista está vazia.");
		
		if(index == 0) {
			return this.cauda;
		} 
			
		No<T> noAux = this.cauda;
		for(int i = 0; (i < index) && (noAux != null); i++){
			noAux = noAux.getNoProximo();
		}
		
		return noAux;
	} 
	
	public T get(int index){
		return this.getNo(index).getConteudo();
	}
	
	public boolean isEmpty() {
		return this.tamanhoLista == 0 ? true : false;
	}
	
	public int size() {
		return this.tamanhoLista;
	}

	@Override
	public String toString() {
		String strRetorno = "";
		
		No<T> noAux = this.cauda;
		
		for(int i = 0; i < this.size(); i++) {
			strRetorno += "[No {conteudo = " + noAux.getConteudo() + "] } -->";
			
			noAux = noAux.getNoProximo();
		}
		
		strRetorno += this.size() != 0 ?  "(Retorna ao início)" : "[]";
		
		return strRetorno ;
	}
	
}
