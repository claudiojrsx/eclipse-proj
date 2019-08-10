package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteObject {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(33, 22);
		Object cliente = new Cliente();
		
		cliente.toString();
		
		System.out.println(cc.toString());
		System.out.println(cp);
		
	}
	
	static void println() {
		
	}
	
	static void println(int a) {
		
	}
	
	static void println(boolean valor) {
		
	}
	
	static void println(Object referencia) {
		
	}
}
