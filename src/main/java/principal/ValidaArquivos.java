package principal;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import resources.Saida;
import validador.Validador;

public class ValidaArquivos {
	
	

	public static void main(String[] args) throws FileNotFoundException {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o caminho do arquivo de entradas");
		String caminhoEntrada = scan.next();
		
		System.out.println("Digite o caminho do arquivo de regras");
		String caminhoRegra = scan.next();
		
		Validador validador = new Validador();
		List<Saida> saidas = validador.valida(caminhoEntrada, caminhoRegra);
		
		for (Saida saida : saidas){
			System.out.println(saida.getNumeroEntrada());
			System.out.println(saida.getNumeroRegra());
			System.out.println(saida.getCorreto());
		}
		scan.close();
		
	}
}