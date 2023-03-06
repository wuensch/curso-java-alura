package sintaxe.basica;
/*  O fatorial de 0 é 1.
    O fatorial de 1 é (0!) * 1 = 1.
    O fatorial de 2 é (1!) * 2 = 2
    O fatorial de 3 é (2!) * 3 = 6
    O fatorial de 4 é (3!) * 4 = 24
    O fatorial de um número n é n * n-1 * n-2 ... até n = 1. */


public class Fatorial {

	public static void main(String[] args) {
		
		int numero = 4;
		int fatorial = 1;
		
		if (numero >= 0 && numero <=1)
			System.out.println("Fatorial de "+numero + " é 1");
		else {
			for (int i = numero; i > 1; i--) {
				fatorial *= i;
			}
			System.out.println("Fatorial de "+numero + " é "+fatorial);
		}
		
	}

}
