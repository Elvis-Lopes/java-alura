
public class Designer extends Funcionario {
	
	
	
	public Designer(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}

	public double getBonificacao() {
		System.out.println("Chamando metodo de bonificação do Designer");
		return super.getBonificacao() + 100;
	}
}
