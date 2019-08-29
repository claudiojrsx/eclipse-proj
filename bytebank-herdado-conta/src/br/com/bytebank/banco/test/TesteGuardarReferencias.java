package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteGuardarReferencias {
	 
	public static void main(String[] args) {
		
		GuardarReferencias guardar = new GuardarReferencias();
		
		Conta cc = new ContaCorrente(22, 11);
		guardar.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		guardar.adiciona(cc2);
		
		int tamanho = guardar.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) guardar.getReferencia(0);
		System.out.println(ref.getNumero());
	}
}
