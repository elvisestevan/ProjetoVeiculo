package br.com.veiculo.dao;

import br.com.veiculo.bd.BaseDados;
import br.com.veiculo.model.Pessoa;

public class PessoaDAO {
	
	public boolean existe(Pessoa pessoa) {
		Pessoa[] pessoas = BaseDados.getPessoas();
		for (int i = 0; i < BaseDados.getQuantidade(); i++) {
			if (pessoas[i].equals(pessoa)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean inserir(Pessoa p) {
		if (BaseDados.estaCheia()) {
			return false;
		} else {
			BaseDados.addPessoa(p);
			return true;
		}
	}

}
