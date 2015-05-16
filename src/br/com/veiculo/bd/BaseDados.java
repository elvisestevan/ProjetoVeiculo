package br.com.veiculo.bd;

import br.com.veiculo.model.Pessoa;

public class BaseDados {
	
	private static Pessoa[] pessoas = new Pessoa[100];

	public static Pessoa[] getPessoas() {
		return pessoas;
	}

	public static void setPessoas(Pessoa[] pessoas) {
		BaseDados.pessoas = pessoas;
	}
	
}
