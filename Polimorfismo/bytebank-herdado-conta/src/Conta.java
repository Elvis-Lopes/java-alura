

public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int conta;
	Cliente titular;
	private static int total;
	
	public Conta(int agencia, int conta) {
		this.agencia = agencia;
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public abstract void deposita(double valor);
	
	public double sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
		}
		return saldo;
	}
	
	public void transferir(double valor, Conta conta) {
		if(this.saldo >= valor) {
			conta.deposita(valor);
			this.saldo -= valor;
		}
	}
	
}
