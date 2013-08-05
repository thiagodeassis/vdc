package validador;

import java.math.BigDecimal;

public class Regra {

	private Integer numero;
	private String operacao;
	private String classificacao;
	private BigDecimal aliquota;
	
	public Regra(){
	}
	
	public Regra(Integer regra, String operacao, String classificacao, BigDecimal aliquota) {
		this.numero = regra;
		this.operacao = operacao;
		this.classificacao = classificacao;
		this.aliquota = aliquota;
	}

	public Integer getRegra() {
		return numero;
	}

	public void setRegra(Integer regra) {
		this.numero = regra;
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

	public BigDecimal getAliquota() {
		return aliquota;
	}

	public void setAliquota(BigDecimal aliquota) {
		this.aliquota = aliquota;
	}

	@Override
	public String toString() {
		return "Regra [regra=" + numero + ", operacao=" + operacao
				+ ", classificacao=" + classificacao + ", aliquota=" + aliquota
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((aliquota == null) ? 0 : aliquota.hashCode());
		result = prime * result
				+ ((classificacao == null) ? 0 : classificacao.hashCode());
		result = prime * result
				+ ((operacao == null) ? 0 : operacao.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
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
		Regra other = (Regra) obj;
		if (aliquota == null) {
			if (other.aliquota != null)
				return false;
		} else if (!aliquota.equals(other.aliquota))
			return false;
		if (classificacao == null) {
			if (other.classificacao != null)
				return false;
		} else if (!classificacao.equals(other.classificacao))
			return false;
		if (operacao == null) {
			if (other.operacao != null)
				return false;
		} else if (!operacao.equals(other.operacao))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}
	
}