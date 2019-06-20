
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		Gerente claudio = new Gerente();
		claudio.setNome("Claudio Ramalho");
		claudio.setCpf("419.887.388.73");
		claudio.setSalario(2600);

		System.out.println(claudio.getNome());
		System.out.println(claudio.getBonificacao());
	}
}
