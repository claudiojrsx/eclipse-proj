
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24266);
		System.out.println(conta.getNumero());
		
		Cliente claudio = new Cliente();
		//conta.titular = claudio;
		claudio.setNome("Claudio Ramalho");
		conta.setTitular(claudio);	
		
		System.out.println(conta.getTitular().getNome());
		
	}
}
