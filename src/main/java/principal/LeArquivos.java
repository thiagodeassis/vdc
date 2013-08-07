package principal;

import java.io.FileNotFoundException;
import java.util.List;

import resources.Saida;
import validador.Validador;

public class LeArquivos {
	
	

	public static void main(String[] args) throws FileNotFoundException {
		
		
		Validador validador = new Validador();
		List<Saida> saidas = validador.valida("entrada.txt", "regra.txt");
		
		
	}
}