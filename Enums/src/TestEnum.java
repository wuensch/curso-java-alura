
public class TestEnum {

	public static void main(String[] args) {
		
		//Enum sem valores de inicialização
		System.out.println(Level.HIGH);
		System.out.println(Level.HIGH.ordinal());
		
		//Enum com valores de inicialização
		System.out.println(LevelWithValues.HIGH);
		System.out.println(LevelWithValues.HIGH.getValor());		

	}

}
