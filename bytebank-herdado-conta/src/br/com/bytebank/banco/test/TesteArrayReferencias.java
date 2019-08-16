package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
		Conta[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		contas[0] = cc1;
		
		ContaPoupanca cp2 = new ContaPoupanca(33, 22);
		contas[1] = cp2;
		
//		System.out.println(cc2.getNumero());
		
		System.out.println(contas[1].getNumero());
		
//		ContaCorrente ref = contas[1];
//		System.out.println(cc2.getNumero());
//		System.out.println(ref.getNumero());
	}
}
