package bytebank;

public class Conta {
	private String titular;
	private int agencia = 146; 
	private int numeroDaConta = 000;
	private double saldo = 0;
	private boolean contaAberta = false;
	
	public Conta(){

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
	
	public boolean getContaAberta() {
		return contaAberta;
	}
	
	public void setContaAberta(boolean contaAberta) {
		this.contaAberta = contaAberta;
	}
	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Valor depositado!");
	}
	
	public void sacar(double valor) {
		if(this.saldo > 0) {
			this.saldo -= valor;
			System.out.println("Saque realizado!");
		}else {
			System.out.println("Não foi possível realizar o saque devido a falta de saldo");
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= 0 ) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		}else {
			System.out.print("Faltou dinheiro");
			return false;
		}
	}
}
