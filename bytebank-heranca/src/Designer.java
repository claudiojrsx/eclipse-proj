
public class Designer extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo bonifica��o do EDITOR DE DESIGNER");
		return super.getBonificacao() + 200;
	}
}
