package br.com.bytebank.banco;

import br.com.bytebank.banco.modelo.*;

public class TesteBiblioteca {
	
	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123, 321);
		
		c.deposita(190.0);
		
		System.out.println("O saldo da conta �: " + c.getSaldo());
	}
}
