package ufrn.imd.interfaces;

import ufrn.imd.exceptions.OperacaoIllegalException;

public interface OperacaoDebitar {

	void debitar(double valor) throws OperacaoIllegalException;
}
