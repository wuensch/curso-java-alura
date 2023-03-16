
public class TestaSistema {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(333);
		
		SistemaAutentica sa = new SistemaAutentica();
		sa.autentica(g);
		sa.autentica(adm);
	}

}
