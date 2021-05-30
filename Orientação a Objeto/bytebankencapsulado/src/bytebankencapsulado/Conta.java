package bytebankencapsulado;

public abstract class Conta {
	
	private double saldo;
	private int agencia;
	private int conta;
	private int numero;
	Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getConta() {
		return conta;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;	
	}
	
	public boolean sacar(double valor) {
		if(valor >= this.saldo) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}		
	}
	
}
