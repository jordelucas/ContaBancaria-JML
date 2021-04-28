package ufrn.imd.interfaces;

import ufrn.imd.contas.ContaComum;
import ufrn.imd.exceptions.OperacaoIllegalException;

public interface OperacaoTransferir extends Operacao {
	
	/*@ public normal_behavior
	 @		requires valor > 0 && valor <= saldo;
	 @		assignable saldo, conta.saldo;
	 @		ensures saldo == (\old(saldo)-valor) && conta.saldo == (\old(conta.saldo)+valor);
	 @*/
	void transferir(ContaComum conta, double valor) throws OperacaoIllegalException;
}
