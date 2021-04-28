package ufrn.imd.contas;

import java.util.Date;

public class Transacao {
	private /*@ spec_public @*/ TipoOperacao tipoOperacao;
	private /*@ spec_public @*/ Date dataOperacao;
	private /*@ spec_public @*/ double valor;
	
	/*@ assignable tipoOperacao, dataOperacao, valor;
	@ ensures tipoOperacao == tipo;
	@ ensures dataOperacao == data;
	@ ensures valor == novoValor;
	@*/
	public Transacao(TipoOperacao tipo, Date data, double novoValor) {
		super();
		this.tipoOperacao = tipo;
		this.dataOperacao = data;
		this.valor = novoValor;
	}
	
	/*@ 
	@ ensures \result == tipoOperacao;
	@*/
	public /*@ pure @*/ TipoOperacao getTipoOperacao() {
		return tipoOperacao;
	}
	
	/*@ 
	@ assignable tipoOperacao;
	@ ensures tipoOperacao == tipo;
	@*/
	public void setTipoOperacao(TipoOperacao tipo) {
		this.tipoOperacao = tipo;
	}
	
	/*@ 
	@ ensures \result == dataOperacao;
	@*/
	public /*@ pure @*/ Date getDataOperacao() {
		return dataOperacao;
	}
	
	/*@ 
	@ assignable dataOperacao;
	@ ensures dataOperacao == data;
	@*/
	public void setDataOperacao(Date data) {
		this.dataOperacao = data;
	}
	
	/*@ 
	@ ensures \result == valor;
	@*/
	public /*@ pure @*/ double getValor() {
		return valor;
	}
	
	/*@ 
	@ assignable valor;
	@ ensures valor == novoValor;
	@*/
	public void setValor(double novoValor) {
		this.valor = novoValor;
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
