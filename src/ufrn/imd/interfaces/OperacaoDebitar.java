package ufrn.imd.interfaces;

import ufrn.imd.exceptions.OperacaoIllegalException;

public interface OperacaoDebitar {
	
	//@ public model instance double saldo;
	
	/*@ public normal_behavior
	@		requires valor > 0 && valor <= saldo;
	@		assignable saldo;
	@		ensures saldo == \old(saldo)-valor;
	@	also
	@		public exceptional_behavior
	@			requires valor <= 0 && valor > saldo;
	@			assignable \nothing;
	@			signals_only OperacaoIllegalException;
	@*/
	void debitar(double valor) throws OperacaoIllegalException;
}
