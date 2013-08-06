package validador;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.*;

import org.junit.Before;
import org.junit.Test;

import resources.Entrada;
import resources.Regra;
import resources.Saida;

import validador.Validador;


public class ValidadorTest {

	
	private Validador validador;
	
	@Before
	public void setUp(){
		validador = new Validador();
	}
	
	@Test
	public void deveRetornarListaDeSaidas(){
		List<Saida> saidas = validador.valida(entradas(), regras());
		
		assertEquals("Quantidade de saidas", 4, saidas.size());
		assertEquals("Numero da entrada", entrada().getNumero(), saidas.get(0).getNumeroEntrada());
		assertEquals("Numero da regra", regra().getNumero(), saidas.get(0).getNumeroRegra());
		assertEquals("Correto", "S", saidas.get(0).getCorreto());
	}
	
	@Test
	public void deveValidarSaida_Quando_ClassificacaoForCaractereCoringa(){
		List<Saida> saidas = validador.valida(entradas(), regras());
		
		assertEquals("Entrada com caractere especial", "*", entradas().get(3).getClassificacao());
		assertEquals("Não deve estar correto", "N", saidas.get(2).getCorreto());
		
	}
	
	@Test
	public void deveValidarSaida_Quando_OperacaoForCaractereCoringa(){
		List<Saida> saidas = validador.valida(entradas(), regras());
		
		assertEquals("Entrada com caractere especial", "*", entradas().get(2).getOperacao());
		assertEquals("Não deve estar correto", "N", saidas.get(2).getCorreto());
	}
	
	public List<Entrada> entradas(){
		List<Entrada> entradas = new ArrayList<Entrada>();
		entradas.add(entrada());
		entradas.add(entradaDois());
		entradas.add(entradaOperacaoCoringa());
		entradas.add(entradaClassificacaoCoringa());
		return entradas;
	}
	
	public List<Regra> regras(){
		List<Regra> regras = new ArrayList<Regra>();
		regras.add(regra());
		regras.add(regraDois());
		regras.add(regraOperacaoCoringa());
		regras.add(regraClassificacaoCoringa());
		return regras;
	}
	
	public Entrada entrada(){
		Entrada entrada = new Entrada();
		entrada.setNumero(1);
		entrada.setOperacao("VENDA");
		entrada.setClassificacao("A");
		entrada.setValor(new BigDecimal("1000.00"));
		entrada.setValorImposto(new BigDecimal("180.00"));
		return entrada;
	}
	
	public Entrada entradaDois(){
		Entrada entrada = new Entrada();
		entrada.setNumero(2);
		entrada.setOperacao("VENDA");
		entrada.setClassificacao("B");
		entrada.setValor(new BigDecimal("314.15"));
		entrada.setValorImposto(new BigDecimal("31.42"));
		return entrada;
	}
	
	public Entrada entradaOperacaoCoringa(){
		Entrada entrada = new Entrada();
		entrada.setNumero(3);
		entrada.setOperacao("*");
		entrada.setClassificacao("D");
		entrada.setValor(new BigDecimal("4000.00"));
		entrada.setValorImposto(new BigDecimal("250.00"));
		return entrada;
	}
	
	public Entrada entradaClassificacaoCoringa(){
		Entrada entrada = new Entrada();
		entrada.setNumero(4);
		entrada.setOperacao("TRANSFERENCIA");
		entrada.setClassificacao("*");
		entrada.setValor(new BigDecimal("2000.00"));
		entrada.setValorImposto(new BigDecimal("360.00"));
		return entrada;
	}
	
	public Regra regra(){
		Regra regra = new Regra();
		regra.setNumero(1);
		regra.setOperacao("VENDA");
		regra.setClassificacao("A");
		regra.setAliquota(new BigDecimal("18.00"));
		return regra;
	}
	
	public Regra regraDois(){
		Regra regra = new Regra();
		regra.setNumero(2);
		regra.setOperacao("VENDA");
		regra.setClassificacao("B");
		regra.setAliquota(new BigDecimal("10.00"));
		return regra;
	}
	
	public Regra regraOperacaoCoringa(){
		Regra regra = new Regra();
		regra.setNumero(3);
		regra.setOperacao("*");
		regra.setClassificacao("D");
		regra.setAliquota(new BigDecimal("5.00"));
		return regra;
	}
	
	public Regra regraClassificacaoCoringa(){
		Regra regra = new Regra();
		regra.setNumero(4);
		regra.setOperacao("TRANSFERENCIA");
		regra.setClassificacao("*");
		regra.setAliquota(new BigDecimal("10.00"));
		return regra;
	}
}
