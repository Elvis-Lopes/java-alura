
public abstract class FuncionarioAutenticavel extends Funcionario {

	private int senha;

	public FuncionarioAutenticavel(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		
	}
	
	private void setSenha(int senha) {
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
	
	
}
