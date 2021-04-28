package ufrn.imd.interfaces;

import java.util.Date;

import ufrn.imd.contas.TipoOperacao;

public interface Operacao {
	
	//@ public model instance double saldo;
	
	//@ public model instance List<Transacao> historico = new ArrayList<Transacao>();

	/*@
	 @ requires tipoOperacao != null;
	 @ requires dataOperacao != null;
	 @ requires valor > 0;
	 @ assignable historico;
	 @*/
	void registrar(TipoOperacao tipoOperacao, Date dataOperacao, double valor);
}
