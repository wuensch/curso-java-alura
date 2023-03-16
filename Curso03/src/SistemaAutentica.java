
public class SistemaAutentica {

	int senha = 2222;
	
	public void autentica(Autenticavel f) {
		
		boolean autentica = f.autentica(senha);
		
		if (autentica) {
			System.out.println("Pode entrar no sistema");
		} else {
			System.out.println("Não pode entrar no sistema");
		}
		
	}
	
}
