package bytebankcomposto;

public class Conta{
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
	
	public void depositar (double valor) {
		this.saldo += valor;
		System.out.println("valor de R$"+ valor + " depositado!");
	}
	
	public boolean sacar (double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Valor de R$"+ valor + " foi sacado!");
			return true;
		}else {
			return false;
		}
	}
	
	
	private double saldo;
	private int agencia;
	private int conta;
	Cliente titular;
}

