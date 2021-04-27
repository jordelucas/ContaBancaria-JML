package ufrn.imd.interfaces;

import ufrn.imd.exceptions.OperacaoIllegalException;

public interface OperacaoCreditar {

	void creditar(double valor) throws OperacaoIllegalException;
}
