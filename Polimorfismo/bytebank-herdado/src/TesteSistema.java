
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente("Elvis", "12345", 3000, 222);
		Administrador ad = new Administrador("Luana", "3843", 50);
		
		SistemaInterno st = new SistemaInterno();
		
		st.autentica(g);
	}

}
