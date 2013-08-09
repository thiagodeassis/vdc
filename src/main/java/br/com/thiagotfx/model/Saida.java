package br.com.thiagotfx.model;

public class Saida {

	private Integer numeroEntrada;
	private Integer numeroRegra;
	private String correto;
	
	public Saida(){
		
	}
	
	public Saida(Integer numeroEntrada, Integer numeroRegra, String correto){
		this.numeroEntrada = numeroEntrada;
		this.numeroRegra = numeroRegra;
		this.correto = correto;
	}

	public Integer getNumeroEntrada() {
		return numeroEntrada;
	}

	public void setNumeroEntrada(Integer numeroEntrada) {
		this.numeroEntrada = numeroEntrada;
	}

	public Integer getNumeroRegra() {
		return numeroRegra;
	}

	public void setNumeroRegra(Integer numeroRegra) {
		this.numeroRegra = numeroRegra;
	}

	public String getCorreto() {
		return correto;
	}

	public void setCorreto(String correto) {
		this.correto = correto;
	}

	@Override
	public String toString() {
		return "Saida [numeroEntrada=" + numeroEntrada + ", numeroRegra="
				+ numeroRegra + ", correto=" + correto + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((correto == null) ? 0 : correto.hashCode());
		result = prime * result
				+ ((numeroEntrada == null) ? 0 : numeroEntrada.hashCode());
		result = prime * result
				+ ((numeroRegra == null) ? 0 : numeroRegra.hashCode());
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
		Saida other = (Saida) obj;
		if (correto == null) {
			if (other.correto != null)
				return false;
		} else if (!correto.equals(other.correto))
			return false;
		if (numeroEntrada == null) {
			if (other.numeroEntrada != null)
				return false;
		} else if (!numeroEntrada.equals(other.numeroEntrada))
			return false;
		if (numeroRegra == null) {
			if (other.numeroRegra != null)
				return false;
		} else if (!numeroRegra.equals(other.numeroRegra))
			return false;
		return true;
	}
	
	
}
