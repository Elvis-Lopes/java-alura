
public class TesteReferencias {

	public static void main(String[] args) {
		Gerente g1 = new Gerente("Marcos", "3242545", 2000.00, 1234);
		String nome = g1.getNome();
		
		System.out.println(nome);
		
	}

}
