package ufrn.imd.contas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ufrn.imd.exceptions.OperacaoIllegalException;
import ufrn.imd.interfaces.OperacaoCreditar;
import ufrn.imd.interfaces.OperacaoDebitar;

public class ContaComum implements OperacaoCreditar, OperacaoDebitar {
	private String codigo;
	
	//@ public invariant saldoConta >= 0;
	/*@ protected represents 
	 @ 		saldo = saldoConta;
	 @*/
	
	protected /*@ spec_public @*/ double saldoConta = 0; 
	
	protected /*@ spec_public non_null @*/ List<Transacao> extrato = new ArrayList<Transacao>();
	
	/*@ protected represents 
	 @ 		historico = extrato;
	 @*/
	//@ public initially extrato != null;
	//@ public initially extrato.size() == 0;
	//@ public invariant extrato.size() >= 0;
	//@ public invariant (\forall int i; i<=0 && i < extrato.size(); extrato.get(i) != null);
	
	public ContaComum (String p_id, double p_saldo) {
		this.setSaldoConta(p_saldo);
		this.setCodigo(p_id);
	}

	@Override
	public void debitar(double valor) throws OperacaoIllegalException {
		this.setSaldoConta(this.getSaldoConta()-valor);
		this.registrar(TipoOperacao.DEBITO, new Date(), valor);
	}

	@Override
	public void creditar(double valor) throws OperacaoIllegalException {
		this.setSaldoConta(this.getSaldoConta()+valor);
		this.registrar(TipoOperacao.CREDITO, new Date(), valor);
	}
	
	/*@ also
	 @ ensures (\forall int i; i<=0 && i < \old(extrato.size()); extrato.get(i).equals(\old(extrato.get(i))));
	 @ ensures extrato.size() == \old(extrato).size()+1;
	 @*/
	@Override
	public void registrar(TipoOperacao tipoOperacao, Date dataOperacao, double valor) {
		Transacao transacao = new Transacao(tipoOperacao, dataOperacao, valor);
		this.getExtrato().add(transacao);
	}

	/*@ 
	@ ensures \result == codigo;
	@*/
	public /*@ pure @*/ String getCodigo() {
		return codigo;
	}

	/*@ 
	@ assignable codigo;
	@ ensures codigo == c;
	@*/
	public void setCodigo(String c) {
		this.codigo = c;
	}
	
	/*@ 
	@ ensures \result == saldoConta;
	@*/
	public /*@ pure @*/ double getSaldoConta() {
		return saldoConta;
	}
	
	/*@ 
	@ assignable saldoConta;
	@ ensures saldoConta == saldo;
	@*/
	private void setSaldoConta(double saldo) {
		this.saldoConta = saldo;
	}
	
	/*@ 
	@ ensures \result == extrato;
	@*/
	public /*@ pure @*/ List<Transacao> getExtrato() {
		return this.extrato;
	}
}
