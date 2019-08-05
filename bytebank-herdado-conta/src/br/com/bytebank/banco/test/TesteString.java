package br.com.bytebank.banco.test;

public class TesteString {
	
	public static void main(String[] args) {
		
		String vazio = "";
		System.out.println(vazio.isEmpty());
		
//		String nome = "Claudio";
//      String outro = new String("Alura");
		
		String nome = "Claudio";
		System.out.println(nome.length());
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
//		int pos = nome.indexOf("io");
//		System.out.println(pos);
		
//		char c = nome.charAt(2);
//		System.out.println(c);
		
		
//		nome.replace("C", "c");
//		nome.toLowerCase();
//		String outro = nome.replace("C", "c");
		
//		System.out.println(nome);
//		System.out.println(outro);
	}
}
