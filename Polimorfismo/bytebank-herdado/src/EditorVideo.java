
public class EditorVideo extends Funcionario {
	
	
	
	public EditorVideo(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}

	public double getBonificacao() {
		System.out.println("Chamando metodo de bonificação do Editor de Video");
		return getBonificacao() + 100;
	}
}
