package br.com.veiculo.principal;

import java.util.Scanner;

import br.com.veiculo.validacao.ValidaCpf;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
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
	}

}
