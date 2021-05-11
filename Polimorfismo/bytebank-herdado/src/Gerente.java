
public class Gerente extends Funcionario {

	private int senha;

	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println( "Acesso aprovado");
			return true;
		}else {
			System.out.println("Acesso negado");
			return false;
		}
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificaçao do gerente");
		return super.getBonificacao() + super.getSalario();
	}
}
