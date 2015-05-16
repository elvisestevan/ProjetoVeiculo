package br.com.veiculo.util;

import br.com.veiculo.model.Pessoa;

public class TesteVetorDinamico {

	public static void main(String[] args) {
		VetorDinamicoPessoa v = new VetorDinamicoPessoa();
		System.out.println(v);
		v.adicionar(new Pessoa("123", "Elvis"));
		System.out.println(v);
		v.adicionar(new Pessoa("234", "É nóis!"));
		System.out.println(v);
	}

}
