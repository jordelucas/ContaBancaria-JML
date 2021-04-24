package ufrn.imd.interfaces;

import ufrn.imd.exceptions.OperacaoIllegalException;

public interface OperacaoDebitar {

	void debitar(Double valor) throws OperacaoIllegalException;
}
