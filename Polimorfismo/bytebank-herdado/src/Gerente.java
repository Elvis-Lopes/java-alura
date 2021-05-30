
public class Gerente extends FuncionarioAutenticavel {

	private int senha;

	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificaçao do gerente");
		return super.getSalario();
	}
}
