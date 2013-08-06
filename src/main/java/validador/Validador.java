package validador;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;

import resources.Entrada;
import resources.Regra;
import resources.Saida;

public class Validador {

	private static final int DUAS_CASAS_DECIMAIS = 2;

	public List<Saida> valida(List<Entrada> entradas, List<Regra> regras) {

		List<Saida> saidas = new ArrayList<Saida>();
		
		for (Entrada entrada : entradas) {
			
			Regra regra = procuraRegra(regras, entrada);
			
			Saida saida = new Saida(entrada.getNumero(), regra.getNumero(), validaValorImposto(regra, entrada) ? "S" : "N");
			
			saidas.add(saida);
		}
		return saidas;
	}

	private Regra procuraRegra(List<Regra> regras, Entrada entrada) {
		for (Regra regra : regras) {
			if (verificaOperacaoDe(entrada,regra) && classificacaoDa(entrada,regra)) {
				return regra;
			}

		}

		return null; //TODO: CRIAR EXCEPTIONS ESPECIFICAS
	}

	private boolean verificaOperacaoDe(Entrada entrada, Regra regra) {
		return entrada.getOperacao().equals(regra.getOperacao()) || regra.getOperacao() == "*";
	}
	
	private boolean classificacaoDa(Entrada entrada, Regra regra) {
		return entrada.getClassificacao().equals(regra.getClassificacao()) || regra.getClassificacao() == "*";
	}

	private Boolean validaValorImposto(Regra regra, Entrada entrada) {
		return (entrada.getValorImposto().compareTo(
				entrada.getValor().multiply(regra.getAliquota()).divide(new BigDecimal("100")).round(new MathContext(DUAS_CASAS_DECIMAIS))) == 0);
	}

}
