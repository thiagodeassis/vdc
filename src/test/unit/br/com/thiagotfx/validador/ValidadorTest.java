package br.com.thiagotfx.validador;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

import java.io.FileNotFoundException;
import java.util.List;



import org.junit.Before;
import org.junit.Test;

import br.com.thiagotfx.model.Saida;
import br.com.thiagotfx.validador.Validador;





public class ValidadorTest {

	String entrada = "src/test/unit/br/com/thiagotfx/resources/Entrada.txt";
	String regra = "src/test/unit/br/com/thiagotfx/resources/Regra.txt";
	String entradaCaractereCoringa = "src/test/unit/br/com/thiagotfx/resources/EntradaCaractereCoringa.txt";

	private Validador validador;

	@Before
	public void setUp() {
		validador = new Validador();
	}

	@Test
	public void deveRetornarListaDeSaidasValidadas()
			throws FileNotFoundException {

		List<Saida> saidas = validador.valida(entrada, regra);

		assertNotNull("Lista de saidas validadas não deve ser nula", saidas);
		assertEquals("Lista deve conter 5 objetos", 5, saidas.size());
	}

	@Test
	public void deveValidarSaida_Quando_RegraTiverCaractereCoringa(){
		
		List<Saida> saidas = validador.valida(entradaCaractereCoringa, regra);

		assertEquals("Deve estar correto", "N", saidas.get(1).getCorreto());
		assertEquals("Não deve estar correto", "N", saidas.get(1).getCorreto());

	}

}
