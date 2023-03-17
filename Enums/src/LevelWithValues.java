public enum LevelWithValues {
	
	LOW(1),
	MEDIUM(10),
	HIGH(100),
	VERYHIGH(1000);

	int valor;

	//Constructor
	LevelWithValues(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}



