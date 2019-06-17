
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario claudio = new Funcionario();
		claudio.setNome("Claudio Ramalho");
		claudio.setCpf("419.887.388.73");
		claudio.setSalario(2600);

		System.out.println(claudio.getNome());
		System.out.println(claudio.getBonificacao());
	}
}
