package ufrn.imd.contas;

import ufrn.imd.exceptions.OperacaoIllegalException;
import ufrn.imd.interfaces.OperacaoCreditar;
import ufrn.imd.interfaces.OperacaoDebitar;

public class ContaComum implements OperacaoCreditar, OperacaoDebitar {
	private String codigo;
	private double saldo = 0;

	public ContaComum (String p_id, double p_saldo) {
		this.saldo = p_saldo;
		this.setCodigo(p_id);
	}

	@Override
	public void debitar(double valor) throws OperacaoIllegalException {
		if( valor > saldo ){
			throw new OperacaoIllegalException();
		}
		else{
			saldo = saldo-valor;
		}
	}


	@Override
	public void creditar(double valor) throws OperacaoIllegalException {
		if(valor > 0 ){
			saldo = saldo+valor;
		}
		else{
			throw new OperacaoIllegalException();
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
