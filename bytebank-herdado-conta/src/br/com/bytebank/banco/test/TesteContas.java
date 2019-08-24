package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteContas {
	
	public static void main(String[] args) throws Exception {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(6000.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(3000.0);
		cc.transfere(300.0, cp);
		
		System.out.println("Conta corrente " + cc.getSaldo());
		System.out.println("Conta poupança " + cp.getSaldo());
	}
}
