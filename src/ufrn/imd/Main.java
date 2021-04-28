package ufrn.imd;

import ufrn.imd.contas.ContaComum;
import ufrn.imd.contas.ContaEspecial;
import ufrn.imd.exceptions.OperacaoIllegalException;

public class Main {

	public static void main(String[] args) throws OperacaoIllegalException {
		// TODO Auto-generated method stub
		ContaComum conta = new ContaComum("conta_comum", 450);
		conta.creditar(500);
		System.out.println("Saldo conta comum: " + conta.getSaldoConta());
//		System.out.println(conta.getSaldo());

		ContaEspecial contaEspecial = new ContaEspecial("conta_especial", 500);
		contaEspecial.creditar(500);
		System.out.println("Saldo conta especial: " + contaEspecial.getSaldoConta());
//		contaEspecial.creditar(-500);
//		System.out.println(contaEspecial.getSaldo());
		conta.debitar(500);

		System.out.println("-------");
		contaEspecial.transferir(conta, 500);
		System.out.println("Saldo conta comum: " + conta.getSaldoConta());
		System.out.println("Saldo conta especial: " + contaEspecial.getSaldoConta());
		
	}

}
