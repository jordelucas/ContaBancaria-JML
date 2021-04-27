package ufrn.imd.interfaces;

import ufrn.imd.exceptions.OperacaoIllegalException;

public interface OperacaoCreditar {

	//@ public model instance double saldo;
	
	/*@ public normal_behavior
	@		requires valor > 0;
	@		assignable saldo;
	@		ensures saldo == \old(saldo)+valor;
	@	also
	@		public exceptional_behavior
	@			requires valor <= 0;
	@			assignable \nothing;
	@			signals_only OperacaoIllegalException;
	@*/
	void creditar(double valor) throws OperacaoIllegalException;
}
