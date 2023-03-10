
public class TesteNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta(123,123);
		
		conta.deposita(10);
		System.out.println(conta.getSaldo());
		System.out.println(conta.saca(20));
		
		conta.deposita(-30);
		System.out.println(conta.getSaldo());

	}

}
