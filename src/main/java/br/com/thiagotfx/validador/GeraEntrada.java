package br.com.thiagotfx.validador;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.thiagotfx.model.Entrada;

public class GeraEntrada {

	public List<Entrada> listaDeEntrada(String path) {

		List<Entrada> entradas = new ArrayList<>();

		try {
			Scanner scanner = new Scanner(new FileReader(path));
			scanner.nextLine();
			while (scanner.hasNextLine()) {
				Entrada entrada = this.parse(scanner.nextLine());

				entradas.add(entrada);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo de entradas não encontrado.");
		}
		return entradas;
	}

	@SuppressWarnings("resource")
	private Entrada parse(String linha) {
		Scanner scanner = new Scanner(linha).useDelimiter("\\,");

			Integer numero = scanner.nextInt();
			String operacao = scanner.next();
			String classificacao = scanner.next();
			String valor = scanner.next();
			String valorImposto = scanner.next();

			Entrada entrada = new Entrada(numero, operacao, classificacao,
					valor, valorImposto);
			return entrada;
	}
}