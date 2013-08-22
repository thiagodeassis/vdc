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
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo de regras não encontrado.");
		}
		return regras;
	}
	
	@SuppressWarnings("resource")
	private Regra parse(String linha) {
		Scanner scanner = new Scanner(linha).useDelimiter("\\,");

			Integer numero = scanner.nextInt();
			String operacao = scanner.next();
			String classificacao = scanner.next();
			String aliquota = scanner.next();

			Regra regra = new Regra(numero, operacao, classificacao, aliquota);
			return regra;
	}
}