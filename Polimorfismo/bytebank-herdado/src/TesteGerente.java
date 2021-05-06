
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente("Marco", "48357934", 5000.00, 123);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		g1.setSenha(1234);
		
		boolean autenticou = g1.autentica(2222);
		
		System.out.println(g1.getBonificacao());
		
	}

}
