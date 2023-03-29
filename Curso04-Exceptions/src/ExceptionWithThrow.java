
public class ExceptionWithThrow {

	private static int doNothing() throws ArithmeticException {
		
		int x = 5;
		int y = 0;
		int result = 0;
		
		try {
			result = x / y;
		} catch (ArithmeticException e) {
			throw new ArithmeticException("Erro de divisão por zero.");
		}
		
		return x;
				
	}
	
	public static void main(String[] args) {

		
		try {
			int a = doNothing();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
			
		
		
		
	}

}
