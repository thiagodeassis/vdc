package validador;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import resources.Regra;

public class GeraRegra {
	
	public List<Regra> listaDeRegra(String path) {

		List<Regra> regras = new ArrayList<>();

		try {
			Scanner scanner = new Scanner(new File(path));
			while (scanner.hasNextLine()) {
				Regra regra = this.parse(scanner.nextLine());

				regras.add(regra);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return regras;
	}
	
	private Regra parse(String linha) {
		Scanner scanner = new Scanner(linha).useDelimiter("\\,");
		while (scanner.hasNext()) {
			Integer numero = scanner.nextInt();
			String operacao = scanner.next();
			String classificacao = scanner.next();
			BigDecimal aliquota = scanner.nextBigDecimal();

			Regra regra = new Regra(numero, operacao, classificacao, aliquota);
			return regra;
		}
		return null;
	}
}
