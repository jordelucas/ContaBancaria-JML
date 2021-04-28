package ufrn.imd.interfaces;

import ufrn.imd.exceptions.OperacaoIllegalException;

public interface OperacaoCreditar extends Operacao {
	
	/*@ public normal_behavior
	  @		requires valor > 0;
	  @		assignable saldo;
	  @		ensures saldo == \old(saldo)+valor;
	  @*/
	void creditar(double valor) throws OperacaoIllegalException;
}
