
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24266);
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(123312);
		
		Conta conta1 = new Conta(1736, 16546);
		Conta conta2 = new Conta(1482, 17634);
		
		System.out.println(Conta.getTotal());
	}
}
