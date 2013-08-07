package validador;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import resources.Entrada;

public class GeraEntrada {
	
	public List<Entrada> listaDeEntrada(String path) {
		
		List<Entrada> entradas = new ArrayList<>();
		
		try {
			Scanner scanner = new Scanner(new File(path));
			while (scanner.hasNextLine()) {
				Entrada entrada = this.parse(scanner.nextLine());

				entradas.add(entrada);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entradas;
	}
	
	
	private Entrada parse(String linha) {
		Scanner scanner = new Scanner(linha).useDelimiter("\\,");
		while (scanner.hasNext()) {
			Integer numero = scanner.nextInt();
			String operacao = scanner.next();
			String classificacao = scanner.next();
			BigDecimal valor = scanner.nextBigDecimal();
			BigDecimal valorImposto = scanner.nextBigDecimal();

			Entrada entrada = new Entrada(numero, operacao, classificacao, valor, valorImposto);
			return entrada;
		}
		return null;
	}

}