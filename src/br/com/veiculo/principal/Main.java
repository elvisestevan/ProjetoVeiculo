package br.com.veiculo.principal;

import java.util.Scanner;

import br.com.veiculo.dao.PessoaDAO;
import br.com.veiculo.model.Pessoa;
import br.com.veiculo.validacao.ValidaCpf;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PessoaDAO dao = new PessoaDAO();
		
		int op;
		
		do {
			System.out.println("1 - Cadastrar pessoa");
			System.out.println("2 - Cadastrar veiculo");
			System.out.println("3 - Calcular IPVA");
			System.out.println("4 - Calcular IPVA Total");
			
			op = scanner.nextInt();
			
			switch (op) {
			case 1:
				scanner.nextLine();
				System.out.print("Digite o CPF: ");
				String cpfCadastrar = scanner.nextLine();
				if (ValidaCpf.eValido(cpfCadastrar)) {
					Pessoa p = new Pessoa(cpfCadastrar);
					if (dao.existe(p)) {
						System.out.println("Pessoa já cadastrada!");
					} else {
						System.out.print("Digite o nome: ");
						p.setNome(scanner.nextLine());
						System.out.print("Digite o estado: ");
						p.setEstado(scanner.nextLine());
						if (dao.inserir(p)) {
							System.out.println("Ok, inserido!");
						} else {
							System.out.println("Base cheia!");
						}
					}
				} else {
					System.out.println("CPF inválido");
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				break;
			}
		} while (op != 0);
		
		scanner.close();
	}

}
