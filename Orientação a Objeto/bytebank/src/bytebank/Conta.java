package bytebank;

public class Conta {
	private String titular;
	private int agencia; 
	private int numeroDaConta;
	private double saldo = 0;
	
	Conta(){

	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		if(this.saldo > 0) {
			this.saldo -= valor;
		}else {
			System.out.println("Não foi possível realizar o saque devido a falta de saldo");
		}
	}
}
