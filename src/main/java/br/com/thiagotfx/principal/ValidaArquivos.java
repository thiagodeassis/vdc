package br.com.thiagotfx.principal;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import br.com.thiagotfx.model.Saida;
import br.com.thiagotfx.validador.GeraSaida;
import br.com.thiagotfx.validador.Validador;

public class ValidaArquivos {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o caminho para o arquivo de entradas");
		String caminhoEntrada = scan.next();

		System.out.println("Digite o caminho para o arquivo de regras");
		String caminhoRegra = scan.next();
		
		System.out.println("Digite o caminho para o arquivo de saida");
		String caminhoSaida = scan.next();

		Validador validador = new Validador();
		List<Saida> saidas = validador.valida(caminhoEntrada, caminhoRegra);

		GeraSaida gs = new GeraSaida();
		gs.geraSaida(caminhoSaida, saidas);
		
		scan.close();

	}
}