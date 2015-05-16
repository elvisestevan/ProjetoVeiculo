package br.com.veiculo.validacao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaCpf {
	
	private static Pattern padraoCpf = Pattern.compile("[0-9]{11}");
	
	public static boolean eValido(String cpf) {
		Matcher m = padraoCpf.matcher(cpf);
		return m.matches();
	}

}
