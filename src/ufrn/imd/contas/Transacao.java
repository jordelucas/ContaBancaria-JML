package ufrn.imd.contas;

import java.util.Date;

public class Transacao {
	private TipoOperacao tipoOperacao;
	private Date dataOperacao;
	private double valor;
	
	public Transacao(TipoOperacao tipoOperacao, Date dataOperacao, double valor) {
		super();
		this.tipoOperacao = tipoOperacao;
		this.dataOperacao = dataOperacao;
		this.valor = valor;
	}
	
	public TipoOperacao getTipoOperacao() {
		return tipoOperacao;
	}
	public void setTipoOperacao(TipoOperacao tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}
	public Date getDataOperacao() {
		return dataOperacao;
	}
	public void setDataOperacao(Date dataOperacao) {
		this.dataOperacao = dataOperacao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataOperacao == null) ? 0 : dataOperacao.hashCode());
		result = prime * result + ((tipoOperacao == null) ? 0 : tipoOperacao.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Transacao other = (Transacao) obj;
		if (dataOperacao == null) {
			if (other.dataOperacao != null)
				return false;
		} else if (!dataOperacao.equals(other.dataOperacao))
			return false;
		if (tipoOperacao != other.tipoOperacao)
			return false;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}
}
