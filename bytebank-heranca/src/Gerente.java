
//Gerente tamb�m � um FuncionarioAutenticavel, sendo assim ele herda da Classe Funcionario.java
public class Gerente extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando m�todo de bonifica��o do GERENTE");
		return super.getSalario();
	}
}
