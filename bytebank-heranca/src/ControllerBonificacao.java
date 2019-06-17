
public class ControllerBonificacao {

	private double soma;

	public void registra(Funcionario func) {

		double boni = func.getBonificacao();
		this.soma = this.soma + boni;
	}

	public double getSoma() {
		return soma;
	}
}
