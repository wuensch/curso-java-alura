
public class TestaConexao {

	public static void main(String[] args) {

		try (Conexao con = new Conexao()) {
			con.conectar();
			con.getData();
		} catch (Exception e) {
			System.out.println("Deu erro.");
		}


	}

}
