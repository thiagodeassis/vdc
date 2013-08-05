package validador;

import java.math.BigDecimal;

public class Entrada {

	private Integer numero;
	private String operacao;
	private String classificacao;
	private BigDecimal valor;
	private BigDecimal valorImposto;
	
	public Entrada(){
		
	}
	
	public Entrada(Integer numero, String operacao, String classificacao, BigDecimal valor, BigDecimal valorImposto){
		this.numero = numero;
		this.operacao = operacao;
		this.classificacao = classificacao;
		this.valor = valor;
		this.valorImposto = valorImposto;
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public BigDecimal getValorImposto() {
		return valorImposto;
	}
	public void setValorImposto(BigDecimal valorImposto) {
		this.valorImposto = valorImposto;
	}
	
	@Override
	public String toString() {
		return "Entrada [numero=" + numero + ", operacao=" + operacao
				+ ", classificacao=" + classificacao + ", valor=" + valor
				+ ", valorImposto=" + valorImposto + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((classificacao == null) ? 0 : classificacao.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result
				+ ((operacao == null) ? 0 : operacao.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		result = prime * result
				+ ((valorImposto == null) ? 0 : valorImposto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entrada other = (Entrada) obj;
		if (classificacao == null) {
			if (other.classificacao != null)
				return false;
		} else if (!classificacao.equals(other.classificacao))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (operacao == null) {
			if (other.operacao != null)
				return false;
		} else if (!operacao.equals(other.operacao))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		if (valorImposto == null) {
			if (other.valorImposto != null)
				return false;
		} else if (!valorImposto.equals(other.valorImposto))
			return false;
		return true;
	}
	
}
