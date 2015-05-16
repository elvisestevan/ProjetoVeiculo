package br.com.veiculo.model;

public class Pessoa {
	
	private String nome;
	private long cpf;
	private String estado;
	private Veiculo[] veiculos = new Veiculo[100];
	
	public Pessoa(String cpf) {
		this.cpf = Long.parseLong(cpf);
	}
	public Pessoa(String cpf, String nome) {
		this.cpf = Long.parseLong(cpf);
		this.nome  = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public Veiculo[] getVeiculos() {
		return veiculos;
	}
	
	public void setVeiculos(Veiculo[] veiculos) {
		this.veiculos = veiculos;
	}

	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Pessoa) {
			return this.cpf == ((Pessoa)obj).getCpf();
		}
		return false;
	}

	@Override
	public String toString() {
		return this.nome;
	}
}
