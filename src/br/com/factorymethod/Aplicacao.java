package br.com.factorymethod;

public abstract class Aplicacao {
	
	private Documento documento;
	
	public abstract Documento criarDocumento();
	
	public void novoDocumento() {
		this.documento = this.criarDocumento();
	}
	
	public void abrirDocumento() {
		this.documento.abrir();
	}

}
