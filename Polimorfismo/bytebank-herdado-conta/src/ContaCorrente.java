
public class ContaCorrente extends Conta{

	public ContaCorrente(int agencia, int conta) {
		super(agencia, conta);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double sacar(double valor) {
		return super.sacar(valor + 0.20);
	}
}
