package ufrn.imd.contas;

import ufrn.imd.exceptions.OperacaoIllegalException;
import ufrn.imd.interfaces.OperacaoCreditar;
import ufrn.imd.interfaces.OperacaoDebitar;

public class ContaComum implements OperacaoCreditar, OperacaoDebitar {
	private String codigo;
	
	//@ public invariant saldo >= 0;
	protected /*@ spec_public @*/ double saldo = 0; 
	
	
	public ContaComum (String p_id, double p_saldo) {
		this.setSaldo(p_saldo);
		this.setCodigo(p_id);
	}

	@Override
	public void debitar(double valor) throws OperacaoIllegalException {
		if( valor > this.getSaldo() ){
			throw new OperacaoIllegalException();
		}
		else{
			this.setSaldo(this.getSaldo()-valor);
		}
	}

	@Override
	public void creditar(double valor) throws OperacaoIllegalException {
		if(valor > 0 ){
			this.setSaldo(this.getSaldo()+valor);
		}
		else{
			throw new OperacaoIllegalException();
		}
	}

	public /*@ pure @*/ String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public /*@ pure @*/ double getSaldo() {
		return saldo;
	}
	
	/*@ protected represents 
	 @ 		saldo <- saldo;
	 @*/
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
