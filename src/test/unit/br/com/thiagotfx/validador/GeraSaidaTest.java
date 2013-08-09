package br.com.thiagotfx.validador;

import org.junit.Before;
import org.junit.Test;

public class GeraSaidaTest {
	
	String entrada = "src/test/unit/br/com/thiagotfx/resources/Entrada.txt";
	String regra = "src/test/unit/br/com/thiagotfx/resources/Regra.txt";
	String saida = "src/test/unit/br/com/thiagotfx/resources/Saida.txt";

	private GeraSaida geraSaida;
	private Validador validador;
	
	@Before
	public void setUp(){
		geraSaida = new GeraSaida();
		validador = new Validador();
	}
	
	@Test
	public void deveGerarArquivoDeSaida(){
		
		geraSaida.geraSaida(saida, validador.valida(entrada, regra));
		
	}
}
