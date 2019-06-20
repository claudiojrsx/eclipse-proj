
//Gerente também é um FuncionarioAutenticavel, sendo assim ele herda da Classe Funcionario.java
public class Gerente extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando método de bonificação do GERENTE");
		return super.getSalario();
	}
}
