
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Qualquer", "seila", 500, 123);
		
		Funcionario g1 = new Gerente("Marco", "48357934", 5000.00, 123);
		Funcionario ev = new EditorVideo("Vitoria", "21343", 1000.00);
		Funcionario ds = new Designer("Juliana", "943284", 3000);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(ds);
		
		System.out.println(controle.getSoma());
		
	}

}
