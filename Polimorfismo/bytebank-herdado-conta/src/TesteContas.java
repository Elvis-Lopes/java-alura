
public class TesteContas {

	public static void main(String[] args) {
		Conta conta = new Conta(111,111);
		Conta conta2 = new Conta(222, 222);
		ContaCorrente cc = new ContaCorrente(333, 333);
		ContaPoupanca cp = new ContaPoupanca(444, 0);
		
		conta.deposita(100);
		System.out.println("valor da conta depois do deposito " + conta.getSaldo());
		
		conta.sacar(50);
		System.out.println("valor da conta depois do saque " + conta.getSaldo());
		
		conta.transferir(50, conta2);
		System.out.println("Valor da conta 1 apos transferencia " + conta.getSaldo());
		System.out.println("Valor da conta 2 apos transferencia " + conta2.getSaldo());
		
		cc.deposita(100);
		System.out.println("Valor da CC após deposito " + cc.getSaldo());
		
		cc.sacar(50);
		System.out.println("Valor da CC após saque " + cc.getSaldo());
		
		cc.transferir(10, conta2);
		System.out.println("Valor da CC após transferir " + cc.getSaldo());
		
	}

}
