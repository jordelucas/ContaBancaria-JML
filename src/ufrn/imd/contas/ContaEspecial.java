package ufrn.imd.contas;

import ufrn.imd.exceptions.OperacaoIllegalException;
import ufrn.imd.interfaces.OperacaoTransferir;

public class ContaEspecial extends ContaComum implements OperacaoTransferir {
	
	public ContaEspecial(String codigo, Double valor) {
		super(codigo, valor);
	}

	@Override
	public void transferir(ContaComum conta, Double valor) throws OperacaoIllegalException {
		this.debitar(valor);
		conta.creditar(valor);
	}

}
