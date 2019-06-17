
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Sandra");
		g1.setSalario(5000.0);
		
		Funcionario func = new Funcionario();
		func.setSalario(2000.0);
		
		EditorVideo ed = new EditorVideo();
		ed.setSalario(2500.0);
		
		
		ControllerBonificacao controle = new ControllerBonificacao();
		controle.registra(g1);
		controle.registra(func);
		controle.registra(ed);
		
		System.out.println(controle.getSoma());
	}
}
