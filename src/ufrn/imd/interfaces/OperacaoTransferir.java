package ufrn.imd.interfaces;

import ufrn.imd.contas.ContaComum;
import ufrn.imd.exceptions.OperacaoIllegalException;

public interface OperacaoTransferir {

	void transferir(ContaComum conta, double valor) throws OperacaoIllegalException;
}
