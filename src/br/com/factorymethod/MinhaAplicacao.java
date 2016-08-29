package br.com.factorymethod;

public class MinhaAplicacao extends Aplicacao {

	@Override
	public Documento criarDocumento() {
		// TODO Auto-generated method stub
		return new MeuDocumento();
	}

}
