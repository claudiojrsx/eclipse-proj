
//Gerente também é um Funcionario, Gerente herda da classe Funcionaro, assina o contrato Autenticavel.

public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	
	public double getBonificacao() {
		System.out.println("Chamando método de bonificação do GERENTE");
		return super.getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	@Override
	public boolean autentica(int senha) {
		
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
