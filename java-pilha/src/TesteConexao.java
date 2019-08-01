
public class TesteConexao {
	
	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()) {
			conexao.lerDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		}
		
		
//=======================================================		
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.lerDados();
//		} catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conexao");
//		} finally {
//			System.out.println("Finally");
//			if (con != null) {
//				con.close();
//			}
//		}
	}
}
