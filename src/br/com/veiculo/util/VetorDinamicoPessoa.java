package br.com.veiculo.util;

import br.com.veiculo.model.Pessoa;

public class VetorDinamicoPessoa {
	
	private Pessoa[] pessoas = new Pessoa[2];
	private int quantidade = 0;

	public void adicionar(Pessoa p) {
		if (estaCheio()) {
			redimensionar(pessoas.length * 2);
		}
		pessoas[quantidade++] = p;		
	}
	
	private void redimensionar(int capacidade) {
		Pessoa[] aux = new Pessoa[capacidade];
		for (int i = 0; i < pessoas.length; i++) {
			aux[i] = pessoas[i];
		}
		pessoas = aux;
	}

	public boolean estaCheio() {
		return quantidade > pessoas.length;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append("Quantidade: ");
		sb.append(quantidade);
		sb.append(", Cap: ");
		sb.append(pessoas.length);
		sb.append(" [");
		for (int i = 0; i < quantidade - 1; i++) {
			sb.append(pessoas[i]).append(";");
		}
		if(!estaVazia()) {
			sb.append(pessoas[quantidade - 1]);
		}
		sb.append("]");
		return sb.toString();
	}

	private boolean estaVazia() {
		return quantidade <= 0;
	}
}
