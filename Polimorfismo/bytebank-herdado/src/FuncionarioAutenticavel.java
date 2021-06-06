
public abstract class FuncionarioAutenticavel extends Funcionario
implements Autenticavel{

	private int senha;

	public FuncionarioAutenticavel(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		
	}
	
	
	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		
	}

	@Override
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
