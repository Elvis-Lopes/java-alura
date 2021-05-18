
public class TesteGerente {

	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente("Marco", "48357934", 5000.00, 123);
		Funcionario f = new Funcionario("Daniel", "243242", 2000.00);
		Funcionario ev = new EditorVideo("Vitoria", "21343", 1000.00);
		Funcionario ds = new Designer("Juliana", "943284", 3000);
		/*
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		g1.setSenha(1234);	
		boolean autenticou = g1.autentica(2222);
		*/
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		controle.registra(ds);
		
		System.out.println(controle.getSoma());
		
	}

}
