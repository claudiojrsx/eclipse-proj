
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaBianca = new Conta();
		System.out.println(contaBianca.getSaldo());
		
		contaBianca.titular = new Cliente();
		System.out.println(contaBianca.titular);
		
		contaBianca.titular.nome = "Bianca";
		System.out.println(contaBianca.titular.nome);
	}
}
