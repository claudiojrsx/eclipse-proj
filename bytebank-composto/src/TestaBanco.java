
public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente claudio = new Cliente();
		claudio.nome = "Claudio Ramalho";
		claudio.cpf = "419.887.388-73";
		claudio.profissao = "Programador";
		
		Conta contaClaudio = new Conta();
		contaClaudio.deposita(100);
		
		contaClaudio.titular = claudio;
		System.out.println(contaClaudio.titular.nome);
	}
}
