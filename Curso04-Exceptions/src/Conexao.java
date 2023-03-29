
public class Conexao implements AutoCloseable {

	public void conectar() {
		System.out.println("Open connection");
	}
	
	public void close() {
		System.out.println("Closed connection");
	}
	
	public void getData() {
		System.out.println("Get data");
		throw new IllegalStateException();
	}

}
