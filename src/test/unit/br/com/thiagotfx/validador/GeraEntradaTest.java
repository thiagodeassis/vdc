package br.com.thiagotfx.validador;

import java.util.List;

import static junit.framework.Assert.*;



import org.junit.Before;
import org.junit.Test;

import br.com.thiagotfx.model.Entrada;
import br.com.thiagotfx.validador.GeraEntrada;





public class GeraEntradaTest {

	String Entrada = "src/test/unit/br/com/thiagotfx/resources/Entrada.txt";
	String EntradaCaractereCoringa = "src/test/unit/br/com/thiagotfx/resources/EntradaCaractereCoringa.txt";

	private GeraEntrada geraEntrada;

	@Before
	public void setUp() {
		geraEntrada = new GeraEntrada();
	}

	@Test
	public void deveRetornarListaDeEntradas_Quando_ReceberPathDeArquivo() {
		List<Entrada> entradas = geraEntrada.listaDeEntrada(Entrada);
		
		assertEquals(5, entradas.size());
		assertEquals("TRANSFERENCIA", entradas.get(1).getOperacao());
	}
}
