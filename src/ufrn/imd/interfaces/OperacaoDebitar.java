package ufrn.imd.interfaces;

import ufrn.imd.exceptions.OperacaoIllegalException;

public interface OperacaoDebitar extends Operacao {

	
	/*@ public normal_behavior
	@		requires valor > 0 && valor <= saldo;
	@		assignable saldo;
	@		ensures saldo == \old(saldo)-valor;
	@*/
	void debitar(double valor) throws OperacaoIllegalException;
}
