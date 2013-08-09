package br.com.thiagotfx.validador;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.thiagotfx.model.Regra;





public class GeraRegra {
	
	public List<Regra> listaDeRegra(String path) {

		List<Regra> regras = new ArrayList<>();

		try {
			Scanner scanner = new Scanner(new FileReader(path));
			scanner.nextLine();
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
			String aliquota = scanner.next();

			Regra regra = new Regra(numero, operacao, classificacao, aliquota);
			return regra;
		}
		scanner.close();
		return null;
	}
}