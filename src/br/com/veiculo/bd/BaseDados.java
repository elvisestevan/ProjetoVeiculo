package br.com.veiculo.bd;

import br.com.veiculo.model.Pessoa;

public class BaseDados {
	
	private static Pessoa[] pessoas = new Pessoa[100];
	private static int quantidade = 0;

	public static Pessoa[] getPessoas() {
		return pessoas;
	}

	public static void setPessoas(Pessoa[] pessoas) {
		BaseDados.pessoas = pessoas;
	}

	public static int getQuantidade() {
		return quantidade;
	}

	public static void setQuantidade(int quantidade) {
		BaseDados.quantidade = quantidade;
	}
	
	public static boolean estaCheia() {
		return quantidade == pessoas.length;
	}

	public static void addPessoa(Pessoa p) {
		pessoas[quantidade] = p;
		quantidade++;
	}
	
}
