package br.com.factorymethod;

public class Main {

	public static void main(String[] args) {
		
		Aplicacao aplicacao = new MinhaAplicacao();
		Documento meuDocumento = aplicacao.criarDocumento();
		
		meuDocumento.abrir();

	}
}
