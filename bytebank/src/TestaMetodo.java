
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaClaudio = new Conta();
		contaClaudio.saldo = 100;
		contaClaudio.deposita(50);
		System.out.println(contaClaudio.saldo);
		
		boolean sacou = contaClaudio.saca(20);
		System.out.println(contaClaudio.saldo);
		System.out.println(sacou);
		
		Conta contaBianca = new Conta();
		contaBianca.deposita(1000);
		
		if (contaBianca.transfere(300, contaClaudio)) {
			System.out.println("Transferencia feita com sucesso!");
		} else {
			System.out.println("Limite indispon�vel.");
		}
		System.out.println("Bianca seu saldo agora � de: " + contaBianca.saldo);
		System.out.println("Claudio seu saldo agora � de: " + contaClaudio.saldo);
		
		contaClaudio.titular = "Claudio Ramalho";
		System.out.println(contaClaudio.titular);
	}
}
