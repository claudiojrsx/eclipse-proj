
public class Designer extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Chamando o método bonificação do EDITOR DE DESIGNER");
		return super.getBonificacao() + 200;
	}
}
