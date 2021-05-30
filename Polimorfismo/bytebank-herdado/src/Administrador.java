
public class Administrador extends FuncionarioAutenticavel {
	
	private int senha;
	
	public Administrador(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
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

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

}
