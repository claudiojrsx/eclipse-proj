
public class TesteContas {
	
	public static void main(String[] args) throws Exception {
		
		int a = 3;
		int b = a / 0;
		
		ContaCorrente outra = null;
		outra.deposita(200.00);
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("Conta corrente " + cc.getSaldo());
		System.out.println("Conta poupan�a " + cp.getSaldo());
	}
}
