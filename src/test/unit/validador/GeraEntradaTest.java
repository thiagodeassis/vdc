package validador;

import java.util.List;

import static junit.framework.Assert.*;

import org.junit.Before;
import org.junit.Test;

import resources.Entrada;

public class GeraEntradaTest {

	String Entrada = "src/test/unit/validador/entrada.txt";
	String EntradaCaractereCoringa = "src/test/unit/validador/entradaCaractereCoringa.txt";

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
